/////////////////////////////////Impuesto/////////////////////////////

public class Impuesto {

    private double monto;
    private Contribuyente contribuyente; //Asociación unidireccional

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    public double getMonto() {
        return monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    @Override
    public String toString() {
        return "El contribuyente" + contribuyente.getNombre() + " adeuda " + monto + "pesos sin IVA.";
    }
}

/////////////////////////////////Contribuyente/////////////////////////////

public class Contribuyente {

    private String nombre;
    private String cuil;

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuil() {
        return cuil;
    }

    @Override
    public String toString() {
        return "El contribuyente" + nombre + " corresponde al cuil " + cuil;
    }
}

/////////////////////////////////Calculadora/////////////////////////////

public class Calculadora {

    public void calcular(Impuesto impuesto) {
        //Suponiendo una suma del 21% correspondiente al IVA
        double iva = impuesto.getMonto() * 0.21;
        double montoMasIva = impuesto.getMonto() + iva;
        System.out.println("El monto a pagar más el IVA es de " + montoMasIva);
    }
}
