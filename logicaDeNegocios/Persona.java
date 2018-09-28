package logicaDeNegocios;
/**
 * Sirve para agrupar los datos de una persona;
 * @author Moises
 * @version 2.0
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
  public Persona(String pNombre, String pCedula, String pDireccion, 
  String pCorreoElectronico, String pTelefono){
    setNombre(pNombre);
    setCedula(pCedula);
    setDireccion(pDireccion);
    setCorreoElectronico(pCorreoElectronico);
    setTelefono(pTelefono);
  }
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
  /**
  * 
  * Compara dos objetos de la clase Persona.
  */
  public boolean equals(Object o){
    if(this == o)
      return true; 
    if(o==null)
      return false;
    if(this.getClass() != o.getClass())
      return false;
    Persona persona = (Persona) o;
    return this.cedula==persona.getCedula();
  }
}