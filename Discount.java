class Discount{
    public static void main(String[] args) {
        double fee=125000;
        double discountPercent=10;
        double discount=(fee*discountPercent)/100;
        double discountfee=fee-discount;
        System.out.println(discount);
        System.out.println(discountfee);
    }
}