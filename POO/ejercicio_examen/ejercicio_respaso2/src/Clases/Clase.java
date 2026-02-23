package Clases;

public class Clase {
    private String nombreActidad;
    private float precio;
    private int capacidadMaxima;

    public Clase(String nombreActidad, int capacidadMaxima, float precio) {
        this.nombreActidad = nombreActidad;
        this.capacidadMaxima = capacidadMaxima;
        this.precio = precio;
    }

    public String getNombreActidad() {
        return nombreActidad;
    }

    public void setNombreActidad(String nombreActidad) {
        this.nombreActidad = nombreActidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
}
