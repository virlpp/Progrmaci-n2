public class NaveEspacial {
    
    private String nombre;
    private int combustible;
    private static final int COMBUSTIBLE_MAXIMO = 200;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    
    public void despegar() {
        if (combustible >= 20) {
            combustible -= 20;
            System.out.println("La nave " + nombre + " ha depegado. Le restan " + combustible + " unidades de combustible.");
        } else {
            System.out.println("No se puede despegar. Se requieren al menos 20 unidades de combustible.");
        }
    }
    
    public void avanzar(int distancia) {
        if (combustible >= distancia){
            combustible-= 10;
            System.out.println("La nave " + nombre + " ha avanzado.");
        } else {
            System.out.println("No se puede avanzar. Se necesitan 5 unidades de combustible para avanzar.");
        }
    }
    
    public void recargarCombustible( int cantidad) {
        if (cantidad + combustible < COMBUSTIBLE_MAXIMO) {
            combustible += cantidad;
        } if (cantidad <= 0) {
            System.out.println("El número ingresado no puede ser menor a 0 y el combustible no puede superar las 200 unidades.");
        } if (combustible + cantidad > COMBUSTIBLE_MAXIMO) {
            combustible = COMBUSTIBLE_MAXIMO;
        }
        
    }
    
    public void mostrarEstado(){
        System.out.println("La nave " + nombre + " tiene " + combustible + " unidades de combustible.");
    }
}
