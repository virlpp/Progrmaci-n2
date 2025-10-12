
package casopractico2;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Virginia Perez
 *
 */

public class CasoPractico2 {

   
    public static void main(String[] args) {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        //1. Creamos una biblioteca.
        Biblioteca b1= new Biblioteca("Biblioteca Municipal");
        
        //2. Crear al menos tres autores
        Autor a1 = new Autor("1235", "Agatha Christie", "inglesa");
        Autor a2 = new Autor("2654", "Roberto Arlt", "argentino");
        Autor a3 = new Autor("854", "Julio Cortazar", "belga");
        Autor a4 = new Autor("314", "Simone de Beauvoir", "francesa");
        Autor a5 = new Autor("682", "Franz Kafka", "checo");
        
        //3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        b1.agregarLibro("468464146","La metamorfosis",1915,a5);
        b1.agregarLibro("273793186","Muerte en el Nilo",1934,a1);
        b1.agregarLibro("7656914614","El segundo Sexo",1949,a4);
        b1.agregarLibro("2679587312","El juguete rabioso",1926,a2);
        b1.agregarLibro("1357949154","La casa torcida",1949,a1);
        b1.agregarLibro("13465279164","Rayuela",1963,a3);
        b1.agregarLibro("97213756151","Carta al padre",1919,a5);
        b1.agregarLibro("32754691821","La casa tomada",1946,a3);
        
        //4. Listar todos los libros con su información y la del autor.
        b1.listarLibros();
        System.out.println("");
        
        //5. Buscar un libro por su ISBN y mostrar su información.
        b1.buscarLibroPorIsbn("7656914614");
                System.out.println("");

        //6. Filtrar y mostrar los libros publicados en un año específico.
        System.out.println("Libro/s correspondiente/s al año ingresado:");
        b1.filtrarLibrosPorAnio(1949);
                System.out.println("");

        //7. Eliminar un libro por su ISBN y listar los libros restantes.
        System.out.println("Libro eliminado: ");
        b1.eliminarLibro("97213756151");
                System.out.println("");
                System.out.println("Libros actuales: ");
        b1.listarLibros();
                System.out.println("");

       
        //8. Mostrar la cantidad total de libros en la biblioteca.
        b1.obtenerCantidadLibros();
                System.out.println("");

        //9. Listar todos los autores de los libros disponibles en la biblioteca.
        b1.mostrarAutoresDisponibles();
        
    }

}
