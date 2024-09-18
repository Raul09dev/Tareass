import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Producto 1
        System.out.print("Nombre del producto 1: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Cantidad de " + nombre1 + ": ");
        int cantidad1 = scanner.nextInt();
        System.out.print("Precio unitario de " + nombre1 + ": ");
        double precioUnitario1 = scanner.nextDouble();
        System.out.print("Descuento para " + nombre1 + " (%): ");
        double descuento1 = scanner.nextDouble();
        System.out.print("Impuestos para " + nombre1 + " (%): ");
        double impuestos1 = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        // Cálculos para el producto 1
        double precioSinDescuento1 = cantidad1 * precioUnitario1;
        double montoDescuento1 = precioSinDescuento1 * (descuento1 / 100);
        double precioConDescuento1 = precioSinDescuento1 - montoDescuento1;
        double montoImpuestos1 = precioConDescuento1 * (impuestos1 / 100);
        double precioTotal1 = precioConDescuento1 + montoImpuestos1;

        // Producto 2
        System.out.print("Nombre del producto 2: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Cantidad de " + nombre2 + ": ");
        int cantidad2 = scanner.nextInt();
        System.out.print("Precio unitario de " + nombre2 + ": ");
        double precioUnitario2 = scanner.nextDouble();
        System.out.print("Descuento para " + nombre2 + " (%): ");
        double descuento2 = scanner.nextDouble();
        System.out.print("Impuestos para " + nombre2 + " (%): ");
        double impuestos2 = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        // Cálculos para el producto 2
        double precioSinDescuento2 = cantidad2 * precioUnitario2;
        double montoDescuento2 = precioSinDescuento2 * (descuento2 / 100);
        double precioConDescuento2 = precioSinDescuento2 - montoDescuento2;
        double montoImpuestos2 = precioConDescuento2 * (impuestos2 / 100);
        double precioTotal2 = precioConDescuento2 + montoImpuestos2;

        // Producto 3
        System.out.print("Nombre del producto 3: ");
        String nombre3 = scanner.nextLine();
        System.out.print("Cantidad de " + nombre3 + ": ");
        int cantidad3 = scanner.nextInt();
        System.out.print("Precio unitario de " + nombre3 + ": ");
        double precioUnitario3 = scanner.nextDouble();
        System.out.print("Descuento para " + nombre3 + " (%): ");
        double descuento3 = scanner.nextDouble();
        System.out.print("Impuestos para " + nombre3 + " (%): ");
        double impuestos3 = scanner.nextDouble();

        // Cálculos para el producto 3
        double precioSinDescuento3 = cantidad3 * precioUnitario3;
        double montoDescuento3 = precioSinDescuento3 * (descuento3 / 100);
        double precioConDescuento3 = precioSinDescuento3 - montoDescuento3;
        double montoImpuestos3 = precioConDescuento3 * (impuestos3 / 100);
        double precioTotal3 = precioConDescuento3 + montoImpuestos3;

        // Mostrar resultados para los 3 productos
        System.out.println("\nResumen para " + nombre1 + ":");
        System.out.printf("Precio sin descuento: %.2f\n", precioSinDescuento1);
        System.out.printf("Monto descontado: %.2f\n", montoDescuento1);
        System.out.printf("Precio con descuento: %.2f\n", precioConDescuento1);
        System.out.printf("Impuestos aplicados: %.2f\n", montoImpuestos1);
        System.out.printf("Precio total a pagar: %.2f\n\n", precioTotal1);

        System.out.println("Resumen para " + nombre2 + ":");
        System.out.printf("Precio sin descuento: %.2f\n", precioSinDescuento2);
        System.out.printf("Monto descontado: %.2f\n", montoDescuento2);
        System.out.printf("Precio con descuento: %.2f\n", precioConDescuento2);
        System.out.printf("Impuestos aplicados: %.2f\n", montoImpuestos2);
        System.out.printf("Precio total a pagar: %.2f\n\n", precioTotal2);

        System.out.println("Resumen para " + nombre3 + ":");
        System.out.printf("Precio sin descuento: %.2f\n", precioSinDescuento3);
        System.out.printf("Monto descontado: %.2f\n", montoDescuento3);
        System.out.printf("Precio con descuento: %.2f\n", precioConDescuento3);
        System.out.printf("Impuestos aplicados: %.2f\n", montoImpuestos3);
        System.out.printf("Precio total a pagar: %.2f\n\n", precioTotal3);

        // Calcular y mostrar el total acumulado de los tres productos
        double totalAcumulado = precioTotal1 + precioTotal2 + precioTotal3;
        System.out.printf("Total acumulado a pagar por los 3 productos: %.2f\n", totalAcumulado);

        scanner.close();
    }
}
