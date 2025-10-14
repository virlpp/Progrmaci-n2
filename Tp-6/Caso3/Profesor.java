
package casopractico3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Virginia Perez
 *
 */
public class Profesor {

    //Atributos
    private String id;
    private String nombre;
    private String especialidad;
    
    private List<Curso> cursos;
    
    //Constructor
    public Profesor(String id, String nombre, String especialidad, List<Curso> cursos) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        
        //? indica si la condición es verdadera (que cursos sea distinto de nulo) se usa la lista cursos. Si es falsa ':' se crea una nueva lista vacía.
        this.cursos = (cursos != null) ? cursos : new ArrayList<>(); //Inicializo como lista vacia para evitar el 'NullPointerException'
        
        //También puede escribirse como 
//        if (cursos != null) {
//            this.cursos = cursos; //Si me pasan una lista uso ésta
//        } else {
//            this.cursos = new ArrayList<>(); //Si no, se crea una lista vacía.
//        }
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
    
    
    
    
    
    //Métodos
    public void agregarCurso(Curso c){
        //Sincronización bidireccional
        //Evitamos duplicados con:
        if (!cursos.contains(c)) { //Si cursos no contiene al objeto 'c', éste se agrega
            cursos.add(c);
        }
        
        //Sincronización bidireccional
        //Si el curso no tiene profesor asignado lo sincroniza
        if (c.getProfesor() != this) { //Si el curso 'c' no tiene al Profesor asignado
            c.setProfesor(this); //Entonces asignarle este profesor
        }
    }
    
    
    public void eliminarCurso(Curso c){
        //Verificar que el curso éste en la lista 
        if(cursos.contains(c)) {
            
            //Se desvincula el curso del profesor
            c.setProfesor(null);
            
            //Se elimina el curso de la lista
            cursos.remove(c);
        }
        //Fuera del bloque del if no hay nada que eliminar ya que el curso no se encontraría adentro de la lista cursos.
    }
    
    public void listarCursos(){
        for (Curso c: cursos){
            System.out.println("Código: " + c.getCodigo()+ ",Nombre: " + c.getNombre());
        }
    }
    
    
    public void mostrarInfo(){
        System.out.println("Profesor: " + nombre + " (id: )" + id + " especialista en: " + especialidad);
        
        //Muestro la cantidad de cursos:
        System.out.println("Cantidad de cursos: " + cursos.size());
        
        if(cursos.isEmpty()) {
            System.out.println("Este profesor no tiene cursos asignados.");
        } else {
            System.out.println("Cursos que imparte: ");
            for (Curso c : cursos) {
                System.out.println("* " + c.getNombre());
            }
        }
        System.out.println("***************************");
    }

}
