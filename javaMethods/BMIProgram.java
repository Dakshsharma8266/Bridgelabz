import java.util.Scanner;
public class BMIProgram {
    public static double calcBMI(double w, double h) {
        double m = h / 100;
        return w / (m * m);
    }
    public static String status(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        for (int i = 0; i < 10; i++) {
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            data[i][0] = w;
            data[i][1] = h;
            data[i][2] = calcBMI(w,h);
        }
        for (int i = 0; i < 10; i++) System.out.println(data[i][0]+" "+data[i][1]+" "+data[i][2]+" "+status(data[i][2]));
    }
}
