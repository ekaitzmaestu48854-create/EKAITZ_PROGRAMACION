import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;


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
/*
        for (Propietario p : propietarios){
            System.out.println(p.getCoches().size());
        }


        propietarios.stream()
                .map(p -> p.getCoches())
                .forEach(c -> System.out.println(c.size()));

*/

        //3. Obten coches posteriores a 2015
/*

        for (Coche c : coches){
            if (c.getAno() > 2015){
                System.out.println(c.getMatricula() + " - " + c.getAno());
            }
        }

        System.out.println("------------------------");
        coches.stream()
                .filter(c -> c.getAno() > 2015)
                .forEach(c -> System.out.println(c.getMatricula() + " - " + c.getAno()));

*/
        //4.Calcular el precio medio de los coches
/*
        double suma = 0;
        for (Coche c : coches){
            suma += c.getPrecio();
            }

        System.out.println("Precio medio (sin streams): " + (suma / coches.size()));


        double precioMedio = coches.stream()
                .mapToDouble(Coche::getPrecio)
                .average()
                .orElse(0);

        System.out.println("Precio medio (con streams): " + precioMedio);
*/

        //5. Obten el coche mas caro
/*
        Coche masCaro = null;
        double precioMaximo = 0;
        for (Coche c : coches) {
            if (c.getPrecio() > precioMaximo) {
                precioMaximo = c.getPrecio();
                masCaro = c;
            }
        }
        System.out.println("Coche mas caro (sin streams): " + masCaro.getMatricula() + " - " + masCaro.getPrecio());


        Coche cocheMasCaro = coches.stream()
                .max((c1, c2) -> Double.compare(c1.getPrecio(), c2.getPrecio()))
                .orElse(null);
        System.out.println("Coche mas caro (con streams): " + cocheMasCaro.getMatricula() + " - " + cocheMasCaro.getPrecio());
*/

        //6. comprobar si existe algun coche de la marca "BMW"
/*
        boolean existeBMW = false;
        for (Coche c : coches) {
            if (c.getMarca().equalsIgnoreCase("BMW")) {
                existeBMW = true;
                break;
            }
        }
        System.out.println("Existe algun coche BMW (sin streams): " + existeBMW);

        boolean existeBMWStream = coches.stream()
                .anyMatch(c -> c.getMarca().equalsIgnoreCase("BMW"));
        System.out.println("Existe algun coche BMW (con streams): " + existeBMWStream);

        //7.Obtener la lista de coches ordenados por precio de forma ascendente


        List<Coche> cochesOrdenados = new ArrayList<>(coches);
        cochesOrdenados.sort((c1, c2) -> Double.compare(c1.getPrecio(), c2.getPrecio()));
        System.out.println("Coches ordenados por precio (sin streams):");
        for (Coche c : cochesOrdenados) {
            System.out.println(c.getMatricula() + " - " + c.getPrecio());
        }

        System.out.println("Coches ordenados por precio (con streams):");
        coches.stream()
                .sorted((c1, c2) -> Double.compare(c1.getPrecio(), c2.getPrecio()))
                .forEach(c -> System.out.println(c.getMatricula() + " - " + c.getPrecio()));
*/
        //8. Obten el coche mas antiguo

        // con streams
        /*
        Coche cocheMasAntiguo = coches.stream()
                .min((c1, c2) -> Integer.compare(c1.getAno(), c2.getAno()))
                .orElse(null);
        System.out.println("Coche mas antiguo (con streams): " + cocheMasAntiguo.getMatricula() + " - " + cocheMasAntiguo.getAno());
*/

        /*/ 9. contar coches que cuestan mas de 20000

        long contadorCochesCaros = coches.stream()
                .filter(c -> c.getPrecio() > 20000)
                .count();
        System.out.println("Numero de coches que cuestan mas de 20000: " + contadorCochesCaros);
        */
        // 10. Obten las marcas sin repetir
        /*
        System.out.println("Marcas sin repetir:");
        coches.stream()
                .map(Coche::getMarca)
                .distinct()
                .forEach(System.out::println);
        */

        //11. Crear un map con matricula y precio.
        /*
        System.out.println("Map de matricula y precio:");
        coches.stream()
                .collect(java.util.stream.Collectors.toMap(Coche::getMatricula, Coche::getPrecio))
                .forEach((matricula, precio) -> System.out.println(matricula + " - " + precio));
         */

        //12.Agrupar coches por marca.
        /*
        System.out.println("Coches agrupados por marca:");
        Map<String, List<Coche>> cochesPorMarca = coches.stream()
                .collect(java.util.stream.Collectors.groupingBy(Coche::getMarca));
        cochesPorMarca.forEach((marca, listaCoches) -> {
            System.out.println("Marca: " + marca);
            listaCoches.forEach(c -> System.out.println("  " + c.getMatricula() + " - " + c.getPrecio()));
        });
        */

        //13.Agrupa coches por antiguos / modernos como frontera el año 2015.
        /*
        System.out.println("Coches agrupados por antiguos y modernos:");
        Map<Boolean, List<Coche>> cochesAntiguosModernos = coches.stream()
                .collect(Collectors.partitioningBy(c -> c.getAno() > 2015));
        cochesAntiguosModernos.forEach((clave, listaCoches) -> {
            String tipo = clave ? "Modernos" : "Antiguos";
            System.out.println(tipo + ":");
            listaCoches.forEach(c -> System.out.println("  " + c.getMatricula() + " - " + c.getAno()));
        });
        */

        //14.Calcular el precio medio por marca.
        /*
        System.out.println("Precio medio por marca:");
        Map<String, Double> precioMedioPorMarca = coches.stream()
                .collect(Collectors.groupingBy(Coche::getMarca,
                        Collectors.averagingDouble(Coche::getPrecio)));
        precioMedioPorMarca.forEach((marca, precioMedio) ->
                System.out.println(marca + " - " + precioMedio));
        */

        //15
        // String res = coches.stream().map(Coche::getMatricula).collect(Collectors.joining(", "));

//16
        //  long n = coches.stream().filter(c -> c.getMarca().equals("Toyota")).count();

        //17
        // List<String> res = Coches.stream().map(Coche::getMarca).distinct().sorted().toList();

        //18
        // Coche res = Coches.stream().filter(c -> c.getAño() > 2015).min(Comparator.comparing(Coche::getPrecio)).orElse(null);

        //19
        // boolean rep = Coches.stream().map(Coche::getMatricula).distinct().count() != coches.size();

        //20
        // List<Coche> top3 = coches.stream().sorted(Comparator.comparing(Coche::getPrecio).reversed()).limit(3).toList();

        //21
        //a
        //List<Coche> todos = Propietarios.stream().flatMap(p -> p.getCoches().stream()).toList();

        //b
        //long total = Propietarios.stream().mapToLong(p -> p.getCoches().size()).sum();

        //c
         /*boolean tieneBMW = propietarios.stream()
                                    .flatMap(p -> p.getCoches().stream())
                                   .anyMatch(c -> c.getMarca().equals("BMW")); */

        //d
     /*boolean tieneBMW = Propietarios.stream()
             .flatMap(p -> p.getCoches().stream())
             .anyMatch(c -> c.getMarca().equals("BMW"));*/








    }
}