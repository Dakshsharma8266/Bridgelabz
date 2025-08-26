import java.util.*;

public class SubstringExample {
    public static String substringUsingCharAt(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println("Using charAt: " + substringUsingCharAt(s, start, end));
        System.out.println("Using substring(): " + s.substring(start, end));
    }
}
