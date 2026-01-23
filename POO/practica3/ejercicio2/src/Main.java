import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static List<Mascota> listaMascotas = new ArrayList<Mascota>();
    private static List<Veterinario> listaVeterinarios = new ArrayList<Veterinario>();
    private static List<Cliente> listaClientes = new ArrayList<Cliente>();

    public static void main(String[] args) {

        agregarMascota();
    }

    public static void agregarMascota() {
        System.out.println("Cuantas mascotas quieres introducir:");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.print("Mascota " + (i + 1) + ": ");

            System.out.println("Ingrese el codigo: ");
            int codigo = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea
            System.out.println("Ingrese el nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese la raza: ");
            String raza = sc.nextLine();
            System.out.println("Ingrese la fecha de nacimiento: ");
            String fechaNacimiento = sc.nextLine();
            System.out.println("Ingrese el tipo (Perro/Gato): ");
            String tipo = sc.nextLine();
            System.out.println("Ingrese el sexo: ");
            String sexo = sc.nextLine();
            System.out.println("Ingrese la longitud: ");
            double longitud = sc.nextDouble();
            System.out.println("Ingrese el peso: ");
            double peso = sc.nextDouble();
            sc.nextLine(); // Consumir el salto de línea
            System.out.println("Ingrese el color del pelo: ");
            String colorPelo = sc.nextLine();

            listaMascotas.add(new Mascota(codigo, nombre, raza, fechaNacimiento, tipo, sexo, longitud, peso, colorPelo, null));

        }

    }

    public static void agregarVeterinario() {
        System.out.println("Cuantas veterinarios quieres introducir:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
        System.out.print("Veterinario " + (i + 1) + ": ");

        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la direcion: ");
        String direccion = sc.nextLine();
        System.out.println("Ingrese el telefono: ");
        String telefono = sc.nextLine();
        System.out.println("Ingrese el dni: ");
        String dni = sc.nextLine();
        System.out.println("Ingrese el numero de la seguridad social: ");
        int numSeguridadSocial = sc.nextInt();

        listaVeterinarios .add(new Veterinario(nombre,direccion,telefono,dni,numSeguridadSocial));



        }
    }


}