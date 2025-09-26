////////////////////////////////Clase Celular////////////////////////////////////////////

public class Celular {
    
    //Atributos Propios
    private String imei;
    private String marca;
    private String modelo;
    
    //Atributo Clase
    private Usuario usuario;
    private Bateria bateria;

    //Constructor
    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    //Getters
    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Bateria getBateria() {
        return bateria;
    }
    
    //Setter Celular con validación
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if(usuario != null && usuario.getCelular()!= this) {
            usuario.setCelular(this);
        }
    }
   
}

////////////////////////////////Clase Bateria////////////////////////////////////////////

public class Bateria {
    
    //Atributos Propios
    private String modelo;
    private int capacidad;

    //Constructor
    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
    
    //Getters

    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }  

}

////////////////////////////////Clase Usuario////////////////////////////////////////////

public class Usuario {
    
    //Atributos Propios
    private String nombre;
    private String dni;
    
    //Atributo Clase
    private Celular celular;
    
    //Constructor

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        
    }
    
   
    //Getters

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Celular getCelular() {
        return celular;
    }
    
    //Setter Celular con validación
    public void setCelular(Celular celular) {
        this.celular = celular;
        if(celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }

}
