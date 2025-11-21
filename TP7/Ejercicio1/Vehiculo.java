public class Vehiculo {
    
    protected String marca;
    protected String modelo;
    
    
    //Constructor de la clase base

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    //Método para mostrar Info
    public void mostrarInfo() {
        System.out.println("Marca: " + marca );
        System.out.println("Modelo: " + modelo );
        
    }

}
