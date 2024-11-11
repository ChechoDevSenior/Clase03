import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*
        ¿Cuánto te ha costado el ordenador?
        El videojuego en el ordenador está viviendo una nueva época de oro con un montón de juegos exclusivos.
        Para comprarte un PC Gamer deberás fijarte principalmente en el procesador, la tarjeta gráfica, la 
        memoria RAM... pero sobre todo en los accesorios como el teclado y ratón.
        Estás interesado en comprarte un nuevo PC y en la tienda de tu barrio cuesta 660€ con todos los 
        accesorios incluidos. Sin embargo, el vendedor te descuenta el 10% por pronto pago ¿Cuánto tienes que 
        pagar en total por el ordenador con todos los accesorios?
         */
        var scanner = new Scanner (System.in);
        System.out.print("Ingrese el valor total del nuevo PC: ");
        var precioPC = scanner.nextInt();
        System.out.println("Por el pronto pago, tiene un descuento del 10% sobre le valor de compra.");
        var precioFinal = precioPC - (precioPC * 0.1);
        System.out.println("El precio final de su nuevo PC es de: "+precioFinal+"€");
        //El precio final del nuevo PC es de 540€. 
    }
}
