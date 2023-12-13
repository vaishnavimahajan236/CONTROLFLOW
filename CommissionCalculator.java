// Part 1: Commission Calculator


// Using IntelliJ, write a Java app that takes numerical input from a user
// The app should calculate commission based on this chart used by the retail store.

import java.util.Scanner;

public class CommissionCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sales figure: $");
        double salesFigure = scanner.nextDouble();
        double commissionRate = calculateCommissionRate(salesFigure);

        if (commissionRate != -1) {
            double commission = salesFigure * commissionRate / 100;
            System.out.println("Commission: $" + commission);
        } else {
            System.out.println("Commission: N/A");
        }

        scanner.close();
    }

    private static double calculateCommissionRate(double sales) {
        if (sales > 10000) {
            return 30;
        } else if (sales >= 5001 && sales <= 9999) {
            return 20;
        } else if (sales >= 1001 && sales <= 4999) {
            return 10;
        } else {
            return -1; 
        }
    }
}
