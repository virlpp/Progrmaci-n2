
package tpiv;


public class Empleado {
    
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    static int totalEmpleados = 0;

    
    // ****GETTERS Y SETTERS****        (6)
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
   //********************************
    
    
   //****CONSTRUCTORES SOBRECARGADOS****    (2)
   
    // Constructor que recibe atributos como parámetros
    
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados += 1;
    }
    
    // Constructor que recibe nombre y puesto. id automático y salario por defecto.
    
    public Empleado (String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.id = generarId();
        this.salario = 800000;
        totalEmpleados += 1;

    }
    
    //************************************
    
    // ****MÉTODOS SOBRECARGADOS****     (3)
    
    public double actualizarSalario(int aumentoPorcentaje) {
        this.salario = salario + (salario * aumentoPorcentaje / 100);
        return salario;

    }
    
    public double actualizarSalario(double aumentoFijo) {
        this.salario = salario + aumentoFijo;
        return salario;
    }
    
    //*********************************
    
    //**** MÉTODO toString()****  (4)
    // Muestra la información de los empleados. 
    
    @Override
    public String toString() {
        return "Empleado: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: " +salario;
        
    }
    
    //METODO ESTÁTICO   (5)
    
    public static void mostrarTotalEmpleados() {
        System.out.println("La cantidad total de empleados ingresa es de: " + totalEmpleados);
    }

    //*************************************
    
    
    
    
    
    
    
    //Método para generar id aleatorio.
    private int generarId() {
        return (int)(Math.random() * 1000);
    }
}
