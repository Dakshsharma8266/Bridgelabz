import java.util.*;
import java.util.*;

public class ReverseString {
    public static String reverseUsingCharAt(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Using charAt: " + reverseUsingCharAt(s));
        System.out.println("Using StringBuilder: " + new StringBuilder(s).reverse());
    }
}

public class ReverseString {
    public static String reverseUsingCharAt(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Using charAt: " + reverseUsingCharAt(s));
        System.out.println("Using StringBuilder: " + new StringBuilder(s).reverse());
    }
}
