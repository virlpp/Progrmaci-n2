public class PayPal implements Pago, PagoConDescuento {
    
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado con PayPal por: $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        // Ejemplo de descuento: 3%
        return monto * 0.97;
    }
    
}
