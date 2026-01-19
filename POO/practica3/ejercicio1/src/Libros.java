import java.util.ArrayList;

public class Libros {

    private String titulo;
    private String edtorial;
    private int numeroPaginas;
    private int numeroEjemplares = 3;
    private ArrayList<Autor> autores = new ArrayList<>();

    public Libros(String titulo, String edtorial, int numeroPaginas, int numeroEjemplares, ArrayList<Autor> autores) {
        this.titulo = titulo;
        this.edtorial = edtorial;
        this.numeroPaginas = numeroPaginas;
        this.numeroEjemplares = numeroEjemplares;
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEdtorial() {
        return edtorial;
    }

    public void setEdtorial(String edtorial) {
        this.edtorial = edtorial;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Editorial: " + edtorial);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Número de Ejemplares: " + numeroEjemplares);
        System.out.println("Autores:");
        for (Autor autor : autores) {
            autor.mostrarInfo();
            System.out.println("---");
        }
    }

}
