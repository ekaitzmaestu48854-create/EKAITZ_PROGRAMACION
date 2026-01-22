import java.util.ArrayList;

public class Veterinario extends Persona {
    private String dni;
    private int numSeguridadSocial;
    private ArrayList<Mascota> listaPacientes;

    public Veterinario(String nombre, String direccion, String telefono, String dni, int numSeguridadSocial) {
        super(nombre, direccion, telefono);
        this.dni = dni;
        this.numSeguridadSocial = numSeguridadSocial;
        this.listaPacientes = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNumSeguridadSocial() {
        return numSeguridadSocial;
    }

    public void setNumSeguridadSocial(int numSeguridadSocial) {
        this.numSeguridadSocial = numSeguridadSocial;
    }

    public ArrayList<Mascota> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(ArrayList<Mascota> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

}
