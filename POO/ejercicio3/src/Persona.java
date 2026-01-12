public class Persona {
    private String nombre;
    private int dNacimiento;
    private int mNacimiento;
    private int aNacimiento;
    private String direccion;
    private int CodPostal;
    private String ciudad;

    public Persona() {
    }

    public Persona(String nombre, int dNacimiento, int mNacimiento, String direccion, int aNacimiento, String ciudad, int codPostal) {
        this.nombre = nombre;
        this.dNacimiento = dNacimiento;
        this.mNacimiento = mNacimiento;
        this.direccion = direccion;
        this.aNacimiento = aNacimiento;
        this.ciudad = ciudad;
        CodPostal = codPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getdNacimiento() {
        return dNacimiento;
    }

    public void setdNacimiento(int dNacimiento) {
        this.dNacimiento = dNacimiento;
    }

    public int getmNacimiento() {
        return mNacimiento;
    }

    public void setmNacimiento(int mNacimiento) {
        this.mNacimiento = mNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getaNacimiento() {
        return aNacimiento;
    }

    public void setaNacimiento(int aNacimiento) {
        this.aNacimiento = aNacimiento;
    }

    public int getCodPostal() {
        return CodPostal;
    }

    public void setCodPostal(int codPostal) {
        CodPostal = codPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dNacimiento=" + dNacimiento +
                ", mNacimiento=" + mNacimiento +
                ", aNacimiento=" + aNacimiento +
                ", direccion='" + direccion + '\'' +
                ", CodPostal=" + CodPostal +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
