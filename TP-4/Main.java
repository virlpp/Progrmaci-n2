
package tpiv;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;


public class TPIV {


    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        // Instanciado de objetos con constructores
        Empleado per1 = new Empleado(15, "Roberto Gomez", "Asesor", 700000); //2
        Empleado per2 = new Empleado("Jacinta Rodriguez", "Desarrolladora");  //1
        Empleado per3 = new Empleado("Carlos Urrutia", "Administrador"); //1
        Empleado per4 = new Empleado(65,"Ana Ochoa", "Gerente", 1200000); //2
        
        // Información inicial con toString
        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);
        System.out.println(per4);
        
        System.out.println("");
        System.out.println("");
        
        // Utilización de métodos sobrecargados de actualizarSalario() sobre diferentes empleados.
        per1.actualizarSalario(25);
        per2.actualizarSalario(5000.0);
        per3.actualizarSalario(10);
        per4.actualizarSalario(15000.0);
        
        //Muestra la información modficada de los empleados usando toString()
        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);
        System.out.println(per4);

        System.out.println("");
        System.out.println("");
        
        // Muestra el total de los empleados con método mostrarTotalEmpleados()
        Empleado.mostrarTotalEmpleados();
        
        //Agrego empleado
        Empleado per5 = new Empleado("Silvia Perez", "Recursos humanos"); 
        
        
        
        System.out.println("");
        System.out.println("");
        //Información de todos los empleados luego de la inserción de uno nuevo.
        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);
        System.out.println(per4);
        System.out.println(per5);
        
        System.out.println("");
        System.out.println("");
        // Muestra el nuevo total de los empleados luego de la inserción de otro.
        Empleado.mostrarTotalEmpleados();
    }
    
}
