import java.util.*;

public class CharOccurrences {
    public static int countUsingCharAt(String s, char ch) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) count++;
        }
        return count;
    }
    public static int countUsingIndexOf(String s, char ch) {
        int count = 0, idx = s.indexOf(ch);
        while (idx != -1) {
            count++;
            idx = s.indexOf(ch, idx + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        System.out.println("Using charAt: " + countUsingCharAt(s, ch));
        System.out.println("Using indexOf: " + countUsingIndexOf(s, ch));
    }
}
