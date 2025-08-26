import java.util.Scanner;

public class ChocolateDistribution {
    public static int[] findRemainderAndQuotient(int total, int children) {
        return new int[]{total / children, total % children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int kids = sc.nextInt();
        int[] result = findRemainderAndQuotient(chocolates, kids);
        System.out.println("Each child gets: " + result[0] + ", Remaining chocolates: " + result[1]);
    }
}
