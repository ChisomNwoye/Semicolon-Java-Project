/*A program that uses a loop to compute and display the running average of the numbers entered by the user, updating and printing the average after each new input. stop when the user enters -1.*/

import java.util.Scanner;

public class RunningAverage {
    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        double number = 0;
        double sum = 0;
        double average;
        int count = 0;

        while (number != -1) {

            System.out.print("Enter a number (-1 to stop): ");
            number = inputCollector.nextDouble();

            if (number != -1) {
                sum = sum + number;
                count = count + 1;

                average = sum / count;

                System.out.printf("Running average: %.2f%n", average);
            }
        }    
    }
}
