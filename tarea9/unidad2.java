import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingresa Xuna");
        double Xuno = numero.nextDouble();
        System.out.println("Ingresa Yuno");
        double Yuno = numero.nextDouble();
        System.out.println("Ingresa Xdos");
        double Xdos = numero.nextDouble();
        System.out.println("Ingresa Ydos");
        double Ydos = numero.nextDouble();
        System.out.println("Ingresa Xtres");
        double Xtres = numero.nextDouble();
        System.out.println("Ingresa Ytres");
        double Ytres = numero.nextDouble();

        //AB
        double distanciaInterna = Math.pow(Xdos - Xuno, 2) + Math.pow(Ydos - Yuno, 2);
        double Raiz = Math.sqrt(distanciaInterna);
        System.out.println("La distancia del Xuno es: " + Raiz);
        //BC
        double distanciaInterna2 = Math.pow(Xdos - Xtres, 2) + Math.pow(Ydos - Ytres, 2);
        double RaizDos = Math.sqrt(distanciaInterna2);
        System.out.println("La distancia del Yuno es: " + RaizDos);
        //CA
        double distanciaInterna3 = Math.pow(Xuno- Xtres, 2) + Math.pow(Yuno- Ytres, 2);
        double RaizTres = Math.sqrt(distanciaInterna3);
        System.out.println("La distancia del Xuno es: " + RaizTres);



              //peimetro

        double perimetro = (Raiz+RaizDos+RaizTres);
        System.out.println("el perimetro es: " + perimetro);

        //Area del triangulo

        double semiperimetro = (Raiz+RaizDos+RaizTres)/2;
        double Area = semiperimetro*(semiperimetro-Raiz)*(semiperimetro-RaizDos)*(semiperimetro-RaizTres);
        double areafina = Math.sqrt(Area);
        System.out.println("El area es: " + areafina);

        //Altura vertice

        double vertice = 2*areafina/Raiz;
        System.out.println("El vertice es: " + vertice);

        //Angulo
    //A
        double cosinter = Math.pow(Raiz,2)+Math.pow(RaizDos,2)-Math.pow(RaizTres,2);
        double cosbajo = 2*RaizDos*RaizTres;
        double cos = cosinter/cosbajo;


        double cosA = RaizDos*RaizDos+RaizTres*RaizTres-Raiz*Raiz/(2*RaizDos*RaizTres);
        double anguloA = Math.toDegrees(Math.acos(cosA));
        System.out.println("El angulo A es: " + anguloA);
 //B
        double cosinterDos = Math.pow(Raiz,2)+Math.pow(RaizDos,2)-Math.pow(RaizTres,2);
        double cosbajoDos = 2*Raiz*RaizDos;
        double cosDos = cosinterDos/cosbajoDos;

        double cosB = RaizDos*RaizDos+RaizTres*RaizTres-Raiz*Raiz/(2*RaizDos*RaizTres);
        double anguloB = Math.toDegrees(Math.acos(cosB));
        System.out.println("El angulo B es: " + anguloB);
        //C
        double cosinterTres = Math.pow(Raiz,2)+Math.pow(RaizDos,2)-Math.pow(RaizTres,2);
        double cosbajoTres = 2*RaizDos*RaizTres;
        double cosTres = cosinter/cosbajo;

        double cosC = RaizDos*RaizDos+RaizTres*RaizTres-Raiz*Raiz/(2*RaizDos*RaizTres);
        double anguloC = Math.toDegrees(Math.acos(cosC));
        System.out.println("El angulo C es: " + anguloC);




     //Triangulo equilatero
          double diferencia = -(Raiz-RaizDos)+(RaizDos-RaizTres)+(RaizTres-Raiz);
        boolean esquilatero = diferencia>0;
        System.out.println("El Triangulo es:  " + esquilatero);

       //punto medio
       double AB = (Xuno+Xdos)/2;
       double ABB = (Yuno+Ydos)/2;
       System.out.println("el punto meio de AB es: " + AB +"," + ABB);
       Double BC = (Xdos+Xtres)/2;
       double BCC = (Ydos+Ytres)/2;
       System.out.println("el punto medio de BC " + BC +"," + BCC);
       double AC = (Xuno+Xtres)/2;
       double ACC = (Yuno+Ytres)/2;
       System.out.println("el punto medio de AC " + AC +"," + ACC);
    }
}
