import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*//EJERCISIO 6
        int[][] matriz = {
                {15, 25, 36,45},
                {44, 59, 69, 71},
                {74, 83, 92, 21}
        };

        System.out.println("Suma de cada fila:");
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + i + ": " + sumaFila);
        }


        System.out.println("\nSuma de cada columna:");
        for (int j = 0; j < matriz[0].length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Columna " + j + ": " + sumaColumna);
 }

         */
        //EJERCISIO 7
        /*
        int[][] matrizA = {
                {21, 23, 54, 14,},
                {32, 87, 90, 64},
                {32, 13, 54, 67},
                {76, 45, 43, 21}};
        int mayor= matrizA[0][0];
        int fila = 0;
        int columna = 0;

       for(fila= 0; fila<matrizA.length; fila++){
           for(columna=0; columna<matrizA[fila].length;columna++){
               if(matrizA[fila][columna]>mayor){
                   int filaMayor = fila;
                   int columnaMayor= columna;

                   System.out.println("el numero mayor es: " + mayor + " su posicion es " + filaMayor+columnaMayor);
               }
           }
       }

         */

     /*EJERCISIO 8
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la primera fila a intercambiar: ");
        int fila1 = sc.nextInt();
        System.out.print("Introduce la segunda fila a intercambiar: ");
        int fila2 = sc.nextInt();

        // Intercambiar filas
        for (int j = 0; j < matriz[0].length; j++) {
            int temp = matriz[fila1][j];
            matriz[fila1][j] = matriz[fila2][j];
            matriz[fila2][j] = temp;
        }

        // Mostrar la matriz resultante
        System.out.println("\nMatriz después de intercambiar filas:");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();


        }

      */

        /* //EJERCISIO 9

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sumaPrincipal = 0, sumaSecundaria = 0;

        for (int i = 0; i < matriz.length; i++) {
            sumaPrincipal += matriz[i][i]; // Diagonal principal
            sumaSecundaria += matriz[i][matriz.length - 1 - i]; // Diagonal secundaria
        }

        System.out.println("Suma de la diagonal principal: " + sumaPrincipal);
        System.out.println("Suma de la diagonal secundaria: " + sumaSecundaria);

         */
        /* //EJERCISIO 10


        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] transpuesta = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        // Mostrar la matriz transpuesta
        System.out.println("Matriz transpuesta:");
        for (int[] fila : transpuesta) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();

         */


    }
}
