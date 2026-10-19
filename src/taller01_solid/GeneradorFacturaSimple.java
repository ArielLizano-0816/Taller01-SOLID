public class GeneradorFacturaSimple implements GeneradorFactura {
    @Override
    public Factura generar(Compra compra, double impuestos) {
        return new Factura(compra.calcularSubtotal(), impuestos);
    }
}
