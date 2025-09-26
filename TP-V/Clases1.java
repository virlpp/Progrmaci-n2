import java.time.LocalDate;

public class Pasaporte {
    
    //Atributos Propios
    private String numero;
    private LocalDate fechaEmision;
    
    //Atributos de otras clases
    private Titular titular; //Asociacion bidireccional
    private Foto foto; //Conposicion, Foto debe estar adentro de Pasaporte y ser creado dentro de la clase.
   
    
    //Constructor
    public Pasaporte(String numero, LocalDate fechaEmision, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
        
    }
    
    //Setters y Getters
    
    public Titular getTitular() {
        return titular;
    }
   
    //Setter y validación Titular
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }
    
}


//////////////////////////////////////////////////////////////////////////////////

public class Foto {
    
    //Atributos Propios
    private String imagen;
    private String formato;

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    
    
    
}

//////////////////////////////////////////////////////////////////////////////////


public class Titular {
    
    //Atributos Propios
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; //Asociacion bidireccional

    
    //Constructor
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
    
    public Pasaporte getPasaporte() {
        return pasaporte;
    }
    
    //Setter pasaporte y validación
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }
    
    
}

