package Ejercicios;


/*
    Requerimientos:
        1) Pedirle al usuario el valor de a
        2) Pedirle al usuario el valor de b
        3) Pedirle al usuario el valor de c
 */
import java.util.Scanner;
import java.lang.Math.*;
public class EcuacionSegundoGrado {
    public static void main(String[] args) {
        Scanner fa = new Scanner(System.in);

        float a;
        float b;
        float c;
        double resultadox1;
        double resultadox2;

        System.out.print("Ingresa el valor de a: ");
        a = fa.nextFloat();
        System.out.print("\nIngresa el valor de b: ");
        b = fa.nextFloat();
        System.out.print("\nIngresa el valor de c: ");
        c = fa.nextFloat();

        // Primero validamos que exista un resultado
        float d;
        d = (b*b)-4*a*c;
        if (d < 0){
            System.out.println("\n¡No existe una solucion!");
        }else{
            resultadox1 = (-b + Math.sqrt(d))/(2*a);
            resultadox2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("\nEl valor de x1: "+resultadox1+
                    "\nEl valor de x2: "+resultadox2);
        }
    }
}