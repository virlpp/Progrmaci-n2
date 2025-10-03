
package casopractico1;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Virginia Perez
 *
 */

public class CasoPractico1 {

   
    public static void main(String[] args) {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        //Inicialización de un inventario
        Inventario inventario = new Inventario();
       
        //1)Agregar Productos mediante el métdo 'agregarProducto(Producto p)' de la clase inventario 'inventario'
        inventario.agregarProducto(new Producto("1254", "Brócoli", 6500.0, 5, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("351", "Televisor", 350000.0, 10, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("62", "Remera", 20000.0, 5, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("752", "Escoba", 2500.0, 7, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("355", "Celular", 220000.0, 12, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("124", "Fósforos", 550, 27, CategoriaProducto.HOGAR));
        
                System.out.println("");
        
        //2)
        System.out.println("Los productos en el inventario son: " );
        inventario.listarProductos();
        
                System.out.println("");
        
        //3)
        System.out.println("Búsqueda por Id: ");
        inventario.buscarProductoPorId("62");
        
                System.out.println("");
        
        //4)Filtrar y mostrar por categoría
        System.out.println("Filtrado por categoria:");
        inventario.filtrarPorCategoria(CategoriaProducto.HOGAR);
        
                System.out.println("");
        
        //5) Eliminar un producto por su ID y listar los productos restantes.
        System.out.println("Producto eliminado: ");
        inventario.eliminarProducto("124"); //No funciona, parece que rompe el Array de Productos
                System.out.println("");
        
        
        System.out.println("Productos listados luego de la eliminación: ");
        inventario.listarProductos();
        
                System.out.println("");
        
        //6)Actualización de stock del producto 'escoba' mostrado por pantalla:
        
        inventario.actualizarStock("752", 9);
                System.out.println("");

        inventario.listarProductos();
                System.out.println("");
        
   
        //7)
        System.out.println("Total de productos en stock: ");
        inventario.obtenerTotalStock();
        
                System.out.println("");
                
        //8)
        System.out.println("Producto con mayor stock: ");
        inventario.obtenerProductoConMayorStock();
        
                System.out.println("");
        
        
        //9) Filtrar productos con precios entre $1000 y $3000.

        System.out.println("Productos entre valores mininmos y máximos.");
        inventario.filtrarProductosPorPrecio(1000.0, 3000.0);
        
                System.out.println("");

        //10) Mostrar categorías disponibles con sus descrpciones por método
        inventario.mostrarCategoriasDisponibles(); //No muestra las descrpipciones

                System.out.println("");
        
        // Mostrar categorías disponibles por Main con interador
//        CategoriaProducto[] productos = CategoriaProducto.values();
//        for (CategoriaProducto producto : productos) {
//             System.out.println(producto);
//        }
        // Ejemplo utilizado por Charly en 'ENUMS Java método útiles'. La iteraciñon es necesaria en éste caso porque
        //se necesitan o deben hacer saltos o condiciones con él.
        //Ej: pedir al usuario que ingrese un número y utilizar el iterador para restarle 1 y mostrarlo en pantalla
    }

}
