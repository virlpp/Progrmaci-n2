package tpiii;


public class Estudiante {
    
    String nombre;
    String apellido;
    String curso;
    int calificacion;
    
    void mostrarInfo() {
        
        System.out.println(nombre + " " + " " + apellido + " " + curso + " " + calificacion);
    }
    
    public void subirCalificacion(int puntos){
        calificacion += puntos; 
     
    }
    public void bajarCalificacion(int puntos){
        calificacion -= puntos;
       
    }

}
