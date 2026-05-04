package Modelo;

import java.time.LocalDate;

public class Vuelo {
    private String cod_vuelo;
    private LocalDate fecha_salida;
    private String destino;
    private String origen;

    public Vuelo(String cod_vuelo, LocalDate fecha_salida, String destino, String origen) {
        this.cod_vuelo = cod_vuelo;
        this.fecha_salida = fecha_salida;
        this.destino = destino;
        this.origen = origen;
    }

    public String getCod_vuelo() {
        return cod_vuelo;
    }

    public void setCod_vuelo(String cod_vuelo) {
        this.cod_vuelo = cod_vuelo;
    }

    public LocalDate getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(LocalDate fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "cod_vuelo='" + cod_vuelo + '\'' +
                ", fecha_salida=" + fecha_salida +
                ", destino='" + destino + '\'' +
                ", origen='" + origen + '\'' +
                '}';
    }
}
