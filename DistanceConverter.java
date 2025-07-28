import java.util.Scanner;

class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanceFeet = sc.nextDouble();
        double distanceYards = distanceFeet / 3;
        double distanceMiles = distanceYards / 1760;
        System.out.println(distanceYards);
        System.out.println(distanceMiles);
    }
}
