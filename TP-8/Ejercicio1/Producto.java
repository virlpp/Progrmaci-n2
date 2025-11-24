public class Producto implements Pagable {
    
    
    private String nombre;
    private double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    
            
    @Override
    public double calcularTotal() {
        return precio;
    }
}
