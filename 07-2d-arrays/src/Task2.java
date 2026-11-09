import java.util.Random;

public class Task2 {
    public static final int rows = 3;
    public static final int col = 3;

    public static void main(String[] args) {
        double[][] array = new double[rows][col];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = random.nextDouble(5) * 100;
            }
        }

        System.out.println("Початковий масив:");
        for (double[] rows : array) {
            for (double num : rows) {
                System.out.printf("%.2f ", num);
            }
            System.out.println();
        }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < col; j++) {
                    if (i % 2 != 0 || j % 2 != 0) {
                        array[i][j] = Math.sqrt(array[i][j]);
                    }
                }
            }
            System.out.println("\nРедагований масив:");
            for (double[] rows : array) {
                for (double num : rows ) {
                    System.out.printf("%.2f ", num);
                }
                System.out.println();
            }
    }
}

