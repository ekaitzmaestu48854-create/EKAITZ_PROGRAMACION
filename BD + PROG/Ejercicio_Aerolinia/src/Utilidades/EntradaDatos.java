package Utilidades;

public class EntradaDatos {
    public static int leerEntero(java.util.Scanner sc, String mensaje) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            try {
                numero = Integer.parseInt(sc.nextLine());
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, introduce un número entero.");
            }
        }
    }

    public static double leerDouble(java.util.Scanner sc, String mensaje) {
        double numero;
        while (true) {
            System.out.print(mensaje);
            try {
                numero = Double.parseDouble(sc.nextLine());
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, introduce un número decimal.");
            }
        }
    }

    public static String leerCadena(java.util.Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }
}
