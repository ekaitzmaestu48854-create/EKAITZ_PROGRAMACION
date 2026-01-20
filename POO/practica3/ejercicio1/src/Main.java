import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Libros> libros = new ArrayList<>();
    private static ArrayList<Alumno> alumnos = new ArrayList<>();
    private static ArrayList<Autor> autores = new ArrayList<>();

    public static void main(String[] args) {
        IntroducirAutores();
        IntroducirLibros();
        IntroducirAlumnos();



        menu();

    }

    public static void menu() {
        int opcion;
        do {
            System.out.println("Menú de la Biblioteca:");
            System.out.println("1. Alquilar Libro");
            System.out.println("2. Devolver Libro");
            System.out.println("3. Mostrar Datos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer
            switch (opcion) {
                case 1:
                    alquilarLibro();
                    break;
                case 2:
                    devolverLibro();
                    break;
                case 3:
                    mostrarDatos();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }

    public static void IntroducirAutores() {
        Autor autor1 = new Autor("Gabriel Garcia Marquez", "06/03/1927", "Aracataca");
        Autor autor2 = new Autor("Isabel Allende", "02/08/1942", "Lima");
        Autor autor3 = new Autor("Mario Vargas Llosa", "28/03/1936", "Arequipa");
        autores.add(autor1);
        autores.add(autor2);
        autores.add(autor3);

    }

    public static void IntroducirLibros() {
        Libros libro1 = new Libros("Cien Años de Soledad", "Sudamericana", 417, 3, new ArrayList<>());
        libro1.getAutores().add(autores.get(0));
        Libros libro2 = new Libros("La Casa de los Espíritus", "Plaza & Janés", 350, 3, new ArrayList<>());
        libro2.getAutores().add(autores.get(1));
        Libros libro3 = new Libros("La Ciudad y los Perros", "Seix Barral", 276, 3, new ArrayList<>());
        libro3.getAutores().add(autores.get(2));
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
    }

    public static void IntroducirAlumnos() {
        Alumno alumno1 = new Alumno("Juan Perez", "01/01/2000", "Madrid", "12345678A", new ArrayList<>());
        Alumno alumno2 = new Alumno("Maria Lopez", "02/02/2001", "Barcelona", "87654321B", new ArrayList<>());
        alumnos.add(alumno1);
        alumnos.add(alumno2);

    }

    public static void alquilarLibro() {
        System.out.println("Seleccione el alumno que alquila el libro:");

        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println((i + 1) + ". " + alumnos.get(i).getNombre());
        }
        int alumnoIndex = sc.nextInt() - 1;
        sc.nextLine();
        System.out.println("Seleccione el libro a alquilar:");
        for (int i = 0; i < libros.size(); i++) {
            System.out.println((i + 1) + ". " + libros.get(i).getTitulo());
        }
        int libroIndex = sc.nextInt() - 1;
        sc.nextLine();
        Alumno alumno = alumnos.get(alumnoIndex);
        Libros libro = libros.get(libroIndex);
        if (libro.getNumeroEjemplares() > 0) {
            alumno.getLibrosAlquilados().add(libro);
            libro.setNumeroEjemplares(libro.getNumeroEjemplares() - 1);
            System.out.println("Libro alquilado con éxito.");
        } else {
            System.out.println("No hay ejemplares disponibles para este libro.");
        }

    }

    public static void devolverLibro() {
     System.out.println("Seleccione le alumno:");
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println((i + 1) + ". " + alumnos.get(i).getNombre());
        }
        int alumnoIndex = sc.nextInt() - 1;
        sc.nextLine();
        Alumno alumno = alumnos.get(alumnoIndex);
        if (alumno.getLibrosAlquilados().isEmpty()) {
            System.out.println("El alumno no tiene libros alquilados.");
            return;
        }
        System.out.println("Seleccione el libro a devolver:");
        for (int i = 0; i < alumno.getLibrosAlquilados().size(); i++) {
            System.out.println((i + 1) + ". " + alumno.getLibrosAlquilados().get(i).getTitulo());
        }
        int libroIndex = sc.nextInt() - 1;
        sc.nextLine();
        Libros libro = alumno.getLibrosAlquilados().get(libroIndex);
        alumno.getLibrosAlquilados().remove(libro);
        libro.setNumeroEjemplares(libro.getNumeroEjemplares() + 1);
        System.out.println("Libro devuelto con éxito.");
    }

    public static void mostrarDatos() {
        System.out.println("Datos de Alumnos y sus Libros Alquilados:");
        for (Alumno alumno : alumnos) {
            alumno.mostrarInfo();
            System.out.println("==========");
        }
    }




}