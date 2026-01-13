//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudio[] estudios = new Estudio[2];


        estudios[0] = new Estudio("Universal Pictures", "Los Angeles", "100 Universal City Plaza", "www.universalpictures.com", "1912-04-30", "USA", 123456789);
        estudios[1] = new Estudio("Warner Bros.", "Burbank", "4000 Warner Blvd", "www.warnerbros.com", "1923-04-04", "USA", 987654321);
        estudios[2] = new Estudio("Paramount Pictures", "Hollywood", "5555 Melrose Ave", "www.paramount.com", "1912-05-08", "USA", 456789123);

        Pelicula[] peliculas = new Pelicula[3];

        peliculas[0] = new Pelicula("Universal Pictures", "Los Angeles", "100 Universal City Plaza", "www.universalpictures.com", "1912-04-30", "USA", 123456789, "Jurassic Park", 1993, 127, "Science Fiction");
        peliculas[1] = new Pelicula("Warner Bros.", "Burbank", "4000 Warner Blvd", "www.warnerbros.com", "1923-04-04", "USA", 987654321, "The Dark Knight", 2008, 152, "Action");
        peliculas[2] = new Pelicula("Paramount Pictures", "Hollywood", "5555 Melrose Ave", "www.paramount.com", "1912-05-08", "USA", 456789123, "Forrest Gump", 1994, 142, "Drama");
        peliculas[3] = new Pelicula("20th Century Fox", "Los Angeles", "10201 W Pico Blvd", "www.20thcenturyfox.com", "1935-05-31", "USA", 321654987, "Avatar", 2009, 162, "Science Fiction");







    }
}