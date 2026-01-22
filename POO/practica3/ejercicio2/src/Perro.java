import java.util.ArrayList;

public class Perro extends Mascota{
    public Perro(int codigo, String nombre, String raza, String fechaNacimiento, String tipo, String sexo, double longitud, double peso, String colorPelo, ArrayList<Veterinario> veterinarioAsignado) {
        super(codigo, nombre, raza, fechaNacimiento, tipo, sexo, longitud, peso, colorPelo, veterinarioAsignado);
    }

}
