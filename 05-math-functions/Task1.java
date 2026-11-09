import java.lang.Math;

public class Task1 {
    public static final double a = 0.1;
    public static final double b = 1.4;
    public static final double alpha = 0.02;
    public static final double z = 3*Math.pow(10, -3);
    public static final double k = 4.5;

    public static void main(String[] args) {
        double x = Math.pow(Math.E, Math.sqrt(1 - a*Math.sin(b)));
        System.out.println("Значення Х: " + x);

        double y = (a*k)/(4*Math.log((alpha-z)/z));
        System.out.println("Значення Y: " + y);
    }
}