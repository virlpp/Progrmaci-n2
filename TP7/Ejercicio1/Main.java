
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Virginia Perez
 *
 */

public class Main {

   
    public static void main(String[] args) {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        // Se instancia un auto
        Auto miAuto = new Auto("Toyota", "Corola", 5);
        
        System.out.println("Información del auto:");
        miAuto.mostrarInfo();
    }

}
