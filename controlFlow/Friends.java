import java.util.*;
class Friends {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age1=sc.nextInt(), height1=sc.nextInt();
        int age2=sc.nextInt(), height2=sc.nextInt();
        int age3=sc.nextInt(), height3=sc.nextInt();
        int youngest=Math.min(age1,Math.min(age2,age3));
        int tallest=Math.max(height1,Math.max(height2,height3));
        if(youngest==age1) System.out.println("Amar is youngest");
        else if(youngest==age2) System.out.println("Akbar is youngest");
        else System.out.println("Anthony is youngest");
        if(tallest==height1) System.out.println("Amar is tallest");
        else if(tallest==height2) System.out.println("Akbar is tallest");
        else System.out.println("Anthony is tallest");
    }
}
