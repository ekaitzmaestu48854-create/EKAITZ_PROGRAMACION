import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static String[] especies = {"Perro", "Gato", "Loro", "Conejo", "Tortuga"};
    private static ArrayList<String> animalesRescatados = new ArrayList<>();
    private static ArrayList<String> cuidadores = new ArrayList<>();
    private static HashMap<String, String> asociarCuidadores = new HashMap<>();
    private static ArrayList<String> colaDeEsperaAdopcion = new ArrayList<>();

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu(){
        System.out.println("---Menu---" + "\n" +
                            "1.Ver especies disponibles" + "\n" +
                            "2.Agregar un nuevo animal al listado de rescatados." + "\n" +
                            "3.Asignar un cuidador a un animal" + "\n" +
                            "4.Pasar un anaimal a la cola de espera de adopcion" + "\n" +
                            "5.Adoptar un animal" + "\n" +
                            "6.Lista todos los animales y sus cuidadores actuales" + "\n" +
                            "7.Salir");

        int respuesta = sc.nextInt();
        switch(respuesta){
            case 1:
                VerEspecies();
                break;
            case 2:
                AgregarAnimal();
                break;
            case 3:
                AsignarCuidador();
                break;
            case 4:
                PasarAColaDeEspera();
                break;
            case 5:
                AdoptarAnimal();
                break;
            case 6:
                ListarAnimalesYCuidadores();
                break;
            case 7:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opcion no valida, intente de nuevo.");
                Menu();
                break;
        }
    }


    public static void VerEspecies(){
        System.out.println("Especies disponibles para rescate:");
        for(String especie : especies){
            System.out.println("- " + especie);
        }
        Menu();
    }

    public static void AgregarAnimal(){
        boolean respuestaAgregada = true;

        do {
            try {
                System.out.println("Ingrese la especie del animal rescatado:");
                String especie = sc.next();

                if (!Arrays.asList(especies).contains(especie)) {
                    respuestaAgregada = false;
                    throw new Exception("Especie no reconocida.");

                } else {
                    animalesRescatados.add(especie);
                    System.out.println("Animal agregado al listado de rescatados.");
                    respuestaAgregada = true;
                }
            } catch (Exception e) {
                System.out.println("Error al agregar el animal: " + e.getMessage());
            }
        }while(respuestaAgregada != true);
        Menu();
    }

    public static void AsignarCuidador(){
        boolean respuestaAsignada = true;
        do {

            System.out.println("Ingrese el nombre del cuidador:");
            String cuidador = sc.next();
            cuidadores.add(cuidador);
            System.out.println("Ingrese la especie del animal a asignar:");
            String especie = sc.next();
            if (animalesRescatados.contains(especie)) {
                asociarCuidadores.put(especie, cuidador);
                System.out.println("Cuidador asignado al animal.");
                respuestaAsignada = true;
            } else {
                System.out.println("El animal no se encuentra en el listado de rescatados.");
                respuestaAsignada = false;
            }
        }while (respuestaAsignada != true);
        Menu();
    }

    public static void PasarAColaDeEspera(){
        boolean respuestaPasarAColaDeEspera = true;
        do {
            System.out.println("Ingrese la especie del animal a pasar a la cola de espera de adopcion:");
            String especie = sc.next();
            if (animalesRescatados.contains(especie)) {
                colaDeEsperaAdopcion.add(especie);
                System.out.println("Animal pasado a la cola de espera de adopcion.");
                respuestaPasarAColaDeEspera = true;
            } else {
                System.out.println("El animal no se encuentra en el listado de rescatados.");
                respuestaPasarAColaDeEspera = false;
            }

        }while(respuestaPasarAColaDeEspera != true);
        Menu();
    }

    public static void AdoptarAnimal(){
        boolean respuestaAdoptada = true;
        do {
            System.out.println("Ingrese la especie del animal a adoptar:");
            String especie = sc.next();
            if (colaDeEsperaAdopcion.contains(especie)) {
                colaDeEsperaAdopcion.remove(especie);
                animalesRescatados.remove(especie);
                asociarCuidadores.remove(especie);
                System.out.println("Animal adoptado con exito.");
                respuestaAdoptada = true;
            } else {
                System.out.println("El animal no se encuentra en la cola de espera de adopcion.");
                respuestaAdoptada = false;
            }
        }while(respuestaAdoptada != true);
        Menu();
    }

    public static void ListarAnimalesYCuidadores(){
        System.out.println("Listado de animales rescatados y sus cuidadores:");
        for(String especie : animalesRescatados){
            String cuidador = asociarCuidadores.getOrDefault(especie, "Sin cuidador asignado");
            System.out.println("- " + especie + ": " + cuidador);
        }
        Menu();
    }



}