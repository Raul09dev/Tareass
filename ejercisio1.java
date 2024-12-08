import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Ingresa los grados");
        double gradosC = imput.nextDouble();

        System.out.println("la conversion de grados celsius a fanrenheit :" + celsiusFahrenheit(gradosC));
        
    }
    public static double celsiusFahrenheit(double gradosC){

        double conversion = (gradosC*9/5)+32;
        return conversion;
    }
}







