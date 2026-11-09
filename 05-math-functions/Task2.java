import java.lang.Math;
import java.util.Scanner;

public class Task2 {
    public static final double E = Math.E;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть значення A: " );
        double a = scanner.nextDouble();

        System.out.println("Введіть значення B: " );
        double b = scanner.nextDouble();

        System.out.println("Введіть значення X: " );
        double x = scanner.nextDouble();

        double res;

        if (x < -2) {
            res = Math.sin(x);
        } else if (x == -2) {
            res = 2 * Math.pow(E, a*x) - 1;
        } else if (x > -2 && x < 8) {
            res = Math.pow((b * x + 2 * a), -2);
        } else {
            System.out.println("Значення Х не підходить ні до однієї з умов");
            return;
        }
        System.out.println("Значення функції f(x): " + res);
    }
}
