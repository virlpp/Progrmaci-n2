/////////////////////////////////Cancion /////////////////////////////

public class Cancion {

    private String titulo;
    private Artista artista; //Asociación unidireccional

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return titulo + " perteneciente a " + artista.getNombre();
    }
}


/////////////////////////////////Artista /////////////////////////////

public class Artista {

    private String nombre;
    private String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "El artista " + nombre +"corresponde al género" + genero;
    }
}


/////////////////////////////////Reproductor /////////////////////////////

public class Reproductor {

    //Metodo que utiliza Cancion como dependencia de uso en clase Reproductor
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion);

    }
}
