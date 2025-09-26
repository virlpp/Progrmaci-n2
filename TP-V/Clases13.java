//////////////////////////////////////CodigoQR////////////////////////

public class CodigoQR {

    private String valor;

    private Usuario usuario; //Asociación unidireccional

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getValor() {
        return valor;
    }
}

//////////////////////////////////////Usuario////////////////////////

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
}

//////////////////////////////////////GeneradorQR////////////////////////

public class GeneradorQR {

    public void generar(String valor, Usuario usuario) {
        CodigoQR qrNuevo = new CodigoQR(valor, usuario);

        System.out.println("Código QR generado " + qrNuevo.getValor() + " para el usuario " + usuario.getNombre());
    }
}
