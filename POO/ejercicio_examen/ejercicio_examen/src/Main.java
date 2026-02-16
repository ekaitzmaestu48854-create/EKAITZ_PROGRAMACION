import java.util.Scanner;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

    }


    public static void Generar_Productos() {
        Productos producto1 = new Productos("Coca-Cola", 1.5f, 100);
        Productos producto2 = new Productos("Pepsi", 1.4f, 80);
        Productos producto3 = new Productos("Fanta", 1.3f, 120);
    }

    public static void Alta_Usuarios() {
        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        try{
        System.out.println("Cuantos usuarios quieres añadir?");
        int cantidadUsuarios = sc.nextInt();

        if (cantidadUsuarios <= 0) {
            throw new Exception("El usuario no puede ser menor que 0");
        }

        sc.nextLine(); // Consumir el salto de línea después de leer el número
        for (int i = 0; i < cantidadUsuarios; i++) {
            System.out.println("Introduce el nombre del usuario " + (i + 1) + ":");
            String nombre = sc.nextLine();
            if (nombre.isEmpty()) {
                throw new Exception("El nombre del usuario no puede estar vacío");
            } else if (nombre.length() < 3) {
                throw new Exception("El nombre del usuario debe tener al menos 3 caracteres");
            }
            System.out.println("Introduce el email del usuario " + (i + 1) + ":");
            String email = sc.nextLine();
            if (email.isEmpty()) {
                throw new Exception("El email del usuario no puede estar vacío");
            } else if (!emailPattern.matcher(email).matches()) {
                throw new Exception("El email del usuario no es válido");
            }
            Usuarios usuario = new Usuarios(nombre, email);
        }

        } catch (Exception e) {
            System.out.println("Error al introducir los datos: " + e.getMessage());
        }
    }

    public static void Generar_Pedidos() {

    }



}