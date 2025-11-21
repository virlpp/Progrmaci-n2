public class Auto extends Vehiculo {
    
    private int cantidadPuertas;
    
    
    // Constructor de subclase
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    // Sobreescritura del método mostrarInfo
    @Override
    public void mostrarInfo()    {
        super.mostrarInfo(); //Reutilización del método mostrarInfor de clase base
        System.out.println("Cantidad de pueras: " + cantidadPuertas);
    }    

}
