public class Main {
    
    
        // --- EL MÉTODO GENÉRICO/POLIMÓRFICO ---
        // Este método recibe "Pagable", no le importa si es tarjeta o efectivo.
        public static void procesarPago(Pagable medioDePago, double monto) {
        System.out.println("--- Iniciando sistema de cobro ---");
        medioDePago.pagar(monto);
        System.out.println("----------------------------------");
    }

        public static void main(String[] args) {
            
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        // Creamos los distintos objetos
        Efectivo miBilletera = new Efectivo();
        TarjetaCredito miVisa = new TarjetaCredito("4444-5555-6666-7777");
        Transferencia miBanco = new Transferencia("000000123456789");

        // Usamos EL MISMO método para procesar comportamientos totalmente distintos
        procesarPago(miBilletera, 500);
        procesarPago(miVisa, 1200.50);
        procesarPago(miBanco, 25000);
    }
}
