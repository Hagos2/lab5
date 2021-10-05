package AssignmentLab5;

import java.util.Scanner;

public class Employees {
    public static final double HOURLY_SALARY = 7.25;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter normal worked hours");
        double workedHours = input.nextDouble();
        System.out.print("Enter over time worked hours");
        double oTWorkedHours = input.nextDouble();
        System.out.print("Enter total sales");
        double totalSales = input.nextDouble();
        double salary = workedHours * HOURLY_SALARY + oTWorkedHours * (HOURLY_SALARY * 1.5);

        double commission = 0.0;
        if (totalSales > 1.00 &&totalSales < 99.99) {
            commission = 0.05 * totalSales;
        } else if (totalSales >= 100.00 && totalSales <= 299.99) {
            commission = 0.1 * totalSales;
        } else if (totalSales > 300.00) {
            commission = 0.15 * totalSales;
        }
        double totalIncome=salary+commission;
        System.out.print("totalIncome  = "+totalIncome);
    }
}