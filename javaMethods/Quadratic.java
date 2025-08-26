import java.util.Scanner;
public class Quadratic {
    public static double[] roots(int a, int b, int c) {
        int delta = b*b - 4*a*c;
        if (delta < 0) return new double[0];
        else if (delta == 0) return new double[]{-b/(2.0*a)};
        else {
            double r1 = (-b + Math.sqrt(delta))/(2*a);
            double r2 = (-b - Math.sqrt(delta))/(2*a);
            return new double[]{r1,r2};
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
        double[] r = roots(a,b,c);
        for(double x:r) System.out.println(x);
    }
}
