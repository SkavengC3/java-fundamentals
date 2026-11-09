import java.util.Scanner;
import java.text.MessageFormat;

public class Formating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int integer = scanner.nextInt();

        System.out.print("Введіть число з плаваючою точкою: ");
        double floating = scanner.nextDouble();
        scanner.nextLine();//Зізнаюся, не сам до цього допер

        System.out.print("Введіть рядок: ");
        String string = scanner.nextLine();

        System.out.print("Введіть логічне значення (true або false): ");
        boolean bool = scanner.nextBoolean();

        System.out.println("Виведення цілого числа у десятковій системі: " + integer);
        System.out.format("Ціле число в шістнадцятковій системі: %x\n", integer);
        System.out.format("Ціле число в вісімковій системі: %o\n", integer);
        System.out.format("Число з плаваючою точкою з двома знаками після коми: %.2f\n", floating);
        System.out.format("Строка с фиксированной длиной 20 символов: %.20s\n", string);
        System.out.format("Строка в верхнем регистре: %s\n", string.toUpperCase());
        System.out.format("Логическое значение: %b\n", bool);
        System.out.format("Число з плаваючою точкою у науковому форматі%e\n", floating);

        String pattern = "Ціле число: {0}, число з плаваючою точкою: {1}, рядок: {2}, логічне значення: {3}";
        String formatted = MessageFormat.format(pattern, integer, floating, string, bool);
        System.out.println(formatted);
    }
}