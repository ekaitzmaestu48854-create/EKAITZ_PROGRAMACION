import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Cuantas Personas desea ingresar? ");
        int cantidadPersonas = Integer.parseInt(sc.nextLine());
        Persona[] listaPersonas = new Persona[cantidadPersonas];

        try{
        for (int i = 0; i <cantidadPersonas; i++) {

            System.out.println("Ingrese el nombre de la persona " + (i + 1) + ": ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el dia de nacimiento de la persona " + (i + 1) + ": ");
            int dNacimiento = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese el mes de nacimiento de la persona " + (i + 1) + ": ");
            int mNacimiento = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese el año de nacimiento de la persona " + (i + 1) + ": ");
            int aNacimiento = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese la direccion de la persona " + (i + 1) + ": ");
            String direccion = sc.nextLine();
            System.out.println("Ingrese la ciudad de la persona " + (i + 1) + ": ");
            String ciudad = sc.nextLine();
            System.out.println("Ingrese el codigo postal de la persona " + (i + 1) + ": ");
            int codPostal = Integer.parseInt(sc.nextLine());


            if(nombre.isEmpty()){
                throw new Exception("El nombre no puede estar vacio.");
            }
            if (dNacimiento < 1 || dNacimiento > 31){
                throw new Exception("El dia de nacimiento no es valido.");
            }
            if (mNacimiento < 1 || mNacimiento > 12){
                throw new Exception("El mes de nacimiento no es valido.");
            }
            if (aNacimiento < 1920 || aNacimiento > 2024){
                throw new Exception("El año de nacimiento no es valido.");
            }
            if (direccion.isEmpty()){
                throw new Exception("La direccion no puede estar vacia.");
            }
            if (ciudad.isEmpty()){
                throw new Exception("La ciudad no puede estar vacia.");
            }
            if (codPostal < 1000 || codPostal > 99999) {
                throw new Exception("El codigo postal no es valido.");
            }

            listaPersonas[i] = new Persona(nombre, dNacimiento, mNacimiento, direccion, aNacimiento, ciudad, codPostal);
        }

        personaMayorEdad(listaPersonas);
        personaMasMayor(listaPersonas);
        personaViveenElche(listaPersonas);


    }
        catch (Exception e){
            System.out.println("Error en la entrada de datos. Por favor, ingrese los datos correctamente.");
        }
    }

    public static void personaMasMayor(Persona[] listaPersonas) {
        for (int i = 0; i < listaPersonas.length; i++) {
            if (listaPersonas[i].getaNacimiento() < listaPersonas[0].getaNacimiento()) {
                listaPersonas[0] = listaPersonas[i];
            }
        }

        System.out.println("La persona de mayor edad es: " + listaPersonas[0].getNombre());
    }

    public static void personaMayorEdad(Persona[] listaPersonas) {
        Persona mayor = listaPersonas[0];
        for (int i = 1; i < listaPersonas.length; i++) {
           if (listaPersonas[i].getaNacimiento() < 2008){
                System.out.println(listaPersonas[i].getNombre() + " es mayor de edad.");
           }
        }
    }


    public static void personaViveenElche(Persona[] listaPersonas) {
        for (int i = 0; i < listaPersonas.length; i++) {
            if (listaPersonas[i].getCiudad().equalsIgnoreCase("Elche") || listaPersonas[i].getCiudad().equalsIgnoreCase("elche")) {
                System.out.println(listaPersonas[i].getNombre() + " vive en Elche.");
            }
        }
    }
}