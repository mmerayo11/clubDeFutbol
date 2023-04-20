
/**
 * Write a description of class jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jugador
{
    // instance variables - replace the example below with your own
    private String nombre;
    
    private String posicion;
    
    private camiseta cami;

    public jugador(String nombreJugador, String posicionJugador, camiseta camiseta) {
        nombre = nombreJugador;
        posicion = posicionJugador;
        cami = camiseta;
    }
    
     public String getNombre(){
        return nombre;    
    }
    
    public String getPosicion(){
        return posicion;
    }
    
    public camiseta getCamiseta(){
        return cami;
    }
    
    public void setNombre(String nombreJugador) {
        nombre = nombreJugador;
    }
    
    public void setPosicion(String posicionJugador) {
        posicion = posicionJugador;
    }
    
    public void setCamiseta(camiseta camiseta) {
        cami = camiseta;
    }
    
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre + ", posición: " + posicion + ", Camiseta: " + cami);
    }
}
