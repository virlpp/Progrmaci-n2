///////////////////////////////CuentaBancaria//////////////////////

public class CuentaBancaria {

    private String cbu;
    private double saldo;

    private Titular titular; //Asociación bidireccional
    private ClaveSeguridad claveSeguridad; //Comoposición

    public CuentaBancaria(String cbu, double saldo,ClaveSeguridad claveSeguridad, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = claveSeguridad;
        this.titular = titular;
    }

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    //Setteo Cuenta Bancario con validación y lo dejo en el contructor CuentaBancaria
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }
    }


    //Mensaje a imprimir cuando lo llame en main
    @Override
    public String toString(){
        return "La cuenta bancaria con CBU "+ cbu + " a nombre de " + titular.getNombre() + " con DNI " + titular.getDni() + " tiene un saldo de " + saldo + " y se modificó su código por última vez el " + claveSeguridad.getUltimaModificacion();
    }
}

///////////////////////////////ClaveSerguridad//////////////////////

public class ClaveSeguridad {

    private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(String ultimaModificacion, String codigo) {
        this.ultimaModificacion = ultimaModificacion;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    @Override
    public String toString() {
        return "El código " + codigo + " fue modifcado por última vez el " +ultimaModificacion;
    }
}

///////////////////////////////Titular//////////////////////

public class Titular {

    private String nombre;
    private String dni;

    private CuentaBancaria cuentaBancaria; //Asociación bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        //this.cuentaBancaria = cuentaBancaria; Se elimina para no entrar en bucle infinito
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    //Setteo Cuenta Bancario con validación y lo saco del contructor Titular
    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        if (cuentaBancaria != null && cuentaBancaria.getTitular() != this) {
            cuentaBancaria.setTitular(this);
        }
    }
}

