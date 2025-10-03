
package casopractico1;

import casopractico1.Producto;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Virginia Perez
 *
 */
public class Inventario {
    
    //Atributo Array
    private ArrayList<Producto> producto; //A través de esta inserción de esta lista es posible manipular los elemenos de 'Producto' y crear los métodos hacia esa clase.
    
    //Constructor
    public Inventario() {
        this.producto = new ArrayList<>();
    }
    
    
    //Método 1
    public void agregarProducto(Producto producto){
        this.producto.add(producto);
    }
    
    
    //Método 2
    public void listarProductos(){
        for (Producto prod : producto) {
            System.out.println(prod);
        }   
    }

    // Método 3 utilizo con retorno para reutilizar método en eliminación y -actualizarStock-?
    // Sin void, debe retornar algo. Ese retorno lo reutilizo.
    public Producto buscarProductoPorId(String id) {
        for (Producto p: producto) {
            if(p != null && Objects.equals(id, p.getId())) { //Agrego java.util.Objects, se compara de forma segura si alguna es null  id y p.getId() con Objects.equals
                
                //Imprime el mensaje mostrando el producto encontrado
                System.out.println("El producto " + p.getNombre() + " corresponde al id ingresado.");
                
                return p; //Encuentra el producto y lo devuelve
            } 
        }
        return null; 
    }


//--No tiene que ir por lista ++ Puede ir por lista pero no pedir imprimir en caso que no coincida
    //Sin retorno 3b, con void no devuelve nada.
//    public void buscarProductoPorId(String id){
//        for (Producto p : producto) { //Para un 'p' de la clase 'Producto' dentro de la lista o colección 'producto'
//            if (p.getId()== id) {
//                System.out.println("El producto " + p.getNombre() + " corresponde al Id solicitado.");
//            }
//      }
//    }
           
    
    //Método 4a con método buscarProductoPorId()
    public Producto eliminarProducto(String id) {
    Producto p = buscarProductoPorId(id); // reaprovecho el método
    if (p != null) {
        producto.remove(p); // remove(Object) usa equals para eliminar la primera aparición
    }
    return p;
}
    
    
    
    //4b Sin método buscarProductoPorId() 'p' de método 4a es igual a 'eliminado' de método 4b
//    public Producto eliminarProducto(String id) {
//        if ( producto == null) return null;
//        for (int i = 0; i < producto.size() ; i++){
//            Producto eliminado = producto.get(i);
//            if (eliminado != null && id != null && id.equals(eliminado.getId()))
//            {
//                return producto.remove(i);
//            }
//        
//        }
//        return null;
//    }
//        
    
    
    //Método 5
    public void actualizarStock(String id, int nuevaCantidad){
        Producto p = buscarProductoPorId(id); // reaprovecho el método
        if ( p != null) {
        p.setCantidad(nuevaCantidad);
            System.out.println("Stock del producto " + p.getNombre() + " ahora es de : " + p.getId());
    } else {
            System.out.println("no se encuentra producto con id " + id);
        }

    }
    
    //Método 6
    public void filtrarPorCategoria(CategoriaProducto categoria){
        for (Producto p : producto) {
            if (p.getCategoria() == categoria) {
                System.out.println(p);
            }
        }
    }
    
    //Método 7
    public void obtenerTotalStock(){
        
        int totalStock = 0;
        for (Producto p : producto) {
            totalStock += p.getCantidad();
        } 
            System.out.println(totalStock);
    }
    
    //Método 8
    public void obtenerProductoConMayorStock(){
        
        int mayStock = -1;
        for (Producto p : producto) {
            if ( p.getCantidad() > mayStock) {
                mayStock = p.getCantidad();
            }
        } System.out.println(mayStock);
        
    }
    
    //Método 9
    public void filtrarProductosPorPrecio(double min, double max){
        boolean encontrado = false; 
        for (Producto p : producto) {
            if (min <= p.getPrecio() && p.getPrecio() <= max) {
                System.out.println(p);
                encontrado = true;
        } 
    }
            if (!encontrado) {
                System.out.println("No se ha encontrado ningún producto entre esos valores.");
            }
    }
    
    //Método 10
    public void mostrarCategoriasDisponibles(){
        CategoriaProducto[] prod = CategoriaProducto.values();
        for (CategoriaProducto prod1 : prod) { //Mediante for-each, sólo se necesita recorrer y mostrar los elementos
            System.out.println(prod1);
        }
    }
    
}
