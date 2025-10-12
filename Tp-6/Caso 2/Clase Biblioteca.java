
package casopractico2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Virginia Perez
 *
 */
public class Biblioteca {

    //Atributos
    private String nombre;
    private List<Libro> libros; // Colección de libros de ésta biblioteca
    
    //Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    //Getter
    public String getNombre() {
        return nombre;
    }
    
    
    //Método agregarLibro -- creado DENTRO de la biblioteca
    public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor){
        libros.add(new Libro(isbn, titulo, anioPublicacion ,autor));
    }
    
    //Método listarLibros
    public void listarLibros(){
        System.out.println("Los libros que se encuentran en la biblioteca " + nombre + " son: ");
        for (Libro libro: libros) {
            System.out.println(libro);
        }
    }

    //Método buscarLibroPorIsbn
    public Libro buscarLibroPorIsbn(String isbn){
        for (Libro libro : libros){
            if(libro != null && Objects.equals(isbn, libro.getIsbn())){
                System.out.println("El ISBN ingresado corresponde al libro " + libro.getTitulo() );
                
                return libro;
            }
        }
        return null;
    }
    
    //Método eliminarLibro
    public Libro eliminarLibro(String isbn){
        //if (libros = null) return null;
        for (int i = 0; i < libros.size(); i++) {
            Libro eliminado = libros.get(i);
            if (eliminado != null && isbn != null && isbn.equals(eliminado.getIsbn()))
            {
                System.out.println("El libro " + eliminado.getTitulo() + " ha sido eliminado.");
                return libros.remove(i);
            }
        }
        return null;
    }
    
    //Método obtenerCantidadLibros
    public void obtenerCantidadLibros(){
        
        System.out.println("La " + nombre + " posee una cantidad de libros de " + libros.size() + " libros.");
        
    }
    
    //Método filtrarLibrosPorAnio
    public void filtrarLibrosPorAnio(int anio){
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                System.out.println(libro);
            }
        }
    }
    
    //Método mostrarAutoresDisponibles
    public void mostrarAutoresDisponibles(){
        
        if (libros.isEmpty()) {
        System.out.println("No hay autores disponibles en la biblioteca");
        return;
    }

        Set<String> autores = new HashSet<>(); //Set no permite duplicados 

        for (Libro libro : libros) {
            autores.add(libro.getAutor().getNombre());
        }
   
        System.out.println("Los autores disponibles de " + nombre + " son: ");
        for (String autor: autores) {
            System.out.println(autor);
    }
    
     }

}
