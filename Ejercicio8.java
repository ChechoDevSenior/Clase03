import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        /*
        Área y Perímetro de un Rectángulo
        Crea un programa que calcule el área y el perímetro de un rectángulo. Solicita al usuario la longitud 
        y el ancho del rectángulo.
        */
        var scanner = new Scanner (System.in);
        System.out.print("Ingrese el valor del ancho del rectangulo: ");
        var ancho = scanner.nextInt();
        System.out.print("Ingrese el valor de largo del rectangulo: ");
        var largo = scanner.nextInt();
        //Area del rectangulo
        var area = ancho * largo;
        //Perimetro del rectangulo
        var per = (ancho *2)+(largo*2);
        System.out.println("El perímetro del rectangulo: "+per);
        System.out.println("El área del rectangulo es: "+area+" unidades cuadradas.");
        scanner.close();
    }
}
