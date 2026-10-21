package taller01_solid;
/**
 *
 * @author ariel
 */
public class PagoPayPal implements MedioPago {
    private final String emailCuenta;

    public PagoPayPal(String emailCuenta) {
        this.emailCuenta = emailCuenta;
    }

    @Override
    public boolean realizarCobro(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor a 0");
        }
        System.out.println("Cobrando $" + monto + " vía PayPal a la cuenta " + emailCuenta);
        return true;
    }
}
