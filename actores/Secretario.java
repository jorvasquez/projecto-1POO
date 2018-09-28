package actores;
import java.util.*;
import java.text.*;
import logicaDeNegocios.*;

/**
 * Write a description of class Secretario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Secretario
{
    /**
     * Constructor for objects of class Secretario
     */
  private String nombre;
  private String departamento;
  private String userName;
  private String telefono; 
  private String password;
  private ArrayList<Persona> persona;

  public Secretario(String pNombre, String departamento, String userName,
  String telefono, String password)
  {
  }
  public void registrarPasajero(String pCedula,String pNombre, Direccion pDireccion, 
  String pCorreoElectronico, String pTelefono,String pProvincia, String pCanton, String pDistrito,
  String pSenias){
    Direccion direccion =new Direccion(pProvincia, pCanton, pDistrito,pSenias);
    Persona persona =new Persona( pCedula, pNombre,direccion, 
    pCorreoElectronico, pTelefono);
  }
  public void buscarIgual(Persona pPersona){
    
  }
  public void settTelefono(String pTelefono){
    telefono=pTelefono;  
  }
  public String setTelefono(){
    return telefono;  
  }
  public void setUserName(String pUserName){
    userName=pUserName;  
  }
  public String setUserName(){
    return userName;  
  }
  public void setDepartamento(String pDepartamento){
    departamento=pDepartamento;  
  }
  public String setDepartamento(){
    return departamento;  
  }
  public void setNombre(String pNombre){
    nombre=pNombre;  
  }
  public String setNombre(){
    return nombre;  
  }
  
}
