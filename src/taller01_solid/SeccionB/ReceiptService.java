package taller01_solid;

public class ReceiptService {
    public void sendReceipt(ShoppingCart cart) {
        System.out.println("Sending receipt by email...");
        System.out.println("Total: $" + cart.calculateTotalPrice());
    }
}
