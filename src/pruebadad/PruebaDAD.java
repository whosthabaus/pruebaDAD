package pruebadad;

import java.util.*;

public class PruebaDAD {

    public static void main(String[] args) {
        int a,b;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        a = leer.nextInt();
        System.out.println("Escribe otro número: ");
        b = leer.nextInt();
        System.out.println("La suma de "+a+" y "+b+" es: "+(a+b));
    }
    
}
