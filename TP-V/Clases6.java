///////////////////// Reserva ///////////////////////


public class Reserva {

    private String fecha;
    private String hora;

    private Cliente cliente; //Asociacion unidireccional
    private Mesa mesa; //Agregacion

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    @Override
    public String toString() {
        return "El cliente " + cliente.getNombre() + " tiene una reserva para " + mesa.getNumero() + " personas en el día " + fecha + " a las " + hora;
    }
}


///////////////////// Cliente ///////////////////////

public class Cliente {
    
    private String nombre;
    private String telefono;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "El cliente " + nombre + " tiene una reserva.";
    }
}

///////////////////// Mesa ///////////////////////

public class Mesa {

    private int numero;
    private int capacidad;

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "La mesa número " + numero + " tiene capacidad para " + capacidad + " personas.";
    }
}

