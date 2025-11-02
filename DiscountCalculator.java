public class DiscountCalculator {
    public static void main(String[] args) {
        double price = 250.0;
        double discountRate = 15.0;

        double discountAmount = (discountRate / 100) * price;
        double finalPrice = price - discountAmount;

        System.out.printf("Original Price: $%.2f%n", price);
        System.out.printf("Discount: %.0f%%%n", discountRate);
        System.out.printf("Final Price after discount: $%.2f%n", finalPrice);
    }
}
