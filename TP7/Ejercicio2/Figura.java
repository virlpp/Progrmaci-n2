abstract class Figura {

    protected String nombre;
    
    // Constructor
    public Figura (String nombre) {
        this.nombre = nombre;
    }
    
    // Método abstracto. Define el QUE, no el COMO.
    public abstract double calcularArea();
    
    // Método getter normal heredable
    public String getNombre() {
        return nombre;
    }
    
}
