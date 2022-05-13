
package sistema;


public class Planeta extends CuerpoCeleste{

    private double periodo_orbital;
    private double velocidad_orbital;
    private double radio_orbital;
    private double periodo_rotacional;
    private String composicion_atmosfera;
    private Satelite satelites[];

    public Planeta(String nombre, double diametro, double superficie, double volumen, double masa, int densidad, double gravedad, int temperatura,
                              double periodo_orbital, double velocidad_orbital, double radio_orbital, double periodo_rotacional, String composicion_atmosfera) {
        
        super(nombre, diametro, superficie, volumen, masa, densidad, gravedad, temperatura);
        
        this.periodo_orbital = periodo_orbital;
        this.velocidad_orbital = velocidad_orbital;
        this.radio_orbital = radio_orbital;
        this.periodo_rotacional = periodo_rotacional;
        this.composicion_atmosfera = composicion_atmosfera;
        this.satelites = new Satelite[0];
    }

    public void setSatelites(Satelite[] satelites) {
        this.satelites = satelites;
    }
    
    
     public void setSatelite(Satelite satelite) { //SI QUIERO AÑADIR UN SATELITE Y NO UNA LISTA
        
         Satelite auxiliar[] = new Satelite[this.satelites.length + 1];
         
         for (int i = 0; i < this.satelites.length; i++) {
             
             auxiliar[i] = satelites[i]; //EN CASO DE TIERRA EN satelites[i] TENGO EL VALOR DE LUNA Y LO ALMACENO EN auxiliar[i]
         }
         
         auxiliar[auxiliar.length-1] = satelite; //GUARDO LUNA
         this.satelites = auxiliar;
    }

    public Satelite[] getSatelites() {
        return satelites;
    }
     
   
    @Override
    public String toString() {
        
        String s = " ";
        
        s += "\nEl planeta " + getNombre() +" tiene las caracteristicas siguientes:\n\n";
        
        s += " - Diametro: " + getDiametro() + " KM. \n";
        
        s += " - Superficie: " + getSuperficie() + " KM*2. \n";
        
        s += " - Volumen: " + getVolumen() + " KM*3. \n";
        
        s += " - Masa: " + getMasa() + " KG. \n";
       
        if ("Saturno".equals(getNombre())) {
           
            s += " - Densidad: " + getDensidad() + " KG/M*3. \n";
       
        }else{
            
             s += " - Densidad: " + getDensidad() + " G/CM*3. \n";
        }
        
        s += " - Gravedad: " + getGravedad() + " M/S*2. \n";
        
        s += " - Temperatura: " + getTemperatura() + " °C. \n";
        
        s += " - Periodo Orbital: " + this.periodo_orbital + " dias. \n";
        
        s += " - Velocidad Orbital: " + this.velocidad_orbital + " KM/S. \n";
        
        s += " - Radio Orbital: " + this.radio_orbital + " KM/S. \n";
        
        s += " - Periodo Rotacional: " + this.periodo_rotacional + " dias. \n";
        
        s += " - La composicion de la atmosfera es: " + this.composicion_atmosfera + "\n\n";
        
        return s;
    }
    
    
    
}
