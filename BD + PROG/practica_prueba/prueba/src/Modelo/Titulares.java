package Modelo;

public class Titulares {

    private int cod;
    private String nombre;
    private String dni;

    public Titulares(Integer cod, String dni, String nombre) {
        this.cod = cod;
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
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

    @Override
    public String toString() {
        return "Titulares{" +
                "cod=" + cod +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
