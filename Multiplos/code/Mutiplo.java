 public class Multiplo {
    public static void main(String[] args) {
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
