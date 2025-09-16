package tpiii;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;


public class TPIII {

      public static void main(String[] args) {
          
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

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

    }
    
}
