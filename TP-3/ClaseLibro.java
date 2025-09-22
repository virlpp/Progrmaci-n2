package tpiii;

public class Libro {
    
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
   
    
    //Getter Titulo
    public String getTitulo() {
        return titulo;
    }
    
    //Setter Titulo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    //Getter Autor
    public String getAutor() {
        return autor;
    }
    
    //Setter Autor
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    //Getter Año de publicación.
    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    
    //Setter para año de publicación con validación
    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion < 2026 ) {
           this.añoPublicacion = añoPublicacion;        
        } else {
            System.out.println("El número ingresado no puede ser mayor al año en curso.");

        }
        

    }
    
     public void mostrarInfo(){
        System.out.println("Título: " + titulo + "." + " Autor: " + autor + "."+  " Año de publicación: " + añoPublicacion + ".");
    }
    
}
