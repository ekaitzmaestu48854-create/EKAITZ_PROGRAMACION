git import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Main {
    private static Scanner teclado = new Scanner(System.in);
    private static Queue<String> nombre = new LinkedList<>();
    private static Queue<String> fecha = new LinkedList<>();

    public static void main(String[] args) {
            SolicitarNombreyfechaproducto();
            Eliminarproductoscaducados();
        }

        public static void SolicitarNombreyfechaproducto() {

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese el nombre del producto:");
                String nombreProducto = teclado.nextLine();
                nombre.add(nombreProducto);

                System.out.println("Ingrese la fecha de vencimiento del producto (dd/MM/yyyy):");
                String fechaVencimiento = teclado.nextLine();
                LocalDate fechaVencimientoDate = LocalDate.parse(fechaVencimiento, dtf);
                fecha.add(fechaVencimiento);
            }

            System.out.println("Productos:" + nombre);
            System.out.println("Fechas de vencimiento:" + fecha);


        }



    public static void Eliminarproductoscaducados() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("\n--- Revisión de Caducidad ---");
        System.out.println("Ingrese la fecha actual para comparar:");
        String fechaIngresada = teclado.nextLine();
        LocalDate fechaReferencia = LocalDate.parse(fechaIngresada, dtf);


        int tamañoOriginal = fecha.size();

        for (int i = 0; i < tamañoOriginal; i++) {

            String f = fecha.poll();
            String n = nombre.poll();

            LocalDate fechaProducto = LocalDate.parse(f, dtf);


            if (fechaProducto.isBefore(fechaReferencia) || fechaProducto.isEqual(fechaReferencia)) {
                System.out.println("El producto " + n + " (" + f + ") ha caducado y será eliminado.");

            } else {

                fecha.add(f);
                nombre.add(n);
            }
        }

        System.out.println("-----------------------------");
        System.out.println("Productos actualizados: " + nombre);
        System.out.println("Fechas de vencimiento actualizadas: " + fecha);
    }
    }
