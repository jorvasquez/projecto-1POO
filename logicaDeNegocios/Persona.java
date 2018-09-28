package logicaDeNegocios;
/**
 * Write a description of class Persona here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Persona{
  // instance variables - replace the example below with your own
  private String nombre;
  private String cedula;
  private String direccion;
  private String correoElectronico;
  private String telefono;
  
  /**
   * Constructor for objects of class Persona
   */
  public Persona(String pNombre, String pCedula, String pDireccion, String pCorreoElectronico, String pTelefono){
    // initialise instance variables
    nombre = pNombre;
    cedula = pCedula;
    direccion = pDireccion;
    correoElectronico = pCorreoElectronico;
    telefono = pTelefono;
  }

  /**
   * An example of a method - replace this comment with your own
   *
   * @param  y  a sample parameter for a method
   * @return    the sum of x and y
   */
  public String getNombre(){
    return nombre;
  }
  public String getCedula(){
    return cedula;
  }
  public String getDireccion(){
    return direccion;
  }
  public String getCorreoElectronico(){
    return correoElectronico;
  }
  public String getTelefono(){
    return telefono;
  }
  public void setNombre(String pNombre){
    nombre = pNombre;
  }
  public void setCedula(String pCedula){
    cedula = pCedula;
  }
  public void setDireccion(String pDireccion){
    direccion = pDireccion;
  }
  public void setCorreoElectronico(String pCorreoElectronico){
    correoElectronico = pCorreoElectronico;
  }
  public void setTelefono(String pTelefono){
    telefono = pTelefono;
  }
}