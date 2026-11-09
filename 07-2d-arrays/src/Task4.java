import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість рядків матриці: ");
        int rows = scanner.nextInt();
        System.out.print("Введіть кількість стовпців матриці: ");
        int col = scanner.nextInt();

        int[][] matrix = new int[rows][col];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Створена матриця:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Введення індексів мінору
        System.out.print("Введіть індекс рядка для обчислення мінора (починаючи з 1): ");
        int rowIndex = scanner.nextInt() - 1;
        System.out.print("Введіть індекс стовпця для обчислення мінора (починаючи з 1): ");
        int colIndex = scanner.nextInt() - 1;

        // Перевірка коректності
        if (rowIndex < 0 || rowIndex >= rows || colIndex < 0 || colIndex >= col) {
            System.out.println("Некоректні індекси мінора.");
            return;
        }
        // Обчислення мінора
        int minor = calculateMinor(matrix, rowIndex, colIndex);
        System.out.println("Мінор матриці: " + minor);
    }
    // Рекурсивна функція для обчислення мінора
    public static int calculateMinor(int[][] matrix, int row, int col) {
        int n = matrix.length;
        if (n == 1) {
            return matrix[0][0];
        } else {
            int det = 0;
            for (int j = 0; j < n; j++) {
                det += Math.pow(-1, row + j) * matrix[row][j] * calculateMinor(getSubmatrix(matrix, row, j), 0, 0);
            }
            return det;
        }
    }
    // Отримання субматриці
    public static int[][] getSubmatrix(int[][] matrix, int row, int col) {
        int n = matrix.length;
        int[][] submatrix = new int[n - 1][n - 1];
        for (int i = 0, k = 0; i < n; i++) {
            if (i == row) {
                continue;
            }
            for (int j = 0, l = 0; j < n; j++) {
                if (j == col) {
                    continue;
                }
                submatrix[k][l] = matrix[i][j];
                l++;
            }
            k++;
        }
        return submatrix;
    }
}
