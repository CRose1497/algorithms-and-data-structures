import java.util.Scanner;

public class AverageTemperatureCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask how many temperatures to enter
        System.out.print("How many temperatures do you want to enter? ");
        int num = input.nextInt();

        double[] temps = new double[num];

        // Get all the temperatures from the user
        for (int i = 0; i < num; i++) {
            System.out.print("Enter temperature #" + (i + 1) + ": ");
            temps[i] = input.nextDouble();
        }

        // Calculate the average
        double total = 0;
        for (int i = 0; i < num; i++) {
            total += temps[i];
        }
        double average = total / num;

        // Count how many are above average
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (temps[i] > average) {
                count++;
            }
        }

        // Show results
        System.out.println("Average temperature is: " + average);
        System.out.println(count + " temperature(s) were above average.");

        input.close();
    }
}
