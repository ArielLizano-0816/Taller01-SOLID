package taller01_solid;

public abstract class PhysicalProduct extends Product {
    private final double weight;

    public PhysicalProduct(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
