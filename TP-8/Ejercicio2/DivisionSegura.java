import java.util.Scanner;

/**
 *
 * @author Virginia Perez
 *
 */
public class DivisionSegura {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese el numerador: ");
            int a = sc.nextInt();

            System.out.print("Ingrese el divisor: ");
            int b = sc.nextInt();

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero.");
        }
    }
}
