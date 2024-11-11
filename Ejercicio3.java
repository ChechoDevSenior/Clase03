import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*
         ¿Cuántos peces hay en el acuario?
        El agua de las granjas de Minnesota, Iowa, Illinois, Wisconsin, Missouri, Tennesse, Arkansas, Misssissipi
        y Louisiana desemboca en el Océano Atlántico produciendo un fenómeno llamado zona muerta. Debido a los 
        altos niveles de nitrógeno y fósforo que traen estas aguas los peces mueren en grandes cantidades.
        Para evitar que mueran cientos y cientos de peces, la ONG Salvemos los peces de colores ha decidido poner
        en cuarentena a 284 peces rojos y 163 peces azules en un gigantesco acuario, para devolverlos al mar 
        cuando estén curados. ¿Cuántos peces hay en total dentro del acuario?
         */
        var scanner = new Scanner (System.in);
        System.out.print("Ingrese la cantidad de peces rojos que va a poner en el acuario: ");
        var pecesRojos = scanner.nextInt();
        System.out.print("Ingrese la cantidad de peces azules que va a poner en el acuario: ");
        var pecesAzules = scanner.nextInt();
        var totalPeces = pecesAzules+pecesRojos;
        System.out.printf("La cantidad de peces que hay en el acuario es: %s peces",totalPeces);
        //En total en el acuario hay 447 peces. 

    }
}
