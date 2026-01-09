import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private  static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
          String  codigo;
          String  nombre;
          String  domicilio;
          String  telefono;


          System.out.println("Cuantos alumnos desea ingresar? ");
          int cantidadAlumnos = Integer.parseInt(sc.nextLine());
          Datos_Alumnos[] listaAlumnos = new Datos_Alumnos[cantidadAlumnos];

            for (int i = 0; i < cantidadAlumnos; i++) {
                System.out.println("Ingrese el codigo del alumno " + (i + 1) + ": ");
                codigo = sc.nextLine();
                System.out.println("Ingrese el nombre del alumno " + (i + 1) + ": ");
                nombre = sc.nextLine();
                System.out.println("Ingrese el domicilio del alumno " + (i + 1) + ": ");
                domicilio = sc.nextLine();
                System.out.println("Ingrese el telefono del alumno " + (i + 1) + ": ");
                telefono = sc.nextLine();

                listaAlumnos[i] = new Datos_Alumnos(codigo, nombre, domicilio, telefono);
            }

            System.out.println("Buscar alumno por codigo: ");
            String codigoBuscar = sc.nextLine();

            for (int i = 0; i < cantidadAlumnos; i++) {
                if (listaAlumnos[i].getCodigo().equals(codigoBuscar)) {
                    System.out.println("Alumno encontrado:");
                    System.out.println("Codigo: " + listaAlumnos[i].getCodigo());
                    System.out.println("Nombre: " + listaAlumnos[i].getNombre());
                    System.out.println("Domicilio: " + listaAlumnos[i].getDomicilio());
                    System.out.println("Telefono: " + listaAlumnos[i].getTelefono());
            }

            }







    }
}
