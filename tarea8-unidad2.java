import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Ingrese X una: ");
        double x = imput.nextDouble();
        System.out.println("Ingrese Y una: ");
        double y = imput.nextDouble();
        System.out.println("Ingrese X Dos: ");
        double Xdos = imput.nextDouble();
        System.out.println("Ingrese Y Dos: ");
        double Ydos = imput.nextDouble();

        //Distancia
        double divisionInterna = Math.pow(Xdos-x,2) + Math.pow(Ydos-y,2);
        double division = Math.sqrt(divisionInterna);
        System.out.println("La distancia entre los 2 punto es: " + division);

        //Angulos en radianes
        double teta =Math.atan2(Ydos-y,Xdos-x);
        System.out.println(teta);

        //Conversion de radianes a grados
        double grado= Math.toDegrees(teta)*180/Math.PI;
        System.out.println(grado);
        }
    }
