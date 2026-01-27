import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static List<Coche> coches = new ArrayList<>();
    private static List<Propietario> propietarios = new ArrayList<>();
    public static void main(String[] args) {
        // COCHES



        Coche c1 = new Coche("1234 ABC", "Toyota", 2018 , 18000);
        Coche c2 = new Coche("5678 DEF", "BMW", 2015 , 25000);
        Coche c3 = new Coche("9012 GHI", "Seat", 2012 , 12000);

        Coche c4 = new Coche("3456 JKL", "Toyota", 2020 , 22000);
        Coche c5 = new Coche("7890 MNO", "Audi", 2017 , 30000);
        Coche c6 = new Coche("1122 PQR", "BMW", 2010 , 15000);

        Coche c7 = new Coche("3344 STU", "Seat", 2019 , 16000);
        Coche c8 = new Coche("5566 VWX", "Audi", 2014 , 20000);
        Coche c9 = new Coche("7788 YZA", "Toyota", 2021 , 24000);

        coches.add(c1);
        coches.add(c2);
        coches.add(c3);
        coches.add(c4);
        coches.add(c5);
        coches.add(c6);
        coches.add(c7);
        coches.add(c8);
        coches.add(c9);



        // PROPIETARIOS
         Propietario p1 = new Propietario (
                 "Carlos",
                 List.of(c1 , c2 , c3)
                 );

        Propietario p2 = new Propietario (
                "Ana",
                List.of(c4 , c5 , c6)
                );

        Propietario p3 = new Propietario (
                 "Luis",
                List.of(c7 , c8 , c9)
                );


        propietarios.add(p1);
        propietarios.add(p2);
        propietarios.add(p3);



        ejercicio();
    }



    public static void ejercicio(){


        //1. Lista de todas la matriculas (sin streams)
/*
        for (Coche coche : coches) {
            System.out.println(coche.getMatricula());
        }

        System.out.println("------------------------");

        //1. Lista de todas la matriculas (con streams)

        coches.stream()
                .map(Coche::getMatricula)
                .forEach(System.out::println);
*/

        //2. lista de choches que tiene propietario

        for (Propietario p : propietarios){
            System.out.println(p.getCoches().size());
        }


        propietarios.stream()
                .map(p -> p.getCoches())
                .forEach(c -> System.out.println(c.size()));







    }
}