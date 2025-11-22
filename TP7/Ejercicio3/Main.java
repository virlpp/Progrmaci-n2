public class Main {

   
    public static void main(String[] args) {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        
        ArrayList<Empleado> nomina = new ArrayList<>();

        nomina.add(new EmpleadoPlanta("Ana López", 2000, 300));
        nomina.add(new EmpleadoTemporal("Carlos Ruiz", 40, 15));
        nomina.add(new EmpleadoTemporal("Beatriz Conde", 20, 15));
        nomina.add(new EmpleadoPlanta("David Gil", 2500, 500));

        System.out.println("--- Reporte de Sueldos ---");

        for (Empleado emp : nomina) {
            System.out.print("Nombre: " + emp.getNombre());

            // --- Uso de instanceof ---
            // instanceof verifica de qué clase es realmente el objeto en memoria
            if (emp instanceof EmpleadoPlanta) {
                System.out.print(" [Tipo: Planta] ");
            } else if (emp instanceof EmpleadoTemporal) {
                System.out.print(" [Tipo: Temporal] ");
            }

            // --- Polimorfismo puro ---
            // No importa el tipo, Java sabe qué calcularSueldo ejecutar
            System.out.println("| Sueldo: $" + emp.calcularSueldo());
        }
    
    }
    

}
