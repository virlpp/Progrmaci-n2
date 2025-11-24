public class TarjetaCredito implements Pago, PagoConDescuento {
    
     @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado con tarjeta por: $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.95; // 5% de descuento
    }
}
