
package casopractico3;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Virginia Perez
 *
 */

public class CasoPractico3 {

   
    public static void main(String[] args) {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        // Creación de la Universidad
        Universidad u1= new Universidad("Universidad Tecnológica Nacional");
        
        //1. Crear al menos 3 profesores y 5 cursos.
        Profesor p1 = new Profesor ("p1", "Ursula Kaek", "Física",null);
        Profesor p2 = new Profesor ("p2", "Javier Rodriguez", "Matemática",null);
        Profesor p3 = new Profesor ("p3", "Ines Viamonte", "Estadística",null);
        Profesor p4 = new Profesor ("p4", "Charly Cimino", "Ciencias de la computación",null);
        Profesor p5 = new Profesor ("p5", "Maximiliano Ramirez", "Inglés",null);
        
        Curso c1 = new Curso("c101","Introducción a la Programación",null);
        Curso c2 = new Curso("c102","Programación I",null);
        Curso c3 = new Curso("c103","Programación II",null);
        Curso c4 = new Curso("c104","Arquitectura y SO",null);
        Curso c5 = new Curso("c105","Bases de datos I",null);
        Curso c6 = new Curso("c106","Algoritmos y Estructuras de Datos",null);
        Curso c7 = new Curso("c107","Matemática I",null);
        Curso c8 = new Curso("c108","Inglés I",null);
        Curso c9 = new Curso("c109","Inglés II",null);
        Curso c10 = new Curso("c110","Física Computacional",null);

        //2. Agregar profesores y cursos a la universidad.
        u1.agregarProfesor(p1);
        u1.agregarProfesor(p2);
        u1.agregarProfesor(p3);
        u1.agregarProfesor(p4);
        u1.agregarProfesor(p5);
        
        u1.agregarCurso(c1);
        u1.agregarCurso(c2);
        u1.agregarCurso(c3);
        u1.agregarCurso(c4);
        u1.agregarCurso(c5);
        u1.agregarCurso(c6);
        u1.agregarCurso(c7);
        u1.agregarCurso(c8);
        u1.agregarCurso(c9);
        u1.agregarCurso(c10);
        
        //3. Asignar profesores a cursos usando asignarProfesorACurso(...).
        System.out.println("Asignando profesores a cursos...");
        u1.asignarProfesorACurso("c110", "p1");
        u1.asignarProfesorACurso("c106", "p2");
        u1.asignarProfesorACurso("c107", "p2");
        u1.asignarProfesorACurso("c102", "p4");
        u1.asignarProfesorACurso("c103", "p4");
        u1.asignarProfesorACurso("c108", "p5");
        u1.asignarProfesorACurso("c109", "p5");
        System.out.println("");
        
        //4. Listar cursos con su profesor y profesores con sus cursos.
        System.out.println("Listado profesores: ");
        u1.listarProfesores();
        System.out.println("");
        System.out.println("Listado cursos: ");
        u1.listarCursos();
        System.out.println("");
        
        //5. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
        u1.asignarProfesorACurso("c106", "p3");
        System.out.println("");
        
        //Se verifica que las listas estén sincronizados
        System.out.println("Listado actual profesores: ");
        u1.listarProfesores();
        System.out.println("");
        System.out.println("Listado actual cursos: ");
        u1.listarCursos();
        System.out.println("");
        
        //6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
        u1.eliminarCurso("c109");
        System.out.println("");
        System.out.println("Listado de profesores luego de la eliminación de un curso: ");
        u1.listarProfesores();
        System.out.println("");
        
        //7. Remover un profesor y dejar profesor = null
        u1.eliminarProfesor("p1");
        
        //8. Mostrar un reporte: cantidad de cursos por profesor.    
        u1.listarProfesores();

    }

}
