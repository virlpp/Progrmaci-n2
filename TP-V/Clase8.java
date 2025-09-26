///////////////////////////// Documento //////////////////////////
public class Documento {

    private String titulo;
    private String contenido;

    private FirmaDigital firmaDigital; //Composición


    public Documento(String titulo, String contenido, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(this, usuario); //Se crea con el documento
    }

    public String getTitulo() {
        return titulo;
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }

    public String getContenido() {
        return contenido;
    }

    @Override
    public String toString() {
        return "El documento " + titulo + " se encuentra firmado por " + firmaDigital.getUsuario().getNombre();
    }

}

///////////////////////////// FirmaDigital //////////////////////////

import java.time.LocalDateTime;

public class FirmaDigital {


    private String codigoHash;
    private LocalDateTime fecha;

    private Documento documento;
    private Usuario usuario;

    public FirmaDigital(Documento documento, Usuario usuario) {
        this.documento = documento;
        this.usuario = usuario;
        this.fecha = LocalDateTime.now();
        this.codigoHash = generarHash(documento.getContenido(), usuario.getEmail(), fecha);

    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Documento getDocumento() {
        return documento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    //Generacion del codigo Hash -> funciona como huella digital
    // y se genera a partir de un conjunto de Datos email de usuario y contenido en este caso.
    // Se utiliza el correo ya que pertenece a una sola persona a diferencia de un nombre que puede repetirse.
    private String generarHash(String contenido, String emailUsuario, LocalDateTime fecha) {
        return Integer.toHexString((contenido + emailUsuario + fecha.toString()).hashCode());
    }

    @Override
    public String toString() {
        return "Firma Hash: " + codigoHash + " por usuario " + usuario.getNombre() + " en el día de " + fecha;
    }
}


///////////////////////////// Usuario //////////////////////////

public class Usuario {

    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "El cliente " + nombre + " tiene dirección de correo " + email;
    }
}
