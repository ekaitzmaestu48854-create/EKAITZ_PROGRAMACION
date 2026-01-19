import java.util.ArrayList;

public class Alumno extends Persona{
    private String DNI;
    private ArrayList<Libros> librosAlquilados = new ArrayList<>();

    public Alumno(String nombre, String fechaNacimiento, String lugarNacimiento, String DNI, ArrayList<Libros> librosAlquilados) {
        super(nombre, fechaNacimiento, lugarNacimiento);
        this.DNI = DNI;
        this.librosAlquilados = librosAlquilados;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public ArrayList<Libros> getLibrosAlquilados() {
        return librosAlquilados;
    }

    public void setLibrosAlquilados(ArrayList<Libros> librosAlquilados) {
        this.librosAlquilados = librosAlquilados;
    }

    public void mostrarInfo() {
        System.out.println("Alumno:");
        super.mostrarInfo();
        System.out.println("DNI: " + DNI);
        System.out.println("Libros Alquilados:");
        for (Libros libro : librosAlquilados) {
            libro.mostrarInfo();
            System.out.println("---");
        }

    }



}
