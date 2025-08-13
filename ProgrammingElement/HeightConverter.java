import java.util.Scanner;
class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cm = input.nextDouble();
        double inchesTotal = cm / 2.54;
        int feet = (int) (inchesTotal / 12);
        double inches = inchesTotal % 12;
        System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + inches);
    }
}
