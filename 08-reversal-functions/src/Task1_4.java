import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        String input = validate();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Оберіть функцію:");
            System.out.println("1 - Перевернути всю строку");
            System.out.println("2 - Перевернути кожне слово окремо");
            String choice = sc.nextLine();

            if (choice.equals("1")) {
                String result = reverseString(input);
                System.out.println("Перевернута строка: " + result);
                break;
            } else if (choice.equals("2")) {
                String result = reverseWords(input);
                System.out.println("Строка з перевернутими словами: " + result);
                break;
            } else {
                System.out.println("Невірний вибір. Спробуйте ще раз");
            }
        }
    }
    public static String validate() {
        Scanner sc = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("Введіть строку:");
            input = sc.nextLine().trim();
            String[] words = input.split(" ");
            if (words.length < 2) {
                System.out.println("Строка має містити хоча б два слова");
                continue;
            }
            boolean valid = true;
            for (String word : words) {
                if (word.length() < 3) {
                    valid = false;
                    break;
                }
            }
            if (!valid) {
                System.out.println("УСІ слова повинні містити більше 3 символів!");
                continue;
            }
            return input;
        }
    }
    public static String reverseString(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }
        return reversed;
    }
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String reversedWord = "";
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reversedWord = reversedWord + words[i].charAt(j);
            }
            result = result + reversedWord;
            if (i < words.length - 1) {
                result = result + " ";
            }
        }
        return result;
    }
}
