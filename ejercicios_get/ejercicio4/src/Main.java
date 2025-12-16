import java.util.LinkedHashMap;
import java.util.Scanner;
import java.lang.String;

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
        String respuesta;


            System.out.println("Introduce el nombre: ");
            nombre = sc.nextLine();
            System.out.println("Introduce el numero: ");
            numero = sc.nextInt();
            sc.nextLine();


            telefono.put(nombre, numero);


            System.out.println("¿Quieres añadir otro numero? (s/n)");
            respuesta = sc.nextLine();


            if (respuesta.equalsIgnoreCase("s")) {
                AnadirNumero();
            } else {
                Menu();
            }

    }


    public static void BorrarNumero(){
        if (telefono.isEmpty()) {
            System.out.println("La agenda está vacía.");
            return;
        }
        System.out.print("¿Qué número desea borrar?: ");
        int numeroBorrar = Integer.parseInt(sc.nextLine());
        for (String key : telefono.keySet()) {
            if (telefono.get(key) == numeroBorrar) {
                telefono.remove(key);
                System.out.println("Número borrado: " + key + " - " + numeroBorrar);
            }
        }
        Menu();
    }

// El Fallo que tenia era que estaba trabajando con Integers y no con int, por lo que al comparar con == no funcionaba
    public static void BuscarNumero() {
        if (telefono.isEmpty()) {
            System.out.println("La agenda está vacía.");
            return;
        }
        System.out.print("¿Qué número desea buscar?: ");
        int numeroBuscar = Integer.parseInt(sc.nextLine());
        for (String key : telefono.keySet()) {
            if (telefono.get(key) == numeroBuscar) {
                System.out.println("Número encontrado: " + key + " - " + telefono.get(key));
                return;
            }
        }
        Menu();
    }


    public static void BorrarporNombre(){
        if (telefono.isEmpty()) {
            System.out.println("La agenda esta vacia");
            return;
        }
        System.out.println("Introduce el nombre que quieres borrar: ");
        String nom = sc.nextLine();

        if (telefono.containsKey(nom)) {
            telefono.remove(nom);
            System.out.println("El contacto " + nom + " ha sido borrado.");
        } else {
            System.out.println("El contacto " + nom + " no existe en la agenda.");
        }

    Menu();
    }


    public static void BuscarPorNombre(){
        if (telefono.isEmpty()) {
            System.out.println("La agenda esta vacia");
            return;
        }
        System.out.println("Introduce el nombre que quieres buscar: ");
        String nom = sc.nextLine();

        if (telefono.containsKey(nom)) {
            System.out.println("El numero de " + nom + " es: " + telefono.get(nom));
        } else {
            System.out.println("El contacto " + nom + " no existe en la agenda.");
        }
    Menu();
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
        sc.nextLine();

        switch (opcion){
            case 1: AnadirNumero();

                break;
            case 2: BorrarNumero();

                break;
            case 3: BuscarNumero();

                break;
            case 4: BorrarporNombre();

                break;
            case 5: BuscarPorNombre();

                break;
            case 6:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion no valida");
        }

    }
}