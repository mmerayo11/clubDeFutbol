
/**
 * Write a description of class camiseta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class camiseta
{
    // instance variables - replace the example below with your own
    private int dorsal;
    
    private String color;

    /**
     * Constructor for objects of class camiseta
     */
    public camiseta(int numero, String colorCami)
    {
        dorsal = numero;
        color = colorCami;
    }
    
    public int getDorsal(){
        return dorsal;
    }
    
    public void setDorsal(int dorsal){
        this.dorsal = dorsal;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public void imprimirDetalles() {
        System.out.println("Color: " + color + ", Dorsal: " + dorsal);
    }
}
