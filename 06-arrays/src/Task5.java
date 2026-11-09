import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        System.out.println("Перевірити масив на зростання або спадання (1 або 2)? ");
        int check = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Згенерований масив: ");
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000); //Нехай буде 1000
            System.out.print(array[i] + " ");
        }
        System.out.println();

        boolean ifup = true;
        switch (check) {
            case 1:
                for (int i = 0; i < size - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        ifup = false;
                        break;
                    }
                }
                System.out.println(ifup ? //Використовую тернарний оператор, хоча ми його не вчили
                        "Масив зростає" :
                        "Масив не зростає");
                break;

            case 2:
                for (int i = 0; i < size - 1; i++) {
                    if (array[i] < array[i + 1]) {
                        ifup = false;
                        break;
                    }
                }
                System.out.println(ifup ?
                        "Масив спадає" :
                        "Масив не спадає");
                break;

            default:
                System.out.println("Операція незрозуміла");
                break;
        }
    }
}
