//////////////////////////EditorVideo////////////////////////////

public class EditorVideo {

    public void exportar(String formato, Proyecto proyecto){

        Render renderNuevo = new Render(formato, proyecto);

        System.out.println("Exportando proyecto " + proyecto.getNombre() + " con formato " + formato);

    }
}

//////////////////////////Proyecto////////////////////////////

public class Proyecto {

    private String nombre;
    private String duracionMin;

    public Proyecto(String nombre, String duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDuracionMin() {
        return duracionMin;
    }

    @Override
    public String toString() {
        return "El proyecto " + nombre + "tiene una duracion de " + duracionMin;
    }
}

//////////////////////////Render////////////////////////////

public class Render {

    private String formato;

    private Proyecto proyecto; //Asociacion unidireccional

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    public String getFormato() {
        return formato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }
}
