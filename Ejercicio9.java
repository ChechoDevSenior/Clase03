import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        /*
        Escribe un programa que convierta una temperatura dada en grados Celsius a grados Fahrenheit y Kelvin.
        Usa las siguientes fórmulas:
        ```
        Fahrenheit = Celsius * 9/5 + 32
        Kelvin = Celsius + 273.15
         */
        var scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        var Celsius = scanner.nextDouble();
        var Fahrenheit = Celsius * 9/5 + 32;
        var Kelvin = Celsius + 273.15;
        System.out.println(Celsius+"°C, equivale a "+Fahrenheit+"°F y "+Kelvin+"°K.");
        scanner.close();
    }
    
}
