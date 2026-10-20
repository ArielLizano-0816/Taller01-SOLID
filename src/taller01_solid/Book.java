package taller01_solid;

public class Book extends PhysicalProduct {
    public Book(String name, double price, double weight) {
        super(name, price, weight);
    }

    @Override
    public double calculateIva() {
        return 0;
    }
}
