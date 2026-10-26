package app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        System.out.println("Початковий вигляд масиву: " + Arrays.toString(array));

        insertionSort(array);

        System.out.println("Відсортований масив: " + Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для пошуку: ");

        if (scanner.hasNextInt()) {
            int target = scanner.nextInt();
            int index = binarySearch(array, target);

            if (index != -1) {
                System.out.println("Індекс числа " + target + " у відсортованому масиві: " + index);
            } else {
                System.out.println("Числа " + target + " немає в масиві.");
            }
        } else {
            System.out.println("Помилка: введено не ціле число.");
        }

        scanner.close();
    }



    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }
}

