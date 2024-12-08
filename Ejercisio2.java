
public class Main {
    public static void main(String[] args) {

        int[] arreglo = {2,44,3,21,54,24,75};

        double promedio = calcularMedia(arreglo);

        System.out.println("el promedio es :" + promedio);



    }

    public static double calcularMedia(int[] arreglo ) {

        double suma = 0;

        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }


        double promedio = suma / arreglo.length;


        return promedio;

    }
}
