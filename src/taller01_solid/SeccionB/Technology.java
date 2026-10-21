package taller01_solid;

public class Technology extends PhysicalProduct {
    public Technology(String name, double price, double weight) {
        super(name, price, weight);
    }

    @Override
    public double calculateIva() {
        return getPrice() * 0.15;
    }
}
