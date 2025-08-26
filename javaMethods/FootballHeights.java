import java.util.*;

public class FootballHeights {
    public static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }
    public static double mean(int[] arr) {
        return sum(arr) * 1.0 / arr.length;
    }
    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int x : arr) if (x < min) min = x;
        return min;
    }
    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int x : arr) if (x > max) max = x;
        return max;
    }
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random r = new Random();
        for (int i = 0; i < 11; i++) heights[i] = 150 + r.nextInt(101);
        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Sum = " + sum(heights));
        System.out.println("Mean = " + mean(heights));
        System.out.println("Shortest = " + shortest(heights));
        System.out.println("Tallest = " + tallest(heights));
    }
}
