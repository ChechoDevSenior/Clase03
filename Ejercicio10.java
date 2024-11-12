import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        /*
        Media Aritmética
        Crea un programa que calcule la media aritmética de tres números introducidos por el usuario.
         */
        var scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        var num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        var num2 = scanner.nextDouble();
        System.out.print("Ingrese el tercer número: ");
        var num3 = scanner.nextDouble();
        //Media
        var media = (num1 + num2 + num3)/3;
        System.out.println("La media de los números ingresados es: "+media);
        scanner.close(); 
    }
    
}
