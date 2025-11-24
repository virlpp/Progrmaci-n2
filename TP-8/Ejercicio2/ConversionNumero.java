import java.util.Scanner;

/**
 *
 * @author Virginia Perez
 *
 */
public class ConversionNumero {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        String texto = sc.nextLine();

        try {
            int valor = Integer.parseInt(texto);
            System.out.println("Número convertido: " + valor);

        } catch (NumberFormatException e) {
            System.out.println("Error: el texto ingresado no es un número válido.");
        }
    }

}
