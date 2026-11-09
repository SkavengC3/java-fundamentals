import java.util.Scanner;

public class One2N_T3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть число N: ");
        int N = scanner.nextInt();

        System.out.println("Числа від 1 до " + N + ":");

        for (int i = 1; i <= N; i++) {
            boolean isPrime = true; //Проверка, является ли число простым
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
