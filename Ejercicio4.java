import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
         ¿Cuánto se ha gastado Carmen?
        La posibilidad de ir al cine entre semana pagando un precio reducido es una tradición en las salas 
        de cine españolas, lo que se conoce como El día del espectador. En algunos cines, el día del espectador 
        suele ser los miércoles y las entradas se reducen hasta en un 70%. La única pega es que suele ir mucha 
        más gente...
        Para aprovechar el día del espectador, Carmen decide ir al cine con sus amigos y sale de su casa con 
        23€. Al regresar se da cuenta que le quedan 12.75€ ¿Sabrías programar cuánto se ha gastado?
         */
        var scanner = new Scanner (System.in);
        System.out.print("Ingrese la cantidad de dinero con el que salió de la casa: ");
        var precioInicial = scanner.nextDouble();
        System.out.print("Ingrese la cantidad de dinero con el que llegó a la casa: ");
        var precioFinal = scanner.nextDouble();
        var precio = precioInicial - precioFinal ;
        System.out.println("Carmen gasto en total "+precio+"€");
        //RTA Carmen se ha gastado 10,25€.
    }
}
