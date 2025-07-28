import java.util.*;
class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float addition=a+b;
        float subtraction=a-b;
        float multiplication=a*b;
        float division=a/b;
        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        
    }
}