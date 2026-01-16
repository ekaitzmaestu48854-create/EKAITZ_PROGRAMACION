public class Empleado  extends  Persona{

    protected int sueldo_Bruto;

    public Empleado(String nombre, int edad, int sueldo_Bruto) {
        super(nombre, edad);
        this.sueldo_Bruto = sueldo_Bruto;
    }

    public int getSueldo_Bruto() {
        return sueldo_Bruto;
    }

    public void setSueldo_Bruto(int sueldo_Bruto) {
        this.sueldo_Bruto = sueldo_Bruto;
    }

    public void mostrar(){
        super.mostrar();
        System.out.println("Sueldo Bruto: " + sueldo_Bruto);
    }
    public void calcularSalario(){
        double sueldo_Neto = sueldo_Bruto - (sueldo_Bruto * 0.18);
        System.out.println("Sueldo Neto: " + sueldo_Neto);
    }
}
