public class PagoTarjeta implements MedioPago {
    private final String numeroTarjeta;

    public PagoTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public boolean realizarCobro(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor a 0");
        }
        System.out.println("Cobrando $" + monto + " a la tarjeta " + numeroTarjeta);
        return true;
    }
}
