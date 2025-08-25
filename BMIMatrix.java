import java.util.Scanner;

public class BMIMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            if (w <= 0 || h <= 0) {
                i--;
                continue;
            }
            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = w / (h * h);
            if (personData[i][2] < 18.5)
                weightStatus[i] = "Underweight";
            else if (personData[i][2] < 25)
                weightStatus[i] = "Normal";
            else if (personData[i][2] < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Weight: " + personData[i][0] + ", Height: " + personData[i][1] + ", BMI: " + personData[i][2] + ", Status: " + weightStatus[i]);
        }
    }
}
