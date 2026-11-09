import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];

        System.out.println("Введіть елементи матриці (по рядках):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int det = calculateDet(matrix);
        System.out.println("Визначник матриці: " + det);
    }

    public static int calculateDet(int[][] matrix) {
        if (matrix.length == 1) {
            return matrix[0][0];
        }

        if (matrix.length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        // Розклад за першим рядком
        int det = 0;
        for (int i = 0; i < matrix.length; i++) {
            det += Math.pow(-1, i) * matrix[0][i] * calculateDet(createSub(matrix, 0, i));
        }
        return det;
    }

    public static int[][] createSub(int[][] matrix, int excludingRow, int excludingCol) {
        int[][] submatrix = new int[matrix.length - 1][matrix.length - 1];
        int subRowIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (i == excludingRow) {
                continue;
            }
            int subColsIndex = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == excludingCol) {
                    continue;
                }
                submatrix[subRowIndex][subColsIndex] = matrix[i][j];
                subColsIndex++;
            }
            subRowIndex++;
        }
        return submatrix;
    }
}