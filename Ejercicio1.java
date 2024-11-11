public class Ejercicio1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //6 / 2 ( 1 + 2 )
        var num1 = 6;
        var num2 = 2;
        var num3 = 1;
        var num4 = 2;
        var num5 = num1/num2 * (num3 + num4);
            System.out.println(num5);
        
        }
        /*RTA/ La explicación del porque el resultado es 9 y no 1, se debe a que, por más de que exista
        la ley de signos, primero se resuelve lo que este dentro de los paréntesis.
        La correción sería, ajustar estos parámetros en la calculadora que arroja como resultado 1.          
         */
          
}
