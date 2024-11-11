import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
                /*
         En el mercado, podemos encontrar que el precio del producto **Pernil Iberic D'Engreix Llen. Azuaga**
         en porción de 100 gramos cuesta 5,95€ y el vendedor nos dice que el precio por kilo cuesta 29,75€. 
         ¿Crees que es correcto el precio?
         */
        var scanner = new Scanner (System.in);
        System.out.print("Ingrese el nombre del producto: ");
        var producto = scanner.nextLine();
        System.out.print("Ingrese la cantidad en kilogramos que desea comprar: ");
        var cantidadProducto = scanner.nextDouble();
        var porcion100Gr = 5.95d;
        var precioFinal = cantidadProducto * (porcion100Gr*10d);
        System.out.println("El precio del kilo de "+producto+"es: "+precioFinal+"€.");
    }
    /*
     RTA/ El valor del precio 29,75€ es incorrecto porque el valor real del precio del kilo de pernil es 59.5€
     */
}
