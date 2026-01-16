public class Cliente extends Persona{
    protected int telefono;

    public Cliente(String nombre, int edad, int telefono) {
        super(nombre, edad);
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void mostrar(){
        super.mostrar();
        System.out.println("Telefono: " + telefono);
    }
}
