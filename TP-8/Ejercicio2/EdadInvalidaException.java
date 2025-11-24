// Creación de la excepción personalizada para usar en VerificarEdad.java
public class EdadInvalidaException extends Exception {
    
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }

}
