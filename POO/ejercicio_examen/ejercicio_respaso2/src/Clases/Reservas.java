package Clases;


import java.time.LocalDate;
import java.util.ArrayList;

public class Reservas {
    private LocalDate fecha;
    private ArrayList<Socio> socios;
    private ArrayList<Clase> clases;

    public Reservas(LocalDate fecha, ArrayList<Clase> clases, ArrayList<Socio> socios) {
        this.fecha = fecha;
        this.clases = clases;
        this.socios = socios;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Socio> getSocios() {
        return socios;
    }

    public void setSocios(ArrayList<Socio> socios) {
        this.socios = socios;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }
}


