
/**
 * Write a description of class Licencia here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Licencia{
  // instance variables - replace the example below with your own
  private int numero;
  private String fechaDeEmision;
  private String tipo;
  private String fechaDeExpiracion;

  /**
   * Constructor for objects of class Licencia
   */
  public Licencia(int pNumero, String pFechaDeEmision, String pTipo, String pFechaDeExpiracion){
      // initialise instance variables
      numero = pNumero;
      fechaDeEmision = pFechaDeEmision;
      tipo = pTipo;
      fechaDeExpiracion = pFechaDeExpiracion;
  }

  /**
   * An example of a method - replace this comment with your own
   *
   * @param  y  a sample parameter for a method
   * @return    the sum of x and y
   */
  public int getNumero(){
    return numero;
  }
  public String getFechaDeEmision(){
    return fechaDeEmision;
  }
  public String getTipo(){
    return tipo;
  }
  public String getFechaDeExpiracion(){
    return fechaDeExpiracion;
  }
  public void setNumero(int pNumero){
    numero = pNumero;
  }
  public void setFechaDeEmision(String pFechaDeEmision){
    fechaDeEmision = pFechaDeEmision;
  }
  public void setTipo(String pTipo){
    tipo = pTipo;
  }
  public void setFechaDeExpiracion(String pFechaDeExpiracion){
    fechaDeExpiracion = pFechaDeExpiracion;
  } 
}