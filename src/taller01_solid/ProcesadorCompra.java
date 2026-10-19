public class ProcesadorCompra {
    private final MedioPago medioPago;
    private final CalculadoraImpuestos calculadoraImpuestos;
    private final GeneradorFactura generadorFactura;
    private final ServicioNotificacion servicioNotificacion;

    public ProcesadorCompra(MedioPago medioPago,
                            CalculadoraImpuestos calculadoraImpuestos,
                            GeneradorFactura generadorFactura,
                            ServicioNotificacion servicioNotificacion) {
        this.medioPago = medioPago;
        this.calculadoraImpuestos = calculadoraImpuestos;
        this.generadorFactura = generadorFactura;
        this.servicioNotificacion = servicioNotificacion;
    }

    public Factura procesar(Compra compra, String destinatario) {
        double subtotal = compra.calcularSubtotal();
        double impuestos = calculadoraImpuestos.calcular(subtotal);
        double total = subtotal + impuestos;

        if (!medioPago.realizarCobro(total)) {
            servicioNotificacion.notificar(destinatario, "El pago fue rechazado.");
            return null;
        }

        Factura factura = generadorFactura.generar(compra, impuestos);
        servicioNotificacion.notificar(destinatario,
                "Pago exitoso. " + factura);
        return factura;
    }
}
