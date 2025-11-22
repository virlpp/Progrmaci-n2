public class EmpleadoPlanta extends Empleado{
    
    private double sueldoBasico;
    private double bono;

    public EmpleadoPlanta(String nombre, double sueldoBasico, double bono) {
        super(nombre);
        this.sueldoBasico = sueldoBasico;
        this.bono = bono;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBasico + bono;
    }

}
