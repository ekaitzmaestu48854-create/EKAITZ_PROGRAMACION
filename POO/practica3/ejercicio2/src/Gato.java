import java.util.ArrayList;

public class Gato extends Mascota{
    public Gato(int codigo, String nombre, String raza, String fechaNacimiento, String tipo, String sexo, double longitud, double peso, String colorPelo, ArrayList<Veterinario> veterinarioAsignado) {
        super(codigo, nombre, raza, fechaNacimiento, tipo, sexo, longitud, peso, colorPelo, veterinarioAsignado);
    }
}

