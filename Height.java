import java.util.*;
class Height {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double heightincm=sc.nextDouble();
        double totalinches=heightincm/12;
        int feet= (int)(totalinches/12);
        double inches=totalinches%12;
        
        System.out.println(feet);
        System.out.println(inches);
    }
}