import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Virginia Perez
 *
 */
public class LectorArchivoSeguro {
    

        public static void main(String[] args) throws IOException {
        
        // Definir la variable e inicializarla, el archivo debe estar en la carptea del proyecto.
        String nombreArchivo = "Texto.txt";

        
        // El try-with-resources asegura que el archivo se cierre al terminar
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            
            String linea;
            System.out.println("--- Iniciando lectura de: " + nombreArchivo + " ---");
            
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        // Se ejecuta si el archivo no existe o la ruta está mal
        } catch (FileNotFoundException e) {
            System.err.println("Error: No se pudo encontrar el archivo '" + nombreArchivo + "'.");
            System.err.println("Verifica que el archivo exista en la carpeta del proyecto.");
            
        // Se ejecuta para cualquier otro error de lectura (disco lleno, error de hardware, etc.)
        } catch (IOException e) {
            System.err.println("Error de entrada/salida al leer el archivo.");
            e.printStackTrace();
        }
    
        }
}
