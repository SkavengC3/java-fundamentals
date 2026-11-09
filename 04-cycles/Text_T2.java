import java.util.Scanner;

public class Text_T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть текст: "); // Для правильной работы в конце КАЖДОГО ПРЕДЛОЖЕНИЯ нужен знак препинания
        String txt = scanner.nextLine();

        int Sentences = 0;
        int i = 0;

        while (i < txt.length()) {
            char ch = txt.charAt(i);
            if (ch == '.' || ch == '!' || ch == '?') {
                Sentences++;
            }
            i++;
        }
        System.out.print("В цьому тексті " + Sentences + " речень");
    }
}
