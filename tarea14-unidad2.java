public class Main {
    public static void main(String[] args) {
    String cadena = "Juan Perez/1985-07-21/12345";
        String usuario = "juan.perez@empresa.com";
        String FechaDeAscenso= "2023-04-15";
        String salario = "5000.75";

//correoElectronico invertido
        String soloCorreo = usuario.substring(0,10);
        String palabraInvertida = new StringBuilder(soloCorreo).reverse().toString();
        String dominio = usuario.substring(10,22);


//sumar la fecha

        String anio= FechaDeAscenso.substring(0,4);
        String mes = FechaDeAscenso.substring(5,7);
        String dia = FechaDeAscenso.substring(8);

        Integer cambio = Integer.parseInt(anio) + Integer.parseInt(mes) + Integer.parseInt(dia);
        

        //Salario
        String sela = "149.5";

        System.out.println(palabraInvertida + dominio + "/" + cambio + "/"+ sela );










    }
}
