
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner imput = new Scanner(System.in);
        /*
        //EJERCISIO 1

        System.out.println("Ingresa la calificacion del primer estudiante");
        int uno = imput.nextInt();

        System.out.println("Ingresa la calificacion del segundo estudiante");
        int dos = imput.nextInt();

        System.out.println("Ingresa la calificacion del tercer estudiante");
        int tres = imput.nextInt();

        System.out.println("Ingresa la calificacion del quarto estudiante");
        int quatro = imput.nextInt();

        System.out.println("Ingresa la calificacion del quinto estudiante");
        int cinco = imput.nextInt();

        System.out.println("Ingresa la calificacion del sexto estudiante");
        int sexto = imput.nextInt();

        System.out.println("Ingresa la calificacion del septimo estudiante");
        int septimo = imput.nextInt();

        System.out.println("Ingresa la calificacion del octavo estudiante");
        int octavo = imput.nextInt();

        System.out.println("Ingresa la calificacion del novena estudiante");
        int novena = imput.nextInt();

        System.out.println("Ingresa la calificacion del decimo estudiante");
        int decimo = imput.nextInt();


        int arreglo [] = {uno, dos,tres, quatro, cinco, sexto, septimo, octavo, novena, decimo};

        int total = 0;

        for(int suma : arreglo){
            total += suma;
        }
        System.out.println("El total es: " + total);

        double promedio = total / arreglo.length;
        System.out.println("El promedio es: " + promedio);

        int cantidad =0;

        for(int suma : arreglo){
            if(suma > promedio){
                System.out.println("la calificaciones mayores al promedio son : " + suma);
            }
        }

         */
        /*
        //EJERCISIO 2

        int arre [] = {2, 1, 32, 6, 7, 89, 65, 43, 21, 12, 57, 90, 54, 1000, 37,};

        int mayor = arre[0];
        int posicion = 0;

        for(int i = 0; i < arre.length; i++) {
            if (arre[i] > mayor) {
                mayor = arre[i];
                posicion = i;




            }

        }
        System.out.println("el numero mayor es: " + mayor + " Su posicion es : " + posicion);


        int menor = arre[0];
        int posi = 0;

        for(int i = 0; i < arre.length; i++) {
            if (arre[i] < menor) {
                menor = arre[i];
                posi = menor;
            }
        }
        System.out.println("El numero menor es: " + menor + " Su posicion es : " + posi);

         */

       /*
       //EJERCISIO 3
        int arregloA [] = { 2, 2, 1, 1, 1, 1, 4, 5, 5, 5};

        int frecuencia = 0;

        for (int numero: arregloA) {
            if (numero > frecuencia) {
                frecuencia = numero;
            }
            int[] encontrado = new int[frecuencia + 1];

            for (int numero : arregloA) {
                encontrado[numero]++;

                for (int j = 0; j < encontrado.length; j++) {
                    if (encontrado[j] > 0) {
                        System.out.println("El numero es " + j + " Se encuentra : " + encontrado[j]);
                    }
                }
            }


        }


        */
        /*

         //EJERCISIO 4
        int arreg  [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = arreg.length -1; i>=0; i--) {
            System.out.println(arreg[i]);



            }
        }

         */
        /*
        //EJERCISIO 5


        System.out.println("Ingresa la palabra:");
        String texto = imput.nextLine();


        texto = texto.replaceAll("\\s+", "").toLowerCase();

        // Crear un arreglo unidimensional para los caracteres
        char[] arreglo = new char[texto.length()];
        for (int i = 0; i < texto.length(); i++) {
            arreglo[i] = texto.charAt(i);
        }


        boolean esPalindromo = true;
        int n = arreglo.length;

        for (int i = 0; i < n / 2; i++) {
            if (arreglo[i] != arreglo[n - i - 1]) {
                esPalindromo = false;
                break;
            }
        }


        if (esPalindromo) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }


         */



    }
}




































