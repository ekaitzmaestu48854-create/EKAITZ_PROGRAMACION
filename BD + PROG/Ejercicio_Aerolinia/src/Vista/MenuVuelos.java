package Vista;

import Controladores.AeroliniaControler;
import Modelo.Vuelo;
import Utilidades.EntradaDatos;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Date;

public class MenuVuelos {

    private Scanner sc = new Scanner(System.in);

    public void menuVuelos() throws SQLException {

        System.out.println("------ MENÚ VUELOS  -----");
        System.out.println("1. Crear vuelo");
        System.out.println("2. Modificar vuelo");
        System.out.println("3. Borrar vuelo");
        //System.out.println("4. Listar vuelos");
        System.out.println("5. Salir al menú principal");

        int opcion = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        switch (opcion){
            case 1 -> crearVuelo();
            case 2 -> modificarVuelo();
            case 3 -> borrarVuelo();
            //case 4 -> listarVuelos();
            case 5 -> System.out.println("Saliendo al menú principal...");

            default -> System.out.println("Opción inválida.");
        }

    }

    private void crearVuelo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");



        System.out.println("Introduce el código del vuelo: ");
        String codigo = sc.nextLine();
        System.out.println("Introduce la fecha de salida del vuelo: ");
        String fecha = sc.nextLine();
        LocalDate fechaSalida = LocalDate.parse(fecha, formatter);

        System.out.println("Introduce el destino del vuelo: ");
        String destino = sc.nextLine();
        System.out.println("Introduce la procedencia del vuelo: ");
        String procedencia = sc.nextLine();
        // Aquí se llamaría al controlador para crear el vuelo con los datos ingresados

        AeroliniaControler.añadirVuelo(codigo, fechaSalida, destino, procedencia);
    }

    private void modificarVuelo() throws SQLException {

        System.out.println("\n--- MODIFICAR VUELO ---");

        String codigo = EntradaDatos.leerCadena(sc, "Introduce el código del vuelo a modificar: ");

        if (AeroliniaControler.buscarVueloPorCodigo(codigo) != null) {
            System.out.println("Introduce la nueva fecha de salida del vuelo (dd/MM/yyyy): ");
            String fecha = sc.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaSalida = LocalDate.parse(fecha, formatter);

            System.out.println("Introduce el nuevo destino del vuelo: ");
            String destino = sc.nextLine();
            System.out.println("Introduce la nueva procedencia del vuelo: ");
            String procedencia = sc.nextLine();

            // Aquí se llamaría al controlador para modificar el vuelo con los datos ingresados

            AeroliniaControler.añadirVuelo(codigo, fechaSalida, destino, procedencia);
        } else {
            System.out.println("No se encontró ningún vuelo con el código ingresado.");
        }




    }

    private void borrarVuelo() {
        System.out.println("\n--- BORRAR VUELO ---");
        System.out.println("Introduce el código del vuelo a borrar: ");
        String codigo = sc.nextLine();
        try {
            AeroliniaControler.borrarVuelos(codigo);
            System.out.println("Vuelo borrado exitosamente.");
        } catch (Exception e) {
            System.out.println("Error al borrar el vuelo: " + e.getMessage());
        }
    }

    private void buscarporCodigo() throws SQLException {
        System.out.println("\n--- BUSCAR VUELO POR CÓDIGO ---");
        String codigo = EntradaDatos.leerCadena(sc, "Introduce el código del vuelo a buscar: ");
        AeroliniaControler.buscarVueloPorCodigo(codigo);
    }

}
