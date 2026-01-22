import java.util.ArrayList;

public class Mascota {
    protected int codigo;
    protected String nombre;
    protected String raza;
    protected String tipo;
    protected  String fechaNacimiento;
    protected String sexo;
    protected double peso;
    protected double longitud;
    protected String colorPelo;
    protected ArrayList<Veterinario> veterinarioAsignado;

    private Cliente dueno;
    private Veterinario veterinario;

    public Mascota(int codigo, String nombre, String raza, String fechaNacimiento, String tipo, String sexo, double longitud, double peso, String colorPelo, ArrayList<Veterinario> veterinarioAsignado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.tipo = tipo;
        this.sexo = sexo;
        this.longitud = longitud;
        this.peso = peso;
        this.colorPelo = colorPelo;
        this.veterinarioAsignado = veterinarioAsignado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public ArrayList<Veterinario> getVeterinarioAsignado() {
        return veterinarioAsignado;
    }

    public void setVeterinarioAsignado(ArrayList<Veterinario> veterinarioAsignado) {
        this.veterinarioAsignado = veterinarioAsignado;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }


}
