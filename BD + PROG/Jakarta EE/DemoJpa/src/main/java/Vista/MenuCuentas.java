package Vista;

import java.util.Scanner;

public class MenuCuentas {

        private Scanner sc = new Scanner(System.in);

        public static void mostrarMenu() {
            int opcion;
            do {
                System.out.println("=== Menú de Cuentas ===");
                System.out.println("1. Crear cuenta");
                System.out.println("2. Borrar cuenta");
                System.out.println("3. Listar cuentas");
                System.out.println("4. Buscar cuenta por IBAN");
                System.out.println("5. Buscar cuenta por ID");
                System.out.println("6. Modificar cuenta");
                System.out.println("0. Salir");







            } while (opcion != 0);
        }


}
