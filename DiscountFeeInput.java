import java.util.*;
class DiscountFeeInput{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double fee=sc.nextDouble();
        double discountPercent=sc.nextDouble();
        double discount=(fee*discountPercent)/100;
        double discountfee=fee-discount;
        System.out.println(discount);
        System.out.println(discountfee);
    }
}