import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudio> estudios = new ArrayList<Estudio>();
        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

        Estudio estudio1 = new Estudio("Pixar", "Emeryville", "1200 Park Ave", "www.pixar.com", "1986-02-03", "USA", 1234567890, "Toy Story, Finding Nemo");
        Estudio estudio2 = new Estudio("Warner Bros", "Burbank", "4000 Warner Blvd", "www.warnerbros.com", "1923-04-04", "USA", 987654321, "The Dark Knight");

        estudios.add(estudio1);
        estudios.add(estudio2);


        Pelicula pelicula1 = new Pelicula("Toy Story", 1995, 81, "Animacion");
        Pelicula pelicula2 = new Pelicula("The Dark Knight", 2008, 152, "Accion");
        Pelicula pelicula3 = new Pelicula("Finding Nemo", 2003, 100, "Animacion");

        peliculas.add(pelicula1);
        peliculas.add(pelicula2);
        peliculas.add(pelicula3);

        Pelicula peliculamaslarga = null;


        for (Pelicula pelicula : peliculas) {
            if (peliculamaslarga == null || pelicula.getDuracionMinutos() > peliculamaslarga.getDuracionMinutos()) {
                peliculamaslarga = pelicula;
            }
        }

        System.out.println("La pelicula mas larga es: " + peliculamaslarga.getTitulo() + " con una duracion de " + peliculamaslarga.getDuracionMinutos() + " minutos.");

        System.out.println("Producida por el estudio: ");
        for (Estudio estudio : estudios) {
            if (estudio.getPeliculasProducidas().contains(peliculamaslarga.getTitulo())) {
                System.out.println(estudio.getNombre());
            }
        }

        int maxPeliculas = 0;
        String estudioConMasPeliculas = "";
        for (Estudio estudio : estudios) {
            String[] peliculasProducidas = estudio.getPeliculasProducidas().split(", ");
            if (peliculasProducidas.length > maxPeliculas) {
                maxPeliculas = peliculasProducidas.length;
                estudioConMasPeliculas = estudio.getNombre();
            }
        }
        System.out.println("El estudio con mas peliculas producidas es: " + estudioConMasPeliculas + " con " + maxPeliculas + " peliculas.");












    }
}