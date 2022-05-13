
package sistema;


public class Satelite {
    
    String nombre;
    double radio;
    double gravedad;

    public Satelite(String nombre, double radio, double gravedad) {
        
        this.nombre = nombre;
        this.radio = radio;
        this.gravedad = gravedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    
    
    @Override
    public String toString() {
        
        String s = "";
        
        s += "\nEl satelite " + this.nombre + " orbita una distancia de " + this.radio + " su planeta.\n" + "tiene una gravedad de "
                + this.gravedad + ".\n\n" ;
        
        return s;
    }
    
    
}
