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

  /////////////////////////////////Ejercicio 4/////////////////////////////////////

        Banco banco = new Banco("Nacion", "30-15661568-0");
        Cliente cliente = new Cliente("Roberto Gomez", "23546987"); //Corregir this.cliente null
        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito(44354684, "21/8/2030", banco);

        System.out.println(tarjetaDeCredito);
        
  /////////////////////////////////Ejercicio 5/////////////////////////////////////

        
        PlacaMadre placaMadre = new PlacaMadre("AMD", "4561");
        Propietario propietario = new Propietario("Gonzalo", "45651123");
        Computadora computadora = new Computadora("Intel", "453", placaMadre);
        
        System.out.println(computadora);

/////////////////////////////////Ejercicio 6/////////////////////////////////////

        Mesa mesa = new Mesa(3, 4);
        Cliente cliente = new Cliente("Maria Fernandez", "223456851");

        Reserva reserva = new Reserva("22/11/2025", "19:30", cliente, mesa);

        System.out.println(reserva);

/////////////////////////////////Ejercicio 7/////////////////////////////////////

        Motor motor = new Motor("Diesel", "A4521");
        Conductor conductor = new Conductor("Jose Hernandez", "AB4521");

        Vehiculo vehiculo = new Vehiculo("IGW 555", "Fiat 123", motor, conductor);

        System.out.println(vehiculo);

/////////////////////////////////Ejercicio 8/////////////////////////////////////


        Usuario usuario = new Usuario("Carla Sanchez", "carla.s@gmail.com");
        Documento documento = new Documento("Anexo Cuentas", "Cuentas varias", usuario);

        System.out.println(documento);
        System.out.println(documento.getFirmaDigital());

/////////////////////////////////Ejercicio 9/////////////////////////////////////

        Paciente paciente = new Paciente("Roberta Salzano", "Union Personal");
        Profesional profesional = new Profesional("Patricio Perez", "Gastroenterología");

        CitaMedico citaMedico = new CitaMedico("15/5/2026", "9:30", paciente, profesional);

        System.out.println(citaMedico);

/////////////////////////////////Ejercicio 10/////////////////////////////////////

        ClaveSeguridad claveSeguridad = new ClaveSeguridad("5/3/2024", "HG4582");
        Titular titular = new Titular("Ernesto Sabato", "10254896");

        CuentaBancaria cuentaBancaria = new CuentaBancaria("15461354685", 45000, claveSeguridad, titular);

        System.out.println(cuentaBancaria);
    }
    
}
