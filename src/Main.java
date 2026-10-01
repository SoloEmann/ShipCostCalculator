import java.util.Scanner;

 class ShipCostCalculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Get the price of the item
        System.out.print("Enter item price: ");
        double price = in.nextDouble();

        double shipping;

        // Check if shipping is free
        if (price >= 100) {
            shipping = 0;
        } else {
            shipping = price * 0.02;
        }

        // Calculate total price
        double total = price + shipping;

        // Display results
        System.out.println("Shipping cost: $" + shipping);
        System.out.println("Total price: $" + total);
    }
}