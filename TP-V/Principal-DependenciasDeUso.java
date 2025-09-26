/////////////////////////////////Ejercicio 11/////////////////////////////

public class Main {
    public static void main(String[] args) {

        Artista artista = new Artista("Shakira", "Pop Latino");
        Cancion cancion = new Cancion("Pies descalzos", artista);

        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);

        }
    }

/////////////////////////////////Ejercicio 12/////////////////////////////

        Contribuyente contribuyente = new Contribuyente("Eduardo Oyarbide", "20-56842961-9");
        Impuesto impuesto= new Impuesto(15000, contribuyente);

        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);     
