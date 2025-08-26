import java.util.*;

public class RemoveVowels {
    public static String removeVowels(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
                result += s.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeVowels(s));
    }
}
