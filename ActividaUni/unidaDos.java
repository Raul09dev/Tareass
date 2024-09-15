import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Ingresa el primero numero");
        int numeroUno = imput.nextInt();
        System.out.println("Ingresa el segundo numero");
        int numeroDos = imput.nextInt();
        System.out.println("ingrese tercer numero");
        int numeroTres = imput.nextInt();
        System.out.println("ingrese el quarto numero");
        int numeroQuartp = imput.nextInt();
        System.out.println("ingrese quinto numero");
        int numeroQuinto = imput.nextInt();

        double operacionuno = ((numeroUno/numeroQuartp)*(numeroTres+numeroDos)/numeroQuinto);
        double operacionDos = ((numeroDos+numeroTres)*numeroQuartp);
        double finaluno = operacionuno/operacionuno;

        double operacionTres= ((numeroQuinto/numeroUno)+(numeroDos/numeroTres))-numeroQuartp;
        double operacioncuatro = (numeroUno+numeroDos+numeroTres);
        double finalDos = operacionTres/operacioncuatro;

        double finaldefinitivo = finaluno/finalDos;

        System.out.println(finaldefinitivo); 
    }
}
