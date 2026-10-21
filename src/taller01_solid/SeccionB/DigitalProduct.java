package taller01_solid;

public class DigitalProduct extends Product {
    public DigitalProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateIva() {
        return getPrice() * 0.15;
    }
}
