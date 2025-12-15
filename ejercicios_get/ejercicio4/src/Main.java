import java.util.LinkedHashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static LinkedHashMap<String, Integer> telefono = new LinkedHashMap<>();
    public static void main(String[] args) {
        Menu();
    }

    public static void AnadirNumero(){
        String nombre;
        int numero;
        boolean continuar = false;
        sc.nextLine();
        do {
            System.out.println("Introduce el nombre: ");
            nombre = sc.nextLine();
            System.out.println("Introduce el numero: ");
            numero = sc.nextInt();

            telefono.put(nombre, numero);

            System.out.println("¿Quieres añadir otro numero? (s/n)");
            continuar = sc.nextBoolean();
            sc.nextLine(); // Limpiar el buffer

        }while (continuar == true);
    }

    public static void BuscarNumero(){
        int numeroBuscado;
        System.out.println("Introduce el numero a buscar: ");
        numeroBuscado = sc.nextInt();

        for (String nombre : telefono.keySet()) {
            if (telefono.isEmpty()) {
                System.out.println("La agenda esta vacia");
            } else if (telefono.equals(numeroBuscado)) {
                System.out.println("El numero " + numeroBuscado + " pertenece a " + nombre);
            }
        }


    }

    public static void Menu(){
        int opcion;


        System.out.println("---Menu---" + "\n" +
                "1. Añadir Numero" + "\n" +
                "2. Borrar un numero" + "\n" +
                "3. Buscar un numero" + "\n" +
                "4. Borrar por nombre" + "\n" +
                "5. Buscar por nombre" + "\n" +
                "6. Salir");
        System.out.println("Elige una opcion: ");
        opcion = sc.nextInt();

        switch (opcion){
            case 1: AnadirNumero();

                break;
            case 2:

                break;
            case 3: BuscarNumero();

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion no valida");
        }

    }
}