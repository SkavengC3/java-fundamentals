import java.util.Random;

public class Task1 {
    public static final int rows = 5;

    public static void main(String[] args) {
        int[][] pyramid = new int[rows][];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            pyramid[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                pyramid[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Піраміда у прямому порядку:");
        printPyr(pyramid);

        System.out.println("\nПіраміда у зворотному порядку:");
        printPyReverse(pyramid);
    }
    // Виведення піраміди у звичайному порядку
    static void printPyr(int[][] pyramid) {
        for (int i = 0; i < pyramid.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pyramid[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Виведення піраміди у зворотному порядку
    static void printPyReverse(int[][] pyramid) {
        for (int i = pyramid.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pyramid[i][j] + " ");
            }
            System.out.println();

        }
    }
}