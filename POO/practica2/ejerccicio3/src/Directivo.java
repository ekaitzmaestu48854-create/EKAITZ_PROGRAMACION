import java.util.List;

public class Directivo extends Empleado {

    protected String categoria;

    private List<Empleado> subordinado;

    public Directivo(String nombre, int edad, int sueldo_Bruto, String categoria, List<Empleado> subordinado) {
        super(nombre, edad, sueldo_Bruto);
        this.categoria = categoria;
        this.subordinado = subordinado;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public List<Empleado> getSubordinado() {
        return subordinado;

    }

    public void setSubordinado(List<Empleado> subordinado) {
        this.subordinado = subordinado;
    }

    public void mostrar(){
        super.mostrar();
        System.out.println("Categoria: " + categoria);
        System.out.println("Subordinados: ");
        for (Empleado emp : subordinado) {
            System.out.println("- " + emp.getNombre());
        }
    }
}
