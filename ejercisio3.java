import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arreglo = {-5, 3, 1, 4, 7, -4, -8, -9};

System.out.println("los numeros mayores a cero son :");
        int [] positivos = imprimirPositivos(arreglo);


    }

    public static int []  imprimirPositivos(int[] arreglo) {
        int numero = 0;

        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] > 0) {
                numero++;

            }
        }
        int[] positivos = new int[numero];
        int posiciones = 0;


        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > 0) {
                positivos[posiciones] = arreglo[i];
                posiciones++;

            }

        }
        for(int i = 0; i < positivos.length; i++){
            System.out.println(positivos[i]);
        }
         return positivos;
    }
}
