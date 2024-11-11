import java.util.Scanner;

public class VariablesTiposDatos {
    public static void main(String[] args) {
        var scanner = new Scanner (System.in);
        
        System.out.print("Ingrese un valor: ");
        var text = scanner.nextLine();

        System.out.printf("El valor ingresado fue: %s%n", text);

        scanner.close();

        // Boolean
        Boolean active;
        var defaultValue = false;
        // Integer numbers
        byte numberByte = 124;
        short numberShort = 30_000;
        int numberInt;
        long numberLong;

        var numberDefault = 157;
        var bibNumber = 385_765_456_983L;
        // Float numbers
        float numberFloat;
        double numberfloat;

        var temperature = 0.0F;
        var price = 25L; //25.0

        //byte -> short -> int -> float -> long -> double

        // Character
        char characterValue;
        var letter = "A"; //Latin ASCII tabla de mapeo de caracteres (256 imprimibles basados maquina de escribir)
        var letter2 = '\t'; 
        var unicodeChar = '\u0354'; //Unicode
        
        //String
        String stringValue;
        var name = "Sergio Arturo"; 
        var lastName ="Peña Chaparro";
        var full = name +" "+ lastName;
        System.out.println(full);
        //byte -> char -> short -> int -> float -> long -> double -> String

    }
}