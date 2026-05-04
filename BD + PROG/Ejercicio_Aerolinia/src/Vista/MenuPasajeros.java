package Vista;

import Controladores.AeroliniaControler;
import Modelo.Pasajero;
import Modelo.Vuelo;
import Utilidades.EntradaDatos;

import java.sql.SQLException;
import java.util.Scanner;


public class MenuPasajeros {

    private Scanner sc = new Scanner(System.in);

    public void menuPasajeros() throws SQLException {
        System.out.println("=== Menú de Pasajeros ===");
        System.out.println("1. Agregar Pasajero");
        System.out.println("2. Eliminar Pasajero");
        //System.out.println("3. Listar Pasajeros");
        System.out.println("4. Modificar Pasajero");
        System.out.println("5. Volver al Menú Principal");
        int opcion = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        switch (opcion) {
            case 1 -> agregarPasajero();
            case 2 -> modificarPasajero();
            //case 3 -> System.out.println("Funcionalidad de listar pasajeros no implementada aún.");
            case 4 -> eliminarPasajero();
            case 5 -> System.out.println("Volviendo al menú principal...");
            default -> System.out.println("Opción inválida. Por favor, elige una opción válida.");
        }

    }

    private void agregarPasajero() throws SQLException {
        System.out.println("Ingresa el DNI del pasajero:");
        String dni = sc.nextLine();
        System.out.println("Ingresa el nombre del pasajero:");
        String nombre = sc.nextLine();
        System.out.println("Ingresa el telefono del pasajero:");
        String telefono = sc.nextLine();
        String codigoVuelo = EntradaDatos.leerCadena(sc, "Ingresa el código del vuelo al que se asignará el pasajero: ");
        Vuelo vuelo = AeroliniaControler.buscarVueloPorCodigo(codigoVuelo);

        // Aquí se llamaría al controlador para agregar el pasajero a la base de datos
        AeroliniaControler.añadirPasajero(dni, nombre, telefono, vuelo);
    }

    public void eliminarPasajero() {
        System.out.println("--- Eliminar pasajero ---");

        String dni = EntradaDatos.leerCadena(sc, "Introduce el DNI del pasajero a eliminar: ");
        try {
            AeroliniaControler.eliminarPasajero(dni);
            System.out.println("Pasajero eliminado exitosamente.");
        } catch (Exception e) {
            System.out.println("Error al eliminar pasajero: " + e.getMessage());
        }
    }

    public void modificarPasajero() throws SQLException {
        System.out.println("--- Modificar pasajero ---");
        Pasajero pasajero = buscarPasajero();

        if (pasajero != null) {
            String nuevoNombre = EntradaDatos.leerCadena(sc, "Introduce el nuevo nombre del pasajero: ");
            String nuevoTelefono = EntradaDatos.leerCadena(sc, "Introduce el nuevo teléfono del pasajero: ");
            try {
                AeroliniaControler.modificarPasajero(pasajero, nuevoNombre, nuevoTelefono);
                System.out.println("Pasajero modificado exitosamente.");
            } catch (Exception e) {
                System.out.println("Error al modificar pasajero: " + e.getMessage());
            }
        } else {
            System.out.println("Pasajero no encontrado.");
        }
    }

    public Pasajero buscarPasajero() throws SQLException {
        System.out.println("--- Buscar pasajero ---");

        String dni = EntradaDatos.leerCadena(sc, "Introduce el DNI del pasajero a buscar: ");
        AeroliniaControler.buscarPasajeroPorDni(dni);
        return null;
    }


}
