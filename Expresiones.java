public class Expresiones {
    public static void main(String[] args) {
        //byte -> char -> short -> int -> float -> long -> double -> String
        var num1 = 10;
        var num2 = -5;
        var num3 = num1 + num2; // 5
        var num4 = 40 - num3;
        System.out.println(num3);

        //+
        //-
        //*
        // /
        var num5 = 10 * 25 - 30 / 8;
        System.out.println(num5);

        var num6 = 7/2;
        var num7 = 7%2;
        System.out.printf("la división entre  7 y 2 es %d y su residuo es %d%n", num6,num7);
        //la división entre  7 y 2 es 3 y su residuo es 1

        //num++ ->uso el numero y luego incremento
        num6++; //num6 = num6 +1 
        num6--; //num6 = num6 -1 
        //num++ ->incremento y luego uso el numero 
        ++num6; //num6 = num6 +1
        --num6; //num6 = num6 -1  
        var num8 = 26;
        var num9 =18;
        var num10 = num8++ - num9--;
                //   26    -   18
        System.out.println(num10);
        System.out.println(num9);
        System.out.println(num8);

        num8 = 26;
        num9 =18;
        var num11 = num8++ - num9--;
        //   27    -   17
        System.out.println(num11);
        System.out.println(num9);
        System.out.println(num8);

        var num12 = 30;
        num12 *= 7; // num12 = num12 * 7
        System.out.println(num12);

        num12 %= 7; 
        System.out.println(num12);
        
    }
}
