import java.util.Scanner;
public class Friends {
    public static String youngest(int[] ages, String[] names) {
        int min = ages[0], idx = 0;
        for (int i = 1; i < 3; i++) if (ages[i] < min) { min = ages[i]; idx = i; }
        return names[idx];
    }
    public static String tallest(int[] h, String[] names) {
        int max = h[0], idx = 0;
        for (int i = 1; i < 3; i++) if (h[i] > max) { max = h[i]; idx = i; }
        return names[idx];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar","Akbar","Anthony"};
        int[] ages = new int[3];
        int[] h = new int[3];
        for (int i = 0; i < 3; i++) { ages[i] = sc.nextInt(); h[i] = sc.nextInt(); }
        System.out.println(youngest(ages,names));
        System.out.println(tallest(h,names));
    }
}
