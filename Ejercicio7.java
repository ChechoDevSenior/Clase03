import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        /*
         Calculadora Básica
        Escribe un programa que solicite al usuario dos números y luego realice las operaciones de suma, resta,
        multiplicación y división con esos números. Muestra los resultados en la consola.
         */
        var scanner = new Scanner (System.in);

        System.out.print("Ingrese el primer número: ");
        var num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        var num2 = scanner.nextInt();
        //Suma
        var suma = num1 + num2;
        System.out.println("La suma de sus números es: "+suma);
        //Resta
        var resta = num1 - num2;
        System.out.println("La resta de sus números es: "+resta);
        //Multiplicación 
        var multi = num1 * num2;
        System.out.println("La multiplicación de sus números es: "+multi);
        //División
        double div = (double) num1 / num2;
        System.out.println("La división de sus números es: "+div);
        scanner.close();
    }
}
