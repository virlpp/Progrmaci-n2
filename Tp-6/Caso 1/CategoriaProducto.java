
package casopractico1;

/**
 *
 * @author Virginia Perez
 *
 */
public enum CategoriaProducto {
    
   
    ALIMENTOS("Productos Comestibles"),
    ELECTRONICA("Dispositivos Electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");
    
    private final String descripcion;
    
    //Constructor de descripcion
    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    //Getter de descripcion
    public String getDescripcion() {
        return descripcion;
    }
    
    //Podré hacer un método para obtener el nombre de las categorias y agregarlo en el toString de abajo?

    public void categoriaDescripcion(){
        CategoriaProducto[] prod = CategoriaProducto.values();
        for (CategoriaProducto prod1 : prod) { //Mediante for-each, sólo se necesita recorrer y mostrar los elementos
            System.out.println(prod1 + descripcion);
        }
    }
    
    @Override
    public String toString() {
        return "CategoriaProducto: " + " Descripcion: " + descripcion; //Falta que aparzca el nombre de la categoria
    }
    
    
    
}
