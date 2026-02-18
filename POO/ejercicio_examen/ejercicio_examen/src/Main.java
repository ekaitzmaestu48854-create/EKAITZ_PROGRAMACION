import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Usuarios> usuarios = new ArrayList<>();
    private static ArrayList<Productos> productos = new ArrayList<>();
    private static ArrayList<Pedidos> pedidos = new ArrayList<>();
    public static void main(String[] args) {
        Generar_Productos();
        Menu();

    }

    public static void Menu() {
        System.out.println("1. Alta usuarios");
        System.out.println("2. Generar pedidos");
        System.out.println("3. Salir");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                Alta_Usuarios();
                break;
            case 2:
                Generar_Pedidos();
                break;
            case 3:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }


    public static void Generar_Productos() {
        Productos producto1 = new Productos("Coca-Cola", 1.5f, 100);
        Productos producto2 = new Productos("Pepsi", 1.4f, 80);
        Productos producto3 = new Productos("Fanta", 1.3f, 120);
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
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
            usuarios.add(usuario);
        }

        } catch (Exception e) {
            System.out.println("Error al introducir los datos: " + e.getMessage());
        }

        Menu();
    }

    public static void Generar_Pedidos() {
        sc.nextLine();

        ArrayList<Usuarios> usuariosPedido = usuarios;
        ArrayList<Productos> productosPedido = new ArrayList<>();

        try {
            System.out.println("con que usuario quieres hacer el pedidio?");
            usuarios.stream()
                    .forEach(usuario -> System.out.println(usuario.getNombre()));

            String nombreUsuario = sc.nextLine();

            if (nombreUsuario.isEmpty()) {
                System.out.println("El nombre del usuario no puede estar vacío");
                return;
            }

            Usuarios usuarioSeleccionado = usuarios.stream()
                    .filter(u -> u.getNombre().equalsIgnoreCase(nombreUsuario))
                    .findFirst()
                    .orElse(null);


            if (usuarioSeleccionado != null) {
                usuariosPedido.add(usuarioSeleccionado);

                System.out.println("Que porducto quieres añadir ");
                for (Productos producto : productos) {
                    System.out.println(producto.getNombre() + " " + producto.getStock());
                }

                String nombreProducto = sc.nextLine();

                if (nombreProducto.isEmpty()) {
                    System.out.println("El nombre del producto no puede estar vacío");
                    return;
                }

                System.out.println("Cuanros productos quieres añadir?");
                int cantidadProductos = sc.nextInt();
                if (cantidadProductos <= 0) {
                    System.out.println("La cantidad de productos no puede ser menor que 0");
                    return;
                }


                    Productos productoSeleccionado = productos.stream()
                            .filter(p -> p.getNombre().equalsIgnoreCase(nombreProducto))
                            .findFirst()
                            .orElse(null);

                productoSeleccionado.setStock(productoSeleccionado.getStock() - cantidadProductos);

                    if (productoSeleccionado != null) {
                        productosPedido.add(productoSeleccionado);

                    Pedidos pedido = new Pedidos(java.time.LocalDate.now(), usuariosPedido, productosPedido);
                    pedidos.add(pedido);

                } else {
                    System.out.println("El producto no existe");
                }
            } else {
                System.out.println("El usuario no existe");
            }



        }catch (Exception e) {
            System.out.println("Error al introducir los datos: " + e.getMessage());
        }

            Menu();
    }



}