import java.util.Scanner;

public class AthleteRounds {
    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return (int) Math.ceil(5000 / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        int rounds = calculateRounds(s1, s2, s3);
        System.out.println("Rounds needed to complete 5km: " + rounds);
    }
}
