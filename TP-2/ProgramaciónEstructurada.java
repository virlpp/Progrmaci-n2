package trabajopracticoii;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class TrabajoPracticoII {


    public static void main(String[] args) {
        
        
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8)); //Función para codificar caracteres españoles
        Scanner input = new Scanner(System.in); //Función para ingreso de información por teclado
        
        
        
        //Ejercicio 1 : Verficación de año bisiesto.
        
        int anio; //Define la variable a utilizar
        
        System.out.println("Ingrese un año para verificar si es bisiesto:"); //Imprime mensaje para informar al usuario que espera
        anio = Integer.parseInt(input.nextLine()); //Guarda la variable solicitada
        

        
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0) ) {  // Verfica la condición
            System.out.println("El año " +  anio + " ingresado es bisiesto."); //Imprime mensaje de año bisiesto
        } else { //Si no cumple el if imprime siguiente mensaje: 
                        System.out.println("El año " +  anio + " ingresado NO es bisiesto."); //Imprime mensaje de año no bisiesto

        }
        
        
        //Ejercicio 2: Determinar el mayor de los números.
        
        int num1, num2, num3, numMayor;
        
        
        System.out.println("Ingrese un número entero:");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese un segundo número entero:");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese un tercer número entero:");
        num3 = Integer.parseInt(input.nextLine());
        
        
        if (num1 > num2 && num1 > num3){
            numMayor = num1;
            
        } else if (num2 > num3 && num2 > num1) {
            numMayor = num2;
            
        }
        else numMayor = num3;
        
        System.out.println("El número mayor de los ingresados es : " + numMayor);
        
        
        //Ejercicio 3: Clasificación de Edad.
        
        int edad;
        
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        if (0 < edad && edad < 12) {
            System.out.println("Eres un niño.");
            
        } else if (  12 <= edad && edad <= 17) {   
            System.out.println("Eres un adolescente.");
       
        } else if (18 <= edad && edad <= 59) {
            System.out.println("Eres un adulto.");
            
        } else if ( 60 <= edad && edad < 150) {
            System.out.println("Eres un adulto mayor.");
        } else  
            System.out.println("La edad ingresada no es válida.");
        
        
        
        //Ejercicio 4: Calculadora de Descuento según la categoría.
        
        int precioInicial;
        double precioFinal, descuento;
        String categoria;
        
        descuento = 0;
        precioInicial = 0;
        
        System.out.println("Ingrese el precio del producto:");
        precioInicial = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la categoría A para 10%, B para 15% o C para 15% de descuento: ");
        categoria = input.nextLine();
        
        
        if (categoria.equalsIgnoreCase("A")) {
            descuento = 10;
        } else if (categoria.equalsIgnoreCase("B")){
            descuento = 15;
        } else if (categoria.equalsIgnoreCase("C")){
            descuento = 20;
        } else {
            System.out.println("El caracter ingresado no es válido.");
        }        
        
        precioFinal = precioInicial * (1 - descuento / 100);
        
        System.out.println("El precio original es: " + precioInicial);
        System.out.println("La categoría elegida es: " + categoria);
        System.out.println("El descuento aplicado es de " + descuento + "%");
        System.out.println("Precio final es: " + precioFinal);
        
        
        //Ejercicio 5: Suma de números pares (while).
        
        int numero = 1;
        int sumatoria = 0;
        
        while (numero != 0) {
            System.out.println("Ingrese un número (0 para terminar):");
            numero = Integer.parseInt(input.nextLine());
            if (numero % 2 == 0) {
                sumatoria = numero + sumatoria;
            } 
        }
            System.out.println("La sumatoria de los números pares ingresados es: " + sumatoria);
            
            

        //Ejercicio 6: Contador de Positivos, Negativos y Ceros (for) #Ejercicio comentado a fin de que no muestre errores en el documento general.
        
       
        int contPos, contNeg, contCeros;
        int[] numEnt = new int[10];
        
        contNeg = 0;
        contPos = 0;
        contCeros = 0;
        
        
        System.out.println("Ingresa a continuación los números a elección por orden.");
        
        
        for (int i = 0; i < numEnt.length; i++) {
            
            System.out.print("Ingrese el número " + (i+1) + ": ");

            numEnt[i] = Integer.parseInt(input.nextLine());
            
            if (numEnt[i] < 0) {
                contNeg += 1;
            } else if (numEnt[i] > 0) {
                contPos += 1;
            } else {
                contCeros += 1;
            }

        }
        
        System.out.println("Positivos: " + contPos);
        System.out.println("Negativos: " + contNeg);
        System.out.println("Ceros: "+ contCeros);
    

        // Ejercicio 7: Validación de Nota entre 0 y 10 (do-while).
    
        int nota = 0;
        
        
        System.out.println("Ingrese una nota entre 0 y 10: ");
        nota = Integer.parseInt(input.nextLine());
        
        if (!(0 <= nota && nota <= 10)) {
            
            do  {
                System.out.println("ERROR. Ingrese una nota válida.");
                nota = Integer.parseInt(input.nextLine());

            } while (!( 0 <= nota && nota <= 10));
            // El programa debe cortar cuando se ingrese un número entre 0 y 10.
            System.out.println("Nota agregada correctamente.");

        } else {
            System.out.println("Nota agregada correctamente.");
        }

        }
        
        
        
        //Ejercicio 8:Cálculo del Precio Final con impuesto y descuento.
        
        static double precioBase; 
     
        public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8)); //Función para codificar caracteres españoles
        Scanner input = new Scanner(System.in);
        
        double  impuesto, descuento;
        
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = Double.parseDouble(input.nextLine());

        
        System.out.print("Ingrese el porcentaje de impuesto: ");
        impuesto = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el porcentaje de descuento: ");
        descuento = Double.parseDouble(input.nextLine());
        
        calcularPrecioFinal( impuesto, descuento);
       
        }
        
        static double calcularPrecioFinal(double impuesto, double descuento) {

        double precioFinal;
        precioFinal = precioBase + (precioBase * impuesto/100) - (precioBase * descuento/100);

        System.out.println("El precio final es: " + precioFinal);
            return precioFinal;

}
            

        // Ejercicio 9: Composición de funciones para calcular costo de envío y total de compra.
        
        public static void main(String[] args) {
            System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8)); //Función para codificar caracteres españoles
            Scanner input = new Scanner(System.in);


        double  precio, peso;
        String zona = "";
        
        peso = 0;
        

        
        System.out.print("Ingrese el peso del paquete: ");
        precio = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el peso del paquete: ");
        peso = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese zona de envío Nacional o Internacional: ");
        zona = input.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona); //Se guarda el retorno en una variable para poder usarla más abajo.   
        
        calcularTotalCompra ( precio, costoEnvio);    //Acá se utiliza la variable guarda en costoEnvio.
        
    }
        
     
        static double calcularCostoEnvio(double peso, String zona) {

        double costoEnvio = 0;
        int zonaEnvio = 0;
        
        if (zona.equalsIgnoreCase("nacional")) {
            zonaEnvio = 5;
            
        } else if (zona.equalsIgnoreCase("internacional")) {
            zonaEnvio = 10;

        } else
            System.out.println("Por favor ingrese zona de envío válida.");
        
        costoEnvio = peso * zonaEnvio;
                
        System.out.println("El costo de envío es: " + costoEnvio);

            return costoEnvio;
            
}
    
        static double calcularTotalCompra(double precio, double costoEnvio) {

        double costoFinal;  

        costoFinal = precio + costoEnvio;
        
        System.out.println("El total a pagar es: " + costoFinal);
        

            return costoFinal;


}
        //Ejercicio 10: Actualización de stock a partir de venta y recepción de productos.

        
        public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8)); //Función para codificar caracteres españoles
        Scanner input = new Scanner(System.in);
        
        int stockActual, cantidadVendida, cantidadRecibida;
        
        
        System.out.println("Ingrese el stock actual del producto: ");
        stockActual = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la cantidad vendida: ");
        cantidadVendida = Integer.parseInt(input.nextLine());

        
        System.out.println("Ingrese la cantidad recibida:");
        cantidadRecibida = Integer.parseInt(input.nextLine());
        
        

        actualizarStock (stockActual, cantidadVendida, cantidadRecibida);
        
        
        
}
    
    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        
        int nuevoStock = 0;
        
        nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        
        System.out.println("La cantidad actual de stock del producto es: " + nuevoStock);
        
        return nuevoStock;
    }

        //Ejercicio 11: Cálculo de descuento especial usando variable global.

    static final double DESCUENTO = 0.1;
     
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8)); //Función para codificar caracteres españoles
        Scanner input = new Scanner(System.in);
        
        double precio;
        
        
        System.out.println("Ingrese el precio del producto: ");
        precio = Integer.parseInt(input.nextLine());
        

        calcularDescuentoEspecial (precio);
        
        
        
}
    
    static double calcularDescuentoEspecial(double precio) {
        
        double descuentoAplicado = precio * DESCUENTO;
        double precioConDesc;
        
        precioConDesc = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        
        System.out.println("El precio final con descuento es: " + precioConDesc);
        
        return precioConDesc;
    }
    
    // Ejercicio 12: Modificación de un array de precios y visualización de resultados.
    
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8)); //Función para codificar caracteres españoles
        Scanner input = new Scanner(System.in);
        
        int listaProductos[] = new int[5];
        
        listaProductos[0] = 45;
        listaProductos[1] = 150;
        listaProductos[2] = 96;
        listaProductos[3] = 78;
        listaProductos[4] = 201;
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Precio: " + listaProductos[i]);
            
        }
        
        System.out.println("#################################################");
        
        listaProductos[3] = 1500;
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Precio: " + listaProductos[i]);
            
        }

      public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8)); //Función para codificar caracteres españoles
        
        double[] listaProd = {3.5, 5, 6, 9.4, 15.2};
        
        //Imprimir precios original
        impListaOriginal (listaProd, 0);
        
        listaProd[0] = 150;
        
        System.out.println("Lista modificada:");
        impListaNueva (listaProd, 0);

        
    }

    public static void impListaOriginal(double[] listaProd, int i) {
        
        if (i != listaProd.length) {
            System.out.println(listaProd[i]);
            impListaOriginal (listaProd, i+1);
        } 
       
    }
    public static void impListaNueva(double[] listaProd, int i) {
        
        if (i != listaProd.length) {
            System.out.println(listaProd[i]);
            impListaOriginal (listaProd, i+1);
        } 
       
    }
        
}
    
    // Ejercicio 13: Impresión recursiva de arrays antes y después de modificar un elemento.
    
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8)); //Función para codificar caracteres españoles
        
        double[] listaProd = {3.5, 5, 6, 9.4, 15.2};
        
        //Imprimir precios original
        impListaOriginal (listaProd, 0);
        
        listaProd[0] = 150;
        
        System.out.println("Lista modificada:");
        impListaNueva (listaProd, 0);

        
    }

    public static void impListaOriginal(double[] listaProd, int i) {
        
        if (i != listaProd.length) {
            System.out.println(listaProd[i]);
            impListaOriginal (listaProd, i+1);
        } 
       
    }
    public static void impListaNueva(double[] listaProd, int i) {
        
        if (i != listaProd.length) {
            System.out.println(listaProd[i]);
            impListaOriginal (listaProd, i+1);
        } 
       
    }
    
    
}  
