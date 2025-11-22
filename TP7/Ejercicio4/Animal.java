// Clase base concreta, no abstracta
class Animal {
    
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método genérico
    public void describirAnimal() {
        System.out.print("Soy un animal llamado " + nombre);
    }

    // Método que será sobrescrito
    // Como la clase no es abstracta, este método DEBE tener cuerpo, aunque sea genérico.
    public void hacerSonido() {
        System.out.println(" y hago sonido genérico");
    }

}
