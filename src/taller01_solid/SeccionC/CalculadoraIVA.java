package taller01_solid;

public class CalculadoraIVA implements CalculadoraImpuestos {
    private final double tasa;

    public CalculadoraIVA(double tasa) {
        this.tasa = tasa;
    }

    @Override
    public double calcular(double subtotal) {
        return subtotal * tasa;
    }
}
