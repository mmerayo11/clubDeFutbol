
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
    
     public String getNombreJugador(){
        return nombre;    
    }
    
    public String getPosicionJugador(){
        return posicion;
    }
    
    public camiseta getCamiseta(){
        return cami;
    }
}
