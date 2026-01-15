public class Pelicula {
private String titulo;
private int año;
private int duracionMinutos;
private String tipo;

    public Pelicula(String titulo, int año, int duracionMinutos, String tipo) {
        this.titulo = titulo;
        this.año = año;
        this.duracionMinutos = duracionMinutos;
        this.tipo = tipo;
    }

    public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public int getAño() {
    return año;
}

public void setAño(int año) {
    this.año = año;
}

public int getDuracionMinutos() {
    return duracionMinutos;
}

public void setDuracionMinutos(int duracionMinutos) {
    this.duracionMinutos = duracionMinutos;
}

public String getTipo() {
    return tipo;
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}

@Override
public String toString() {
    return "Pelicula{" +
            "titulo='" + titulo + '\'' +
            ", año=" + año +
            ", duracionMinutos=" + duracionMinutos +
            ", tipo='" + tipo + '\'' +
            '}';
}
}





