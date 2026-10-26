package app;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100;
        }

        System.out.println("Елементи масиву: " + Arrays.toString(array));

        int sumNegative = 0;
        int evenCount = 0;
        int oddCount = 0;

        int minElement = array[0];
        int minIndex = 0;
        int maxElement = array[0];
        int maxIndex = 0;

        int firstNegativeIndex = -1;

        for (int i = 0; i < array.length; i++) {
            int current = array[i];

            if (current < 0) {
                sumNegative += current;
                if (firstNegativeIndex == -1) {
                    firstNegativeIndex = i;
                }
            }

            if (current % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            if (current < minElement) {
                minElement = current;
                minIndex = i;
            }
            if (current > maxElement) {
                maxElement = current;
                maxIndex = i;
            }
        }

        System.out.println("Сума від'ємних чисел: " + sumNegative);
        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);
        System.out.println("Найменший елемент: " + minElement + " (з індексом " + minIndex + ")");
        System.out.println("Найбільший елемент: " + maxElement + " (з індексом " + maxIndex + ")");

        if (firstNegativeIndex == -1 || firstNegativeIndex == array.length - 1) {
            System.out.println("Середнє арифметичне чисел після першого від'ємного числа: від'ємних чисел немає або після них немає елементів.");
        } else {
            int sumAfter = 0;
            int countAfter = 0;
            for (int i = firstNegativeIndex + 1; i < array.length; i++) {
                sumAfter += array[i];
                countAfter++;
            }
            double averageAfter = (double) sumAfter / countAfter;
            System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f%n", averageAfter);
        }
    }
}
