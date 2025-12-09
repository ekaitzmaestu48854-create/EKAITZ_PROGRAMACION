import java.util.*;

public class Main {
    private static Scanner teclado = new Scanner(System.in);
    private static String [] jugadores = {"Jon", "Urtzi", "Ekaitz Maestu", "Ekaitz Ruiz", "Aritz", "Josemi"};
    private static String [] roles = {"PORTERO", "DEFENSA", "CENTROCAMPISTA", "DELANTERO"};


    public static void main(String[] args) {
     Set <String> Jugadoresdisponibles = new HashSet<>();

        for (String jugador : jugadores) {
            Jugadoresdisponibles.add(jugador);
        }

        for (String rol : roles) {
            System.out.println("Seleccione un jugador para el rol de " + rol + ":");
            for (String jugador : Jugadoresdisponibles) {
                System.out.println("- " + jugador);
            }
            String seleccionado = null;
            while (!Jugadoresdisponibles.contains(seleccionado)) {
                seleccionado = teclado.nextLine();
                if (Jugadoresdisponibles.contains(seleccionado)) {
                    Jugadoresdisponibles.remove(seleccionado);
                    System.out.println(seleccionado + " ha sido asignado como " + rol + ".");
                    break;
                } else {
                    System.out.println("Jugador no disponible. Por favor, seleccione otro jugador:");
                }
            }

        }
        }
    }
