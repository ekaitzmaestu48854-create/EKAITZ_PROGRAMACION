import java.awt.*;
import java.util.Scanner;
import java.util.*;

public class Main {
    private static Scanner teclado = new Scanner(System.in);
    private static Stack<String> pilaLibros = new Stack<>();


    public static void main(String[] args) {
        Menu();
        }



        public static void AñadirLibro(){
            boolean continuar = true;
            String libro;
            String respuesta;

            do {
                System.out.print("Ingresa el nombre del libro: ");
                libro = teclado.nextLine();
                pilaLibros.push(libro);
                System.out.println("Libro añadido: " + libro);

                System.out.print("¿Deseas añadir otro libro? (s/n): ");
                respuesta = teclado.nextLine();

                if (respuesta.equals("s")) {
                    continuar = true;
                } else if (respuesta.equals("n")) {
                    continuar = false;
                } else {
                    System.out.println("Respuesta no válida. Saliendo del proceso de añadir libros.");
                    continuar = false;
                }
            }while (continuar == true);

            Menu();
        }


        public static void ConsultarLibro() {
            if (pilaLibros.isEmpty()) {
                System.out.println("La pila está vacía.");
            } else {
                System.out.println("El libro es : " + pilaLibros.peek());
            }
            esperar(2);
            Menu();
        }

        public static void RetirarLibro(){
        if (pilaLibros.isEmpty()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("El libro retirado es: " + pilaLibros.pop());

        }
        }

        public static void MostrarLibros() {
            if (pilaLibros.isEmpty()) {
                System.out.println("La pila está vacía.");
            } else {
                System.out.println("Libros en la pila:" + pilaLibros);
            }
            Menu();
        }


        public static void FilaVacia() {
            if (pilaLibros.isEmpty()) {
                System.out.println("La pila está vacía.");
            } else {
                System.out.println("La pila no está vacía.");
            }
            Menu();
        }







        public static void Menu(){

        int option = 0;
        try {
            System.out.println("---Menu---" + "\n" +
                    "1. Añadir Libro" + "\n" +
                    "2. Consultar Libro en la parte superior" + "\n" +
                    "3. Retirar el libro en la parte superior" + "\n" +
                    "4. Mostrar todos los libros en la pila" + "\n" +
                    "5. Verificar si la pila esta vacia" + "\n" +
                    "6. Salir");

            System.out.print("Selecciona una opción: ");
            option = teclado.nextInt();
            teclado.nextLine(); // Limpiar el buffer


            switch (option) {
                case 1:
                    AñadirLibro();
                    break;
                case 2:
                    ConsultarLibro();
                    break;
                case 3:
                    RetirarLibro();
                    break;
                case 4:
                    MostrarLibros();
                    break;
                case 5:
                    FilaVacia();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    throw new Exception("Opción no válida. Por favor, selecciona una opción del 1 al 6.");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            Menu();
        }

    }



// Esta funcion no aparece en el ejercicio, es un extra que he querido añadir para testear cosas
// Aun quitando esto el codigo sigue  funcionando perfectamente
    public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            System.out.println("La espera fue interrumpida.");
        }
    }




    }

