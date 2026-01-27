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
        agregarVeterinario();
        agregarCliente();
        mostrarMascotas();

    }

    public static void agregarMascota() {



        Mascota mascota1 = new Perro(1, "Firulais", "Labrador", "01/01/2020", "Perro", "Macho", 60.0, 20.0, "Marron", new ArrayList<>());
        Mascota mascota2 = new Gato(2, "Michi", "Siames", "05/03/2019", "Gato", "Hembra", 30.0, 5.0, "Blanco", new ArrayList<>());
        listaMascotas.add(mascota1);
        listaMascotas.add(mascota2);



    }

    public static void agregarVeterinario() {

        ArrayList<Mascota> mascotaVeterinario1 = new ArrayList<Mascota>();
        mascotaVeterinario1.add(listaMascotas.get(0));
        mascotaVeterinario1.add(listaMascotas.get(1));


   Veterinario veterinario1 = new Veterinario("JuanPerez", "Calle Falsa 123", "555-1234", "12345678A", 123456789, mascotaVeterinario1);
    listaVeterinarios.add(veterinario1);
    }

    public static void agregarCliente() {

        ArrayList<Mascota> mascotasCliente1 = new ArrayList<Mascota>();
        mascotasCliente1.add(listaMascotas.get(0));
        mascotasCliente1.add(listaMascotas.get(1));

        Cliente cliente1 = new Cliente("MariaLopez", "Avenida Siempre Viva 742", "555-5678", mascotasCliente1);
        listaClientes.add(cliente1);


    }

    public void asignarVeterinarioAMascota(Mascota mascota, Veterinario veterinario) {
        ArrayList<Veterinario> veterinariosAsignados = new ArrayList<Veterinario>();
        veterinariosAsignados.add(listaVeterinarios.get(0));

        


    }




    public static void mostrarMascotas() {
        for (Mascota mascota : listaMascotas) {

            System.out.println("Datos de la mascotas:" + "\n" +
                    "Codigo: " + mascota.getCodigo() + "\n" +
                    "Nombre: " + mascota.getNombre() + "\n" +
                    "Raza: " + mascota.getRaza() + "\n" +
                    "Fecha de Nacimiento: " + mascota.getFechaNacimiento() + "\n" +
                    "Tipo: " + mascota.getTipo() + "\n" +
                    "Sexo: " + mascota.getSexo() + "\n" +
                    "Longitud: " + mascota.getLongitud() + "\n" +
                    "Peso: " + mascota.getPeso() + "\n" +
                    "Color de Pelo: " + mascota.getColorPelo() + "\n" +
                    "Veterinarios Asignados: " + mascota.getVeterinarioAsignado());
        }
    }

    public static void mostrarVeterinarios() {
        for (Veterinario veterinario : listaVeterinarios) {
            System.out.println("Nombre: " + veterinario.getNombre() + ", DNI: " + veterinario.getDni());
        }
    }


    public static void mostrarClientes() {
        for (Cliente cliente : listaClientes) {
            System.out.println("Nombre: " + cliente.getNombre() + ", Telefono: " + cliente.getTelefono());
        }
    }


}