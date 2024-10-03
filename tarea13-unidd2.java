//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String cadena = "12345;Laptop HP Pavilion;1500.99;Electronica";




        int logitud = cadena.length();
        System.out.println("su logitud es: " + logitud);
        int ID =cadena.indexOf(";");
        String cortarId = cadena.substring(0, ID);
        System.out.println("ID de productro: " +cortarId);

        int nombre = cadena.indexOf(";"+1);
        String nombreCortar = cadena.substring(6,24);
        System.out.println("nombre de producto: " + nombreCortar);
        String mayusculas = nombreCortar.toUpperCase();
        System.out.println("nombre de producto mayusculas: " +mayusculas);

        String  precio = cadena.substring(25 ,32);
        System.out.println("precio de producto: " + precio);

        char caracterPosicion = cadena.charAt(10);
        System.out.println("caracter posicion: " + caracterPosicion);

         int primeraocurrencia= nombreCortar.indexOf('a');
         System.out.println("primeraocurrencia: " + primeraocurrencia);

         int ultimaocurrecia = nombreCortar.lastIndexOf('o');
         System.out.println("ultimaocurrecia: " + ultimaocurrecia);

         String precioC = cadena.substring(25, 44);
         System.out.println("precio y categoria: " + precioC);

         String subcadena = nombreCortar.substring(7,17);
         System.out.println("subcadena: " + subcadena);







    }
}
