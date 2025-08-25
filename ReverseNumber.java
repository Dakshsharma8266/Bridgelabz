import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number, count = 0;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int[] digits = new int[count];
        int i = 0;

        while (number != 0) {
            digits[i++] = number % 10;
            number /= 10;
        }

        for (int j = 0; j < digits.length; j++) {
            System.out.print(digits[j]);
        }
    }
}
