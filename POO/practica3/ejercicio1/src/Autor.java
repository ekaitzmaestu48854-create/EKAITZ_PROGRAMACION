public class Autor extends Persona {
    public Autor(String nombre, String fechaNacimiento, String lugarNacimiento) {
        super(nombre, fechaNacimiento, lugarNacimiento);
    }

    public void mostrarInfo() {
        System.out.println("Autor:");
        super.mostrarInfo();
    }

}
