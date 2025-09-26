/////////////////////// Computadora ///////////////////////////////////

public class Computadora {
    
    private String marca;
    private String numeroSerie;
    
    private PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = placaMadre;
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }
    
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }
    
    @Override
    public String toString() {
        return "La computadora " + getMarca() + " tiene una placa madre " + placaMadre.getModelo();
    }
}

/////////////////////// Placa Madre ///////////////////////////////////

public class PlacaMadre {
    
    private String modelo;
    private String chipset;

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    public String getModelo() {
        return modelo;
    }

    public String getChipset() {
        return chipset;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }
    
    
    
}


/////////////////////// Propietario ///////////////////////////////////

public class Propietario {
    
    private String nombre;
    private String dni;
    
    private Computadora computadora;

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }
    
    
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
    }
    
}


