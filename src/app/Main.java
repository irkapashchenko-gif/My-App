package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Введіть ціле число: ");
        int num1 = scanner.nextInt();
        printSquare(num1);
        System.out.println();


        double radius = 3.5;
        double height = 10.0;
        double volume = calculateCylinderVolume(radius, height);
        System.out.println("2. Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume + ".");
        System.out.println();


        int[] array = {10, 20, 30, 40, 50};
        System.out.print("3. Масив чисел: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i == array.length - 1 ? "" : ", "));
        }
        System.out.println("]");
        System.out.println("   Сума всіх елементів масиву дорівнює " + calculateArraySum(array) + ".");
        System.out.println();

        scanner.nextLine();


        System.out.print("4. Введіть рядок: ");
        String inputStr = scanner.nextLine();
        System.out.println("   Рядок в зворотньому порядку: " + reverseString(inputStr));
        System.out.println();


        System.out.print("5. Введіть a: ");
        int a = scanner.nextInt();
        System.out.print("   Введіть b: ");
        int b = scanner.nextInt();
        System.out.println("   Результат " + a + "^" + b + " дорівнює " + power(a, b) + ".");
        System.out.println();


        System.out.print("6. Введіть ціле число n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("   Введіть текстовий рядок: ");
        String text = scanner.nextLine();
        repeatText(n, text);

        scanner.close();
    }

    public static void printSquare(int number) {
        System.out.println("   Квадрат числа " + number + " дорівнює " + (number * number) + ".");
    }

    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static int calculateArraySum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static void repeatText(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}

