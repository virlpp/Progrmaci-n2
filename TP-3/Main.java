package tpiii;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;


public class TPIII {

      public static void main(String[] args) {
          
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

      //Ejercicio 1
            
        Estudiante est1 = new Estudiante();
        est1.nombre = "Enriqueta";
        est1.apellido = "Ramirez";
        est1.curso = "Matemática";
        est1.calificacion = 9;
        
        est1.mostrarInfo();
        
        est1.subirCalificacion(1);
        est1.mostrarInfo();
        
        est1.bajarCalificacion(3);
        est1.mostrarInfo();

      //Ejercicio 2
        
        Mascotas masc1 = new Mascotas();
        
        masc1.nombre = "Jacinto";
        masc1.especie = "Perro";
        masc1.edad = 5;
        
        masc1.mostrarInfo();
        masc1.cumplirAnios();

      //Ejercicio 3
            
        Libro nuevoLibro = new Libro();  
        
        nuevoLibro.setTitulo("Un mundo feliz");
        
        nuevoLibro.setAutor("Aldous Huxley");
        
        nuevoLibro.setAñoPublicacion(2500);
        
        // Muestra información con año inválido
        nuevoLibro.mostrarInfo();
        
        // Muestra información con año inválido
        nuevoLibro.setAñoPublicacion(1932);
        nuevoLibro.mostrarInfo();

      //Ejercicio 4 

        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();
            
        gallina1.setIdGallina(145);
        gallina1.setEdadGallina(3);
        gallina1.setHuevosPuestos(4);
        
        
        gallina2.setIdGallina(312);
        gallina2.setEdadGallina(1);
        gallina2.setHuevosPuestos(1);
        
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        gallina1.envejecer();
        gallina2.envejecer();
        
        gallina1.ponerHuevos();
        gallina2.ponerHuevos();
        
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();


      //Ejercicio 5

        
    }
    }
    
}
