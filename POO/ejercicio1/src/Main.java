//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Circunferencia c1 = new Circunferencia(6.8);
        Circunferencia c2 = new Circunferencia(5);
        Circunferencia c3 = new Circunferencia(12);

        System.out.println("Radio " + c1.getRadio() + "\n" + "Circunferencia c1: " + c1.calcularCircunferencia()  + "\n" +
                " Area: " + c1.calcularArea() + "\n" +
                           " Volumen: " + c1.calcularVolume());

        }
    }
