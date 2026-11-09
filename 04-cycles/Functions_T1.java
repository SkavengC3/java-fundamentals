import java.util.Scanner;

public class Functions_T1 {
    public static double calculate(double x, double a, double b) {
        try {
            if (x >= 1 && x < 3) {
                if (a == 0) {
                    return Double.NaN; //Возвращаем ошибку деления на ноль, NaN
                }
                    return 9 / (a * x);
            } else if (x == 3) {
                return Math.abs(a * x * x + x + b);
            } else {
                return Double.NaN; //Возвращаем ошибку выходящего за рамки Х, NaN
                }
        } catch (Exception e) {
            System.out.println("Помилка при розрахуванні: " + e.getMessage());
            return Double.NaN;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();

        System.out.print("Введіть значення a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть значення b: ");
        double b = scanner.nextDouble();


        try {
            double result = calculate(x, a, b);
            System.out.println("f(x) = " + result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}