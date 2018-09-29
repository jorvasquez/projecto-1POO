package herramientas;

import com.sun.mail.smtp.SMTPTransport;
import java.security.Security;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
public class MandarEmail {
    private MandarEmail() {
    }
    /**
     *
     * Enviar email por smtp
     *
     */
    public static void Send(String recipiente, String titulo, String mensaje, String nombreArchivo) throws AddressException, MessagingException {
        Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";

        // Get a Properties object
        Properties props = System.getProperties();
        props.setProperty("mail.smtps.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.port", "465");
        props.setProperty("mail.smtp.socketFactory.port", "465");
        props.setProperty("mail.smtps.auth", "true");

        props.put("mail.smtps.quitwait", "false");

        Session session = Session.getInstance(props, null);

        final MimeMessage msg = new MimeMessage(session);
        DataSource source = new FileDataSource(nombreArchivo);
        // -- Set the FROM and TO fields --
        msg.setFrom(new InternetAddress("correoprogra00@gmail.com"));
        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipiente, false));


        msg.setSubject(titulo);
        msg.setText(mensaje, "utf-8");
        msg.setSentDate(new Date());
        msg.setDataHandler(new DataHandler(source));
        msg.setFileName(nombreArchivo);
        SMTPTransport t = (SMTPTransport)session.getTransport("smtps");

        t.connect("smtp.gmail.com", "correoprogra00", "55544412");
        t.sendMessage(msg, msg.getAllRecipients());      
        t.close();
    }
}