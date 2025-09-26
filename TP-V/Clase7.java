
/////////////////////////// Vehiculo ///////////////////////////////////////

public class Vehiculo {

    private String patente;
    private String modelo;

    private Motor motor; //Agregación
    private Conductor conductor; //Asociación bidireccional


    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }

    @Override
    public String toString() {
        return "El vehículo " + getModelo() +" con patente " + patente + " modelo " + modelo + " posee un motor de tipo " + motor.getTipo() +" y pertenece a " + conductor.getNombre() ;
    }
}

/////////////////////////// Motor ///////////////////////////////////////

public class Motor {

    private String tipo;
    private String numeroSerie;

    public Motor(String numeroSerie, String tipo) {
        this.numeroSerie = numeroSerie;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    @Override
    public String toString() {
        return "El motor es de tipo " + tipo + " con numero de serie " + numeroSerie;
    }
}


/////////////////////////// Conductor ///////////////////////////////////////

public class Conductor {

    private String nombre;
    private String licencia;

    private Vehiculo vehiculo; // Asociación bidireccional

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
        if (vehiculo != null && vehiculo.getConductor() != this) {
            vehiculo.setConductor(this);
        }
    }

    @Override
    public String toString() {
        return "El conductor " + nombre + " tiene la licencia " + licencia;
    }
}


