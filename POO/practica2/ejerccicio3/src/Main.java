import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Creamos Los empleados

        ArrayList<Empleado> empleados = new ArrayList<>();

        ArrayList<Empleado> empleadosdeJefe = new ArrayList<>();

        Empleado emp1 = new Empleado("Juan", 30, 3000);
        Empleado emp2 = new Empleado("Ana", 28, 3200);
        Empleado emp3 = new Empleado("Luis", 35, 3500);
        Directivo dir1 = new Directivo("Maria", 40, 5000, "Gerente", empleadosdeJefe);

        empleados.add(dir1);
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleadosdeJefe.add(emp1);

        // Creamos Los clientes

        ArrayList<Cliente> clientes = new ArrayList<>();

        Cliente cli1 = new Cliente("Carlos", 40, 123456789);
        Cliente cli2 = new Cliente("Marta", 32, 987654321);
        clientes.add(cli1);
        clientes.add(cli2);

        // Creamos la empresa

        ArrayList<Empresa> empresas = new ArrayList<>();

        Empresa empresa1 = new Empresa("Tech Solutions", clientes, empleados);

        empresas.add(empresa1);

        // Mostramos la informacion de la empresa


        for (Empresa emp : empresas) {
            System.out.println("Empresa: " + emp.getNombre());
            System.out.println("---------------------");
            System.out.println("Clientes:");
            System.out.println("---------------------");
            for (Cliente cli : emp.getListaClientes()) {
                System.out.println("---------------------");
                cli.mostrar();
                System.out.println("---------------------");
            }
            System.out.println("Empleados:");
            for (Empleado empleado : emp.getListaEmpleados()) {
                System.out.println("---------------------");
                empleado.mostrar();

                if (empleado instanceof Empleado) {
                    ((Empleado) empleado).calcularSalario();
                }
                System.out.println("---------------------");
            }
        }


        // directivo con mas gente a su cargo

        for (Empresa emp : empresas) {
            for (Empleado empleado : emp.getListaEmpleados()) {
                if (empleado instanceof Directivo) {
                    Directivo directivo = (Directivo) empleado;
                    System.out.println("Directivo: " + directivo.getNombre() + " tiene a su cargo " + directivo.getSubordinado().size() + " empleados.");
                }
            }
        }





    }
}