public class Main {

   
    public static void main(String[] args) {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        ArrayList<Animal> granja = new ArrayList<>();

        // Llenamos la lista (Upcasting automático)
        granja.add(new Perro("Firulais"));
        granja.add(new Gato("Michi"));
        granja.add(new Vaca("Lola"));

        System.out.println("--- Sonidos de la Granja ---");

        for (Animal animal : granja) {
            // 1. Ejecuta el método heredado (igual para todos)
            animal.describirAnimal();
            
            // 2. Ejecuta el método sobrescrito (específico de cada uno)
            // Java decide en tiempo de ejecución cuál versión usar
            animal.hacerSonido();
        }
        
    }
    

}
