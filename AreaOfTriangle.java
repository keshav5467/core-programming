import java.util.*;
class AreaOfTriangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double base=sc.nextDouble();
        double height=sc.nextDouble();
        double areainches=0.5*base*height;
        double areacm=areainches*2.54*2.54;
        System.out.println(areainches);
        System.out.println(areacm);
    }
}