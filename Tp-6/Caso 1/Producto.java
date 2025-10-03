
package casopractico1;

import java.util.ArrayList;

/**
 *
 * @author Virginia Perez
 *
 */
public class Producto {

    //Atributos propios de la clase
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    
    //Atributo de otra clase
    private CategoriaProducto categoria; //Asociación Unidireccional. Producto conoce a Categoria pero Categoria no necesariamente debe conocer a producto.

    //Constructor que solitará 5 atributos
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    //Getters de atributos propios

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    
    //Getter categoría para utilizar en método 'filtrarPorCategoria(CategoriaProducto categoria)' en 'Producto'
    public CategoriaProducto getCategoria() {
        return categoria;
    }
    
    //Setter para cantidads que luego será modificada mediante método actualizarStock(String id, int nuevaCantidad)

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    //Método para mostrar informacion
    public void mostrarInfo() {
        System.out.println("El id del producto " + nombre + " solicitado es " + id + " tiene un precio de " + precio + " y queda una cantidad de " + cantidad + " y pertenece a la categorñia ");
    }
    
    //ToString para mostrar los datos y no la referencia del objeto. Útil en Main  'inventario.filtrarPorCategoria(CategoriaProducto.HOGAR)'

    @Override
    public String toString() {
        return "Producto: id = " + id + ", nombre = " + nombre + ", precio = " + precio + ", cantidad=" + cantidad + ", categoria = " + categoria ;
    }
    
}
