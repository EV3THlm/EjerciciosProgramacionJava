package Ejercicios;

//  Pedir el radio de un círculo y calcular su área. A=PI*r^2

import java.util.Scanner;
public class AreaCirculo {
    public static void main(String[] args) {
        Scanner fa = new Scanner(System.in);

        float radio;
        double area;

        System.out.print("\nIngresa el radio: ");
        radio = fa.nextFloat();

        area = 3.14*(radio*radio);
        System.out.println("\nEl area es: " + area + " metros cuadrados.");
    }
}
