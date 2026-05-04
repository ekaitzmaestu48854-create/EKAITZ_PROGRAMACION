import java.util.Scanner;
import Vista.MenuVuelos;
import Vista.MenuPasajeros;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    menu();
    }

    public static void menu() {
        System.out.println("--- MENU ---");
        System.out.println("1.Menu Pasajeros");
        System.out.println("2.Menu Vuelos");
        System.out.println("3.Salir");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                MenuPasajeros menuPasajeros = new MenuPasajeros();
                try {
                    menuPasajeros.menuPasajeros();
                } catch (Exception e) {
                    System.out.println("Error en el menú de pasajeros: " + e.getMessage());
                }
                break;
            case 2:
                MenuVuelos menuVuelos = new MenuVuelos();
                try {
                    menuVuelos.menuVuelos();
                } catch (Exception e) {
                    System.out.println("Error en el menú de vuelos: " + e.getMessage());
                }
                break;
            case 3:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción inválida. Por favor, elige una opción válida.");
        }
    }
}