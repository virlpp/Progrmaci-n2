/////////////////////////////////Clase TarjetaDeCredito/////////////////////////////

public class TarjetaDeCredito {
    
    private int numero;
    private String fechaVencimiento;
    
    private Banco banco; //Agregacion
    private Cliente cliente; //Asociacion bidireccional

    public TarjetaDeCredito(int numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
        setCliente(cliente); // sincroniza la relación bidireccional
    }

    public int getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Banco getBanco() {
        return banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjetaDeCredito() != this) {
        cliente.setTarjetaDeCredito(this);
    }
    }
    
    @Override
    public String toString() {
        String nombreCliente = (cliente != null) ? cliente.getNombre() : "sin cliente asignado";
        return "La tarjeta numero: " + numero + " con fecha de vencimiento: " + fechaVencimiento + " emitida por el banco " + banco.getNombre() + " pertenece a " + nombreCliente;
    }
    
    
}


/////////////////////////////////Clase Cliente/////////////////////////////

public class Cliente {
    
    private String nombre;
    private String dni;
    
    private TarjetaDeCredito tarjetaDeCredito; //Asociacion bidireccional

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }
    
    
    
    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
        if (tarjetaDeCredito != null && tarjetaDeCredito.getCliente() != this) {
        tarjetaDeCredito.setCliente(this);
    }
    }
    
    @Override
    public String toString() {
        return nombre + " con dni " + dni;
    }
}

/////////////////////////////////Clase Banco/////////////////////////////


public class Banco {
    
    private String nombre;
    private String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuit() {
        return cuit;
    }
    
    @Override
    public String toString() {
        return " es del banco" + nombre + " tiene cuit " + cuit;
    }
}

