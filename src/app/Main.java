package app;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Введіть суму доходу: ");
        if (!scanner.hasNextBigDecimal()) {
            System.out.println("Помилка: введено некоректне число.");
            return;
        }

        BigDecimal income = scanner.nextBigDecimal();

        if (income.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Помилка: дохід не може бути меншим за 0.");
            return;
        }

        BigDecimal tax = calculateTax(income);

        BigDecimal finalTax = tax.setScale(2, RoundingMode.HALF_UP);

        System.out.println("Сума податку становить: " + finalTax);

        scanner.close();
    }


    public static BigDecimal calculateTax(BigDecimal income) {
        BigDecimal limit1 = new BigDecimal("10000.00");
        BigDecimal limit2 = new BigDecimal("25000.00");

        BigDecimal rate1 = new BigDecimal("0.025");
        BigDecimal rate2 = new BigDecimal("0.043");
        BigDecimal rate3 = new BigDecimal("0.067");

        BigDecimal tax = BigDecimal.ZERO;

        if (income.compareTo(limit1) <= 0) {
            tax = income.multiply(rate1);
        } else if (income.compareTo(limit2) <= 0) {
            tax = income.multiply(rate2);
        } else {
            tax = income.multiply(rate3);
        }

        return tax;
    }
}