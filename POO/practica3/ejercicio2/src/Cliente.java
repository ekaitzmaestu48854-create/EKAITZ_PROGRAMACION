import java.util.ArrayList;

public class Cliente extends Persona{
    private ArrayList<Mascota> mascotaAsignada;

    public Cliente(String nombre, String direccion, String telefono, ArrayList<Mascota> mascotaAsignada) {
        super(nombre, direccion, telefono);
        this.mascotaAsignada = mascotaAsignada;
    }

    public ArrayList<Mascota> getMascotaAsignada() {
        return mascotaAsignada;
    }

    public void setMascotaAsignada(ArrayList<Mascota> mascotaAsignada) {
        this.mascotaAsignada = mascotaAsignada;
    }

}
