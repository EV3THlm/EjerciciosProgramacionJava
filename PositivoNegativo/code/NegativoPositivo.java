#  Pedir un número e indicar si es positivo o negativo.

import java.util.Scanner;
public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner fa = new Scanner(System.in)
        int num;
        System.out.print("Introduce un número: ");
        num=Entrada.entero();
        
        if( num < 0)
            System.out.println("Negativo");
        else
            // suponemos que el 0 es positivo.
            System.out.println("Positivo");
    }
 }
