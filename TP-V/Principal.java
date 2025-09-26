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

      
    }
    
}
