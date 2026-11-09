import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість кутів: ");
        int size = scanner.nextInt();
        int[] angles = new int[size];
        int Anglesum = 0;
        System.out.println("Введіть значення кутів: ");
        for (int i = 0; i < size; i++) {
            angles[i] = scanner.nextInt();
            Anglesum += angles[i];
        }
        int ideal = 180 * (size - 2);
        int fact = Anglesum;

        System.out.println("Сума кутів ідеального многокутника: " + ideal);
        System.out.println("Сума кутів вказаного многокутника: " + fact);

        if (Anglesum == ideal) {
            System.out.println("Такий багатокутник існує");
        } else {
            System.out.println("Такий багатокутник не існує");
        }
    }
}
