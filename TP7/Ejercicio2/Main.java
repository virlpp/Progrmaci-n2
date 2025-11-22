public class Main {

   
    public static void main(String[] args) {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        // Se crea un Array de la clase padre (Figura)
        Figura[] misFiguras = new Figura[3];

        // Se agregan las figuras
        misFiguras[0] = new Circulo("Círculo Rojo", 5.0);
        misFiguras[1] = new Rectangulo(100.0, 60.0, "Cancha de Fútbol");
        misFiguras[2] = new Circulo("Moneda", 1.5);

        System.out.println("Mostrando listado de Figuras:");

        // Bucle "for-each"
        for (Figura fig : misFiguras) {
            
            System.out.println("------------------");

            // Aquí ocurre la magia: Java detecta en tiempo de ejecución
            // si "fig" es un Círculo o un Rectángulo y llama al método correcto.
            System.out.println("Nombre: " + fig.getNombre());
            
            // Formateamos la salida a 2 decimales para que se vea limpio
            System.out.printf("Área: %.2f\n", fig.calcularArea());
            System.out.println("------------------");
        }
    }
    

}
