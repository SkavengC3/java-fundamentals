import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введіть розмір масиву: " );
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = random.nextInt();
        }
        System.out.println("Початковий масив: " );
        for (int num : array){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Введіть пошукове число: " );
        int search = scanner.nextInt();
        System.out.println("Введіть значення для заміни: " );
        int newint = scanner.nextInt();

        boolean find = false;
        for(int i = 0; i < size; i++){
            if (array[i] == search){
                array[i] = newint;
                find = true;
            }
        }
        if(find){
            System.out.println("Оновлений масив: " );
            for(int num : array){
                System.out.print(num + " ");
            }

        }
    }
}
