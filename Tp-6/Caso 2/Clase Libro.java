
package casopractico2;

/**
 *
 * @author Virginia Perez
 *
 */
public class Libro {

    //Atributos propios
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    
    //Atributo de clase Autor
    private Autor autor;
    
    //Constructor
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
    
    //Getters

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }
    

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", anioPublicacion=" + anioPublicacion + ", autor=" + autor + '}';
    }
    
    
    //Método 
    public void mostrarInfo(){
        System.out.println("El libro " + titulo + " tienen un ISBN " + isbn + ", fue publicado en el " + anioPublicacion + " por " + autor.getNombre());
    }

    
    
}
