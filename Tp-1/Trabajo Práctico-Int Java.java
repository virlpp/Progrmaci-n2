// Ejercicio 2:

package hola.mundo;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;


public class HolaMundo {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("¡Holaa, Java!");
    }
    
}

//Ejercicio 3:


package ej3;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;


public class Ej3 {


    public static void main(String[] args) {
       System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

       String nombre = "Virginia";
       int edad = 32;
       double altura = 1.54;
       boolean estudiante = true;
       
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(altura);
        System.out.println(estudiante);
                
    }
    
}


Ejercicio 4:

package ej4;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Scanner input = new Scanner(System.in);
        
        String nombre;
        int edad;
        
        System.out.print("Ingrese su nombre: ");    
        nombre = input.nextLine();
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Su nombre es " + nombre + " y su edad es " + edad + ".");
    }
    
}


Ejercicio 5:

package ej5;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Ej5 {

  
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner input = new Scanner(System.in);
        
        int num1, num2, suma, resta, multi;
        double div;
       
       
       
        System.out.print("Ingrese un número entero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese un segundo número entero");
        num2 = Integer.parseInt(input.nextLine());
        
        suma = num1 + num2;
        System.out.println("La suma entre " + num1 + " y " +num2 + " es " + suma + ".");
        
        resta = num1 - num2;
        System.out.println("La resta entre " + num1 + " y " +num2 + " es " + resta + ".");
        
        multi = num1 * num2;
        System.out.println("La multiplicación entre " + num1 + " y " +num2 + " es " + multi + ".");
        
        div = ((double)num1) / num2;
        System.out.println("La división entre " + num1 + " y " + num2 + " es " + div + ".");
    }
    
}


Ejercicio 6:

package ej6;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Ej6 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("\nNombre: Juan Pérez \nEdad: 30 años \nDirección: \"Calle Falsa 123\"");
    }
    
}

Ejercicio 8:

package ej8;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Ej8 {

    
    public static void main(String[] args) {
        
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Ingrese un número entero como dividendo: ");
        int num1 = input.nextInt();
        
        System.out.print("Ingrese un número como divisor: ");
        int num2 = input.nextInt();
        
        double resultado = (double) num1 / num2;
        System.out.println("El resultado entre dividendo y divisor ingresados es: " + resultado);
        

    }
    
}
