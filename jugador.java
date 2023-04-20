
/**
 * Write a description of class jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador
{
    // instance variables - replace the example below with your own
    private String nombre;
    
    private String posicion;
    
    private Camiseta cami;

    public Jugador(String nombreJugador, String posicionJugador) {
        nombre = nombreJugador;
        posicion = posicionJugador;
    }
    
     public String getNombre(){
        return nombre;    
    }
    
    public String getPosicion(){
        return posicion;
    }
    
    public Camiseta getCamiseta(){
        return cami;
    }
    
    public void setNombre(String nombreJugador) {
        nombre = nombreJugador;
    }
    
    public void setPosicion(String posicionJugador) {
        posicion = posicionJugador;
    }
    
    public void setCamiseta(Camiseta camiseta) {
        cami = camiseta;
    }
    
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre + ", posición: " + posicion + ", Dorsal camiseta: "
        + cami.getDorsal() + ", Color camiseta: " + cami.getColor());
    }
}
