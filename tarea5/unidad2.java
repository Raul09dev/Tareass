import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   Scanner imputn = new Scanner(System.in);
   System.out.println("ingresa colonia");
   String colonia = imputn.nextLine();
   System.out.println("ingresa calle");
   String calle = imputn.nextLine();
   System.out.println("numero de casa");
   int numeroCasa = imputn.nextInt();


 System.out.println("su colonia es " + colonia);
System.out.println("su calle es " + calle);
System.out.println("su numero de casa es " + numeroCasa);

/*
Trabajo 2
 */
        Scanner escuelas = new Scanner(System.in);
        System.out.println("ingresa nombre de primarria");
        String nombre = escuelas.nextLine();
        System.out.println("ingresa edad de secundaria");
        String secundaria = escuelas.nextLine();
        System.out.println("ingresa nombre de preparatoria");
        String preparatoria = escuelas.nextLine();

        System.out.println(nombre);
        System.out.println(secundaria);
        System.out.println(preparatoria);

        /*
        trabajo 3
         */
        Scanner deporte= new Scanner(System.in);
        System.out.println("ingresa deporte favorito");
        String dportaFav= deporte.nextLine();
        System.out.println("Numero de intengrante por equipo");
        int numEquipo= deporte.nextInt();
        System.out.println("posicion mas importante");
        String posicion = deporte.nextLine();

        System.out.println(dportaFav);
        System.out.println(numEquipo);
        System.out.println(posicion);



        }
    }
