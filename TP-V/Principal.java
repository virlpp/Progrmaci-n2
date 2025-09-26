import java.time.LocalDate;

public class Relaciones1a1 {

  
    public static void main(String[] args) {

       /////////////////////////////////Ejercicio 1/////////////////////////////////////
      
        Foto foto = new Foto("imagen.png", "png");
        Titular titular = new Titular("Ricardo Garcia", "12457862");
        Pasaporte pasaporte = new Pasaporte("B168466", LocalDate.now(), foto);
        
        //Asigna titular y se encuentran vinculados correctamente
        pasaporte.setTitular(titular);
        
        //Imprimo la información
        System.out.println("Pasaporte nº" + pasaporte.getNumero());
        System.out.println("Titular: " + pasaporte.getTitular().getNombre());


      /////////////////////////////////Ejercicio 2/////////////////////////////////////

      //Agrego los parámetros a los atributos
        Bateria bateria = new Bateria("LKG", 5000);
        Usuario usuario = new Usuario("Jorge Martinez", "12458796");
        Celular celular = new Celular("35464634", "Nokia", "110", bateria);
        
        //Relacion bidireccional en Celular
        celular.setUsuario(usuario);
        
        //Relacion bidireccional en Usuario
        usuario.setCelular(celular);
        
        //Imprimo mensajes para ver la información
        System.out.println(celular); //Agregar toString para no ver la referencia del objeto
        System.out.println(celular.getBateria()); //Agregar toString para no ver la referencia del objeto
        System.out.println(usuario.getNombre() + " tiene el celular "+ usuario.getCelular().getMarca() + " modelo " + usuario.getCelular().getModelo()+ " a su nombre.");

      /////////////////////////////////Ejercicio 3/////////////////////////////////////
      
        Autor autor = new Autor("Gabriel Garcia Marquez", "colombiano");
        Editorial editorial = new Editorial("Planeta","Enrique Butty 275, CABA");
        Libro libro = new Libro("Cien años de soledad", "9780060114183", autor, editorial );
        
        
        //Imprimo mensaje
        System.out.println(libro);
      
    }
    
}
