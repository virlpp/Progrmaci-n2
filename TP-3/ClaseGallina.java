public class Gallina {
    private int idGallina;
    private int edadGallina;
    private int huevosPuestos;

    
    
    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdadGallina() {
        return edadGallina;
    }

    public void setEdadGallina(int edadGallina) {
        this.edadGallina = edadGallina;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    public void mostrarEstado() {
        System.out.println("La gallina " + idGallina + " con edad " + edadGallina + " lleva a la fecha actual puestos " + huevosPuestos +" huevos.");
    }
    
    public void envejecer() {
        edadGallina++;
        
        System.out.println("La gallina " + idGallina + " tiene ahora " + edadGallina + ".");
        
    }
    
    public void ponerHuevos() {
        huevosPuestos++;
        System.out.println("La gallina " + idGallina + " puso un huevo. En total van " + huevosPuestos + "huevos.");
    }
            
    }
