package logicaDeNegocios;
import java.util.*;
import java.text.*;

/**
 * Almacena los datos de una licencia
 * @autor Moises
 * @version 1.0
 */
public class Licencia{
  // instance variables - replace the example below with your own
  private int idDeLicencia;
  private Date fechaDeEmision;
  private String tipo;
  private Date fechaDeExpiracion;
  /**
   * Construcotor de la clase Licencia
   */
  public Licencia(int pIdDeLicencia, Date pFechaDeEmision, String pTipo, Date pFechaDeExpiracion){
    setIdDeLicencia(pIdDeLicencia);
    setFechaDeEmision(pFechaDeEmision);
    setTipo(pTipo);
    setFechaDeExpiracion(pFechaDeExpiracion);
  }
  public int getIdDeLicencia(){
    return idDeLicencia;
  }
  public Date getFechaDeEmision(){
    return fechaDeEmision;
  }
  public String getTipo(){
    return tipo;
  }
  public Date getFechaDeExpiracion(){
    return fechaDeExpiracion;
  }
  public void setIdDeLicencia(int pIdDeLicencia){
    idDeLicencia = pIdDeLicencia;
  }
  public void setFechaDeEmision(Date pFechaDeEmision){
    fechaDeEmision = pFechaDeEmision;
  }
  public void setTipo(String pTipo){
    tipo = pTipo;
  }
  public void setFechaDeExpiracion(Date pFechaDeExpiracion){
    fechaDeExpiracion = pFechaDeExpiracion;
  } 
}
