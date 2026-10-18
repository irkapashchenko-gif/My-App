package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Введіть суму доходу: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Помилка: введено некоректне число.");
            return;
        }

        double income = scanner.nextDouble();

        if (income < 0) {
            System.out.println("Помилка: дохід не може бути меншим за 0.");
            return;
        }

        double tax = calculateTax(income);

        System.out.printf(Locale.US, "Сума податку становить: %.2f%n", tax);

        scanner.close();
    }

    public static double calculateTax(double income) {
        double tax = 0.0;
        double limit1 = 10000.0;
        double limit2 = 25000.0;

        double rate1 = 0.025;
        double rate2 = 0.043;
        double rate3 = 0.067;

        if (income <= limit1) {
            tax = income * rate1;
        } else if (income <= limit2) {
            tax = (limit1 * rate1) + ((income - limit1) * rate2);
        } else {
            tax = (limit1 * rate1) + ((limit2 - limit1) * rate2) + ((income - limit2) * rate3);
        }

        return tax;
    }
}
