
package sistema;


public class Estrella extends CuerpoCeleste{
    
    
    private String galaxia;

    public Estrella(String nombre, double diametro, double superficie, double volumen, double masa, int densidad, double gravedad, int temperatura, String galaxia) {
       
        super(nombre, diametro, superficie,  volumen, masa, densidad, gravedad, temperatura); 
        
        this.galaxia = galaxia;
    }

    @Override
    public String toString() {
       
        String s = "";
        
        s+= "\nLa estrella " + getNombre() + " pertenece a la galaxia " + galaxia + ".\n\n";
       
        s+= "Sus caracteristicas son: \n\n";
       
        s+= " - Diametro: " + getDiametro() + " KM.\n\n";
        
        s+= " - Superficie: " + getSuperficie() + " KM*2.\n\n";
       
        s+= " - Volumen: " + getVolumen() + " KM*3.\n\n";
       
        s+= " - Masa: " + getMasa()+ " Kg.\n\n";
        
        s+= " - Densidad: " + getDensidad() + " Kg/m*3.\n\n";
       
        s+= " - Gravedad: " + getGravedad() + " m/s*2\n\n";
       
        s+= " - Temperatura: " + getTemperatura() + " °C.\n\n";
        
        return s;
    }
    
    
}

