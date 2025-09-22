public class TemperatureAnalyzer {
    public static void main(String[] args) {
        // Example: 7 days × 24 hours
        float[][] temps = new float[7][24];

        // Fill array with dummy values (for testing)
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 24; j++) {
                temps[i][j] = (float)(20 + Math.random() * 15); // 20°C to 35°C
            }
        }

        float hottestAvg = Float.MIN_VALUE, coldestAvg = Float.MAX_VALUE;
        int hottestDay = -1, coldestDay = -1;

        for (int i = 0; i < 7; i++) {
            float sum = 0;
            for (int j = 0; j < 24; j++) {
                sum += temps[i][j];
            }
            float avg = sum / 24;

            System.out.println("Day " + (i+1) + " average: " + avg);

            if (avg > hottestAvg) {
                hottestAvg = avg;
                hottestDay = i + 1;
            }
            if (avg < coldestAvg) {
                coldestAvg = avg;
                coldestDay = i + 1;
            }
        }

        System.out.println("Hottest Day: " + hottestDay + " (Avg = " + hottestAvg + ")");
        System.out.println("Coldest Day: " + coldestDay + " (Avg = " + coldestAvg + ")");
    }
}

