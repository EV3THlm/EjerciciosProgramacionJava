package Ejercicios;


// Pedir el radio de una circunferencia y calcular su longitud.
import java.util.Scanner;
public class LongitudCircunferencia {
    public static void main(String[] args) {
        Scanner fa = new Scanner(System.in);

        float radio;
        double longitud;

        System.out.print("\nIngresa el radio de la circunferencia: ");
        radio = fa.nextFloat();

        longitud = 2*(3.14*radio);

        System.out.println("\nLa longitud es: "+longitud);
    }
}
