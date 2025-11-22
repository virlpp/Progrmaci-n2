class Transferencia implements Pagable {
    private String cbu;

    public Transferencia(String cbu) {
        this.cbu = cbu;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Transfiriendo $" + monto + " al CBU " + cbu);
        System.out.println("Email de confirmación enviado.");
    }
}
