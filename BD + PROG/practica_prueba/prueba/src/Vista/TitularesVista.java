package Vista;

import Modelo.Titulares;

import java.util.Scanner;

public class TitularesVista {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

    }


    public static void menu(){

        System.out.println("---Menu---");
        System.out.println("1. Agregar Titular");
        System.out.println("2. Eliminar Titular");
        System.out.println("3. Mostrar Titulares");
        System.out.println("4. Salir");

        int opcion = sc.nextInt();

        switch(opcion){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
        }



    }


    public static void agregarTitulares(){

        System.out.println("Introduce el nombre Titular");

        String nombreTitular = sc.next();

        System.out.println("Introduce el dni del Titular");

        String dniTitular = sc.next();







    }


}
