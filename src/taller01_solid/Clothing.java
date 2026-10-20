package taller01_solid;

public class Clothing extends PhysicalProduct {
    public Clothing(String name, double price, double weight) {
        super(name, price, weight);
    }

    @Override
    public double calculateIva() {
        return getPrice() * 0.12;
    }
}
