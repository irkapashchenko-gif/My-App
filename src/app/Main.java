package app;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50) + 1;
            }
        }

        System.out.println("Матриця 4x4:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%2d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int sumEvenRows = 0;
        int sumOddRows = 0;
        long prodEvenCols = 1;
        long prodOddCols = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0) {
                    sumEvenRows += matrix[i][j];
                } else {
                    sumOddRows += matrix[i][j];
                }

                if (j % 2 == 0) {
                    prodEvenCols *= matrix[i][j];
                } else {
                    prodOddCols *= matrix[i][j];
                }
            }
        }

        System.out.println("Сума елементів у парних рядках (рядок 0, 2): " + sumEvenRows);
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " + sumOddRows);
        System.out.println("Добуток елементів у парних стовбцях (стовпець 0, 2): " + prodEvenCols);
        System.out.println("Добуток елементів у непарних стовбцях (стовпець 1, 3): " + prodOddCols);
        System.out.println();

        boolean isMagicSquare = checkMagicSquare(matrix);
        if (isMagicSquare) {
            System.out.println("Матриця є магічним квадратом.");
        } else {
            System.out.println("Матриця не є магічним квадратом.");
        }
    }

    public static boolean checkMagicSquare(int[][] matrix) {
        int n = matrix.length;

        int targetSum = 0;
        for (int j = 0; j < n; j++) {
            targetSum += matrix[0][j];
        }

        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != targetSum) return false;
        }

        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != targetSum) return false;
        }

        int mainDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i];
        }
        if (mainDiagonalSum != targetSum) return false;

        int sideDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            sideDiagonalSum += matrix[i][n - 1 - i];
        }
        if (sideDiagonalSum != targetSum) return false;

        return true;
    }
}
