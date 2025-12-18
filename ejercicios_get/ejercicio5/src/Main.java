import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner teclado = new Scanner(System.in);
    private static String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private static Map<String, Map<Integer, Integer>> tarjeta = new HashMap<>();

    public static void main(String[] args) {
            tarjeta.put("Enero", new HashMap<>());
            tarjeta.get("Enero").put(1, 1);
            tarjeta.get("Enero").put(12, 20);
            tarjeta.put("Febrero", new HashMap<>());
            tarjeta.get("Febrero").put(3, 15);
            tarjeta.get("Febrero").put(14, 50);

          for (Map.Entry<String, Map<Integer, Integer>> entry : tarjeta.entrySet()) {
              System.out.println("Mes: " + entry.getKey());
              for (Map.Entry<Integer, Integer> m : entry.getValue().entrySet()) {
                    System.out.println("Dia:  " + m.getKey() + " ->  Importe:  " + m.getValue());
              }
          }


          // Importe total del año por meses
          for (Map.Entry<String, Map<Integer, Integer>> entry : tarjeta.entrySet()) {
              int totalMes = 0;
              for (Map.Entry<Integer, Integer> m : entry.getValue().entrySet()) {
                  totalMes += m.getValue();
              }
              System.out.println("Total del mes de " + entry.getKey() + ": " + totalMes);
          }


        }


        public static void Introducir_datos() {
            for (String mes : meses) {
                System.out.println("Te has gastado algo en " + mes + "? (s/n)");
                String respuesta = teclado.nextLine();
                if (respuesta.equalsIgnoreCase("s")) {
                    tarjeta.put(mes, new HashMap<>());
                    while (true) {
                        System.out.println("Introduce el día del gasto (1-31) o 0 para terminar:");
                        int dia = Integer.parseInt(teclado.nextLine());
                        if (dia == 0) {
                            break;
                        }
                        System.out.println("Introduce el importe gastado:");
                        int importe = Integer.parseInt(teclado.nextLine());
                        tarjeta.get(mes).put(dia, importe);
                    }
                } else-if (respuesta.equalsIgnoreCase("n")) {
                    continue;
                } else {
                    System.out.println("Respuesta no válida. Por favor, responde con 's' o 'n'.");
                    mes = mes; // Repetir el mismo mes
                }


            }

        }
    }
