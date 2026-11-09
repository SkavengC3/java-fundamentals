public class Task4 {
    public static void main(String[] args){
        System.out.println("Таблиця синусів для значень від 0 градусів до 90: " );

        int count = 0;
        for (int degrees = 0; degrees <= 90; degrees++) {
            double rad = Math.toRadians(degrees);
            double values = Math.sin(rad);
            System.out.printf("%5.3f ", values);
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}
