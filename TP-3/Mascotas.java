public class Mascotas {
    String nombre;
    String especie;
    int edad;
    
    void mostrarInfo(){
        System.out.println(nombre + " " + " " + especie + " " + edad);
    }
    
    void cumplirAnios(){
        edad++;
        System.out.println("La edad actual de " + nombre + " es " + edad + " años.");
    }
}

