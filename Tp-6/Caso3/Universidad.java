
package casopractico3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Virginia Perez
 *
 */
public class Universidad {
    
    //Atributos
    private String nombre;
    
    private List<Profesor> profesores;
    private List<Curso> cursos;
    
    //Constructor

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>(); //Inicializa la lista de profesores
        this.cursos = new ArrayList<>(); //Inicializa la lista de cursos
    }
    

    //Métodos
    
    public void agregarProfesor(Profesor p) {
        //Se verica que la lista ya contiene el objeto 'p'
        if (!profesores.contains(p)) { //Si no está contenido:
            profesores.add(p); //Se agrega
        }
    }
    
    
    public void agregarCurso(Curso c) {   
        //Como en profesor, verificamos primero si ya hay referencia al objeto
        //Evitamos duplicados
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
    }
    
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        //Se recurre a bucar el curso por su código utilizando el método 'buscarCursoPorCodigo'
        Curso cursoEncontrado = buscarCursoPorCodigo(codigoCurso);
        
        //Se busca Profesor por id
        Profesor profesorEncontrado = buscarProfesorPorId(idProfesor);
        
        //Validar que el curso y el profesor existan.
        if (cursoEncontrado != null && profesorEncontrado != null) {
            //Se asigna el profesor al curso a través del método de sincronización
            cursoEncontrado.setProfesor(profesorEncontrado);
            System.out.println("Asignación del profesor " + profesorEncontrado.getNombre() + " al curso " + cursoEncontrado.getCodigo() + " con nombre " + cursoEncontrado.getNombre());
        } else { //En caso de que alguno sea nulo
            if (cursoEncontrado == null) {
                System.out.println("No se encontró ningún curso relacionado al código ingresado.");
            }
            if (profesorEncontrado == null) {
                System.out.println("No se encontró ningún profesor relacionado al id ingresado.");

            }
        }
    }
    
    
    public void listarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("No hay cursos registrados.");
        } else {
            for (Profesor p : profesores) {
                p.mostrarInfo();
            }
        }
    
    }
    
    
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("No hay profesores registrados.");
            
        }else {
            
        for(Curso c: cursos) {
            c.mostrarInfo();
            
        }
    }
    }
    
    
    //Se dejan los métodos 'buscarProfesorPorId' y 'buscarCursoPorCodigo' como private ya que no será llamado desde el main. 
    //Serán llamados dentro de la la clase Universidad.
    private Profesor buscarProfesorPorId(String id) {     
        for (Profesor p: profesores){
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
     
    private Curso buscarCursoPorCodigo(String codigo) {    
        for(Curso c: cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null; //En caso de no encontrarse retornar null.
    }
    
    
    
    
    public void eliminarCurso(String codigo) {
        //Busco el curso
        Curso cursoAEliminar = buscarCursoPorCodigo(codigo);
        
        if (cursoAEliminar != null) { //S el curso se encuentra, es distinto de null
            //Se rompe la relación bidireccional si se elimina el curso que tiene un profesor asignado
            if (cursoAEliminar.getProfesor() != null) { //Si el curso a eliminar tiene un profesor asociado entonces:
                Profesor profesorAsociado = cursoAEliminar.getProfesor();
                profesorAsociado.eliminarCurso(cursoAEliminar);
            }
            //Se elimina el curso de la lista
            cursos.remove(cursoAEliminar);
            System.out.println("El curso " + cursoAEliminar.getNombre() + " con código " + codigo + " ha sido eliminado.");
        } else {
            System.out.println("No se encontró curso al código ingresado.");
        }
        
    }
    
    
    public void eliminarProfesor(String id) {
        
        //Busco el profesor
        Profesor profesorAEliminar = buscarProfesorPorId(id);
        
        if (profesorAEliminar != null) {
            //Elimina al profesor de todos los cursos en los que está asociado
            //Se crea una copia de la lista de cursos del profesor en cuestión para la iteración
            List<Curso> cursosDelProfesor = new ArrayList<>(profesorAEliminar.getCursos());
            
            //Se pasa por los cursos para vverificar cual está asociado al profesor y así eliminar la conexión entre ellos4
            for (Curso c : cursosDelProfesor) {
                c.setProfesor(profesorAEliminar); //Se Settea Profesor en ese curso especificado por 'profesorAEliminar'
                
            }
            
            //Se elimina al profesor de la lista de la Universidad
            profesores.remove(profesorAEliminar);
            System.out.println("El profesor " + profesorAEliminar.getNombre() + " con id " + id + " ha sido eliminado correctamente.");
        } else {
            System.out.println("No se encontró ninfún profesor al id ingresado.");
        }
        
    }

}
