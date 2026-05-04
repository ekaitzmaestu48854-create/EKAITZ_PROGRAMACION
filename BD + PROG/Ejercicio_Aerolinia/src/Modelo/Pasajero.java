package Modelo;

public class Pasajero {
    private String dni;
    private String nombre;
    private String telefono;
    private Vuelo cod_vuelo;

    public Pasajero(String dni, String telefono, String nombre, Vuelo cod_vuelo) {
        this.dni = dni;
        this.telefono = telefono;
        this.nombre = nombre;
        this.cod_vuelo = cod_vuelo;
    }

    public Pasajero(String dni, String telefono, String nombre) {
        this.dni = dni;
        this.telefono = telefono;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Vuelo getCod_vuelo() {
        return cod_vuelo;
    }

    public void setCod_vuelo(Vuelo cod_vuelo) {
        this.cod_vuelo = cod_vuelo;
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cod_vuelo=" + cod_vuelo +
                '}';
    }
}
