import java.util.Scanner;

class PurchaseCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double unitPrice = sc.nextDouble();
        int quantity = sc.nextInt();
        double totalPrice = unitPrice * quantity;

        System.out.println(totalPrice);
    }
}
