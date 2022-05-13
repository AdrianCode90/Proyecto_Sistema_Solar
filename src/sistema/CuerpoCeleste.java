package sistema;

public class CuerpoCeleste {

    private String nombre;
    private double diametro;
    private double superficie;
    private double volumen;
    private double masa;
    private int densidad;
    private double gravedad;
    private int temperatura;

    public CuerpoCeleste(String nombre, double diametro, double superficie, double volumen, double masa, int densidad, double gravedad, int temperatura) {
        this.nombre = nombre;
        this.diametro = diametro;
        this.superficie = superficie;
        this.volumen = volumen;
        this.masa = masa;
        this.densidad = densidad;
        this.gravedad = gravedad;
        this.temperatura = temperatura;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDiametro() {
        return diametro;
    }

    public double getSuperficie() {
        return superficie;
    }

    public double getVolumen() {
        return volumen;
    }

    public double getMasa() {
        return masa;
    }

    public int getDensidad() {
        return densidad;
    }

    public double getGravedad() {
        return gravedad;
    }

    public int getTemperatura() {
        return temperatura;
    }

}
