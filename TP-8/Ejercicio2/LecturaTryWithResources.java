import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Virginia Perez
 *
 */
public class LecturaTryWithResources {

    public static void main(String[] args) {
        
        //Inicializo la variable afuera del try donde se define la ruta del archivo a leer
        String archivo = "C:\\Users\\PC\\Documents\\NetBeansProjects\\TP8\\src\\tp8\\Texto.txt"; 

        // Se declara el recurso entre ()
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

            // Se define la variable linea
            String linea;
            
            // Se inicializa la variable definida már arriba
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            
            // Java liberará automáticamente el recurso al llegar acá.

        } catch (IOException e) {
            
            //Se maneja la excepción
            System.out.println("Error al leer el archivo: " + e.getMessage());
            
            // Se imprime el detalle técnico del error para su posterior depuración 
            e.printStackTrace();
        }
    }
    
}
