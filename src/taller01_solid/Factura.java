public class Factura {
    private final double subtotal;
    private final double impuestos;

    public Factura(double subtotal, double impuestos) {
        this.subtotal = subtotal;
        this.impuestos = impuestos;
    }

    public double getTotal() { return subtotal + impuestos; }

    @Override
    public String toString() {
        return String.format("Factura -> Subtotal: %.2f | Impuestos: %.2f | Total: %.2f",
                subtotal, impuestos, getTotal());
    }
}
