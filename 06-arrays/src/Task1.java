import java.util.Random;

public class Task1 {
    public static final int size = 8;

    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = random.nextInt(100);
        }
        int pare = 0;
        int notpare = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                pare++;
            } else {
                notpare++;
            }
        }
        System.out.println("Згенерований масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nКількість парних чисел: " + pare);
        System.out.println("Кількість непарних чисел: " + notpare);
    }
}