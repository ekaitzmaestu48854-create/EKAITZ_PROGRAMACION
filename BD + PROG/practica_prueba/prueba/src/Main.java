import Vista.TitularesVista;
/**
 * Clase Main que inicia la aplicación y muestra el menú de titulares.
 * En esta clase se crea una instancia de TitularesVista y se llama al método menu() para mostrar las opciones al usuario.
 * @version 1.0
 * @author [Ekaitz]
 */
import java.util.Scanner;

public class Main {
    private Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        TitularesVista tituVis = new TitularesVista();

        tituVis.menu();


    }

}