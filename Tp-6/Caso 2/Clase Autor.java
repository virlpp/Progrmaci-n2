
package casopractico2;

/**
 *
 * @author Virginia Perez
 *
 */
public class Autor {
    
    //Atributos
    private String id;
    private String nombre;
    private String nacionalidad;
    
    //Constructor
    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    //Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" + "id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }
    
    
    
    //Método
    public void mostrarInfo(){
        System.out.println("El id " + id + " corresponde al autor " + nombre + " y es de nacionalidad " + nacionalidad);
    }

}
