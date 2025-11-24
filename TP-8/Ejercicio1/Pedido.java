public class Pedido implements Pagable {
    
    private List<Producto> productos = new ArrayList<>();
    private String estado;
    private Notificable cliente;   // Para notificar cambios

    public Pedido(Notificable cliente) {
        this.cliente = cliente;
        this.estado = "Creado";
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("El estado del pedido cambió a: " + nuevoEstado);
    }

    public String getEstado() { return estado; }
    
}
