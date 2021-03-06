package logicaDeNegocios;
import java.util.*;
import java.text.*;
/**
 * Almacena los datos de un Viaje ;
 * @author Mariell, Moises, Jorge
 * @version 2.0
 */
public class Viaje
{
  private Direccion puntoDeSalida;
  private Direccion destino;
  private Chofer chofer;// despues
  private int kilometrajeInicial;
  private int kilometrajeFinal;
  private String estado;//Inicia el confeccio
  private ArrayList<Persona> pasajeros;
  private Date fechaDeInicio;
  private Date fechaDeFinalizacion;
  private Date fechaDeSolicitud;
  private static int scantViajes;
  private String identificador;
  private Vehiculo vehiculo;//despues
   /**
   * Construcotor de la clase Viaje
   */
  Viaje(Direccion pPuntoDeSalidad, Direccion pDestino, int pKilometrajeInicial,
  int pKilometrajeFinal, ArrayList<Persona> pPasajeros, Date pFechaDeInicio,
  Date pFechaDeFinalizacion, Date pFechaDeSolicitud){
     setPasajeros(pPasajeros);
     setPuntoDeSalida(pPuntoDeSalidad);
     setDestino(pDestino);
     setKilometrajeInicial(pKilometrajeInicial);
     setKilometrajeFinal(pKilometrajeFinal);
     setFechaDeInicio(pFechaDeInicio);
     setFechaDeFinalizacion(pFechaDeFinalizacion);
     setFechaDeSolicitud(pFechaDeSolicitud);
     scantViajes++;
     setIdentificador();
  }
  private void setVehiculo(Vehiculo pVehiculo){
    vehiculo = pVehiculo;
  }
  public Vehiculo getVehiculo(){
    return vehiculo;
  }
  private void setIdentificador(){
    identificador = "VIA-"+scantViajes;
  }
  public String getIdentificado(){
    return identificador;
  }
  public void setFechaDeSolicitud(Date pFechaDeSolicitud){
    fechaDeSolicitud= pFechaDeSolicitud;
  }
  public Date getFechaDeSolicitud(){
    return fechaDeSolicitud;
  }
  public void setFechaDeInicio(Date pFechaDeInicio ){
    fechaDeInicio= pFechaDeInicio;
  }
  public Date getFechaDeInicio(){
    return fechaDeInicio;
  }
  public void setFechaDeFinalizacion(Date pFechaDeFinalizacion ){
    fechaDeFinalizacion= pFechaDeFinalizacion;
  }
  public Date getFechaDeFinalizacion(){
    return fechaDeFinalizacion;
  }
  public void setPasajeros(ArrayList<Persona> pPasajeros){
    pasajeros= pPasajeros;
  }
  public ArrayList<Persona> getPasajeros(){
    return pasajeros;
  }
  public void setEstado(String pEstado){
    estado= pEstado;
  }
  public String getEstado(){
    return estado;
  }
  public void setKilometrajeFinal(int pKilometrajeFinal){
    kilometrajeFinal= pKilometrajeFinal;
  }
  public int getKilometrajeFinal(){
    return kilometrajeFinal;
  }
  public void setKilometrajeInicial(int pKilometrajeInicial){
    kilometrajeInicial= pKilometrajeInicial;
  }
  public int getKilometrajeInicial(){
    return kilometrajeInicial;
  }
  public void setChofer(Chofer pChofer){
    chofer= pChofer;
  }
  public Chofer getChofer(){
    return chofer;
  }
  public void setDestino(Direccion pDestino){
    destino= pDestino;
  }
  public Direccion getDestino(){
    return destino;
  }
  public void setPuntoDeSalida(Direccion pPuntoDeSalida){
    puntoDeSalida=pPuntoDeSalida;
  }
  public Direccion getPuntoDeSalida(){
    return puntoDeSalida;
  }
}
