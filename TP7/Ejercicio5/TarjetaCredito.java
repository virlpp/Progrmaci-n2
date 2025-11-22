class TarjetaCredito implements Pagable {
    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Procesando pago de $" + monto + " con tarjeta " + numeroTarjeta + "...");
        System.out.println("¡Transacción Aprobada!");
    }
}
