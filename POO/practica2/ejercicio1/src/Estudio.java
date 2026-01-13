public class Estudio {
    protected String nombre;
    protected String ciudad;
    protected String direccion;
    protected String direccionweb;
    protected String fechaFundacion;
    protected String pais;
    protected int telefono;

    public Estudio() {
    }

    public Estudio(String nombre, String ciudad, String direccion, String direccionweb, String fechaFundacion, String pais, int telefono) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.direccionweb = direccionweb;
        this.fechaFundacion = fechaFundacion;
        this.pais = pais;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccionweb() {
        return direccionweb;
    }

    public void setDireccionweb(String direccionweb) {
        this.direccionweb = direccionweb;
    }

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Estudio{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", direccion='" + direccion + '\'' +
                ", direccionweb='" + direccionweb + '\'' +
                ", fechaFundacion='" + fechaFundacion + '\'' +
                ", pais='" + pais + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
