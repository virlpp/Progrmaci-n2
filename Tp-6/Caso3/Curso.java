
package casopractico3;

/**
 *
 * @author Virginia Perez
 *
 */
public class Curso {

    //Atributos
    private String codigo;
    private String nombre;
    
    private Profesor profesor;
    
    //Constructor
    
    public Curso(String codigo, String nombre, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null; //Se asigna en setProfesor()
        
    }

    
    //Getter Código y nombre
    public String getCodigo() {
        return codigo;
    }

    
    public String getNombre() {
        return nombre;
    }
    
    

    //Getter y Setter de profesor
    public Profesor getProfesor() {
        return profesor;
    }

 
    
    public void setProfesor(Profesor p) {
        //Casos posibles:
        
        //1) El profesor ingresado es el mismo, no se hace nada.
        if (this.profesor == p) return;
        
        //2) Se asigna profesor nuevo
         Profesor anterior = this.profesor; // Se guarda la referencia del profesor anterior
         
         this.profesor = p; // Se guarda el nuevo profesor p en la referencia.
         
         //Si anteriormente había un profesor se elimina el curso del profesor anterior.
         if (anterior != null) {
             anterior.eliminarCurso(this);//Curso le informa al profesor que ya no pertenece a ese curso
         }
         
         //Si el nuevo profesor p es distinto de nulo se lo agrega al Curso con método en Profesor
         if (p != null) {
             p.agregarCurso(this);
         }
    }
    
    public void mostrarInfo() {
        
        if(profesor != null) {
            //System.out.println("El curso con nombre " + nombre + " y código " + codigo + " le corresponde al profesor " + profesor.getNombre());
            System.out.println(codigo + " - " + nombre + (profesor != null ? " [Prof: " + profesor.getNombre() + "]" : " [sin profesor]")); //Propuesta de ChatGPT para que sea más limpio en caso de listar muchos

        } else {
            System.out.println("El curso " + codigo + " con nombre " + nombre + "no tiene profesor asignado.");
        }
        
    }
}
