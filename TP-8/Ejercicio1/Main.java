public class TP8 {

   
    public static void main(String[] args) {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Cliente cliente = new Cliente("Roberto", "roberto.carlos@email.com");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Auriculares", 15000));
        pedido.agregarProducto(new Producto("Mouse gamer", 9000));

        double total = pedido.calcularTotal();

        TarjetaCredito tc = new TarjetaCredito();
        double totalConDescuento = tc.aplicarDescuento(total);

        tc.procesarPago(totalConDescuento);

        pedido.cambiarEstado("Preparando");
        pedido.cambiarEstado("Enviado");
        pedido.cambiarEstado("Entregado");
    }

}
