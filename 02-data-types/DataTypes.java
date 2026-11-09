import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Типи даних Java:");
        System.out.println("Тип\tРозмір(B)\tМінімальне значення\tМаксимальне значення");
        System.out.println("byte\t1\t\t" + Byte.MIN_VALUE + "\t\t\t\t" + Byte.MAX_VALUE);
        System.out.println("short\t2\t\t" + Short.MIN_VALUE + "\t\t\t\t" + Short.MAX_VALUE);
        System.out.println("int\t\t4\t\t" + Integer.MIN_VALUE + "\t\t\t" + Integer.MAX_VALUE);
        System.out.println("long\t8\t\t" + Long.MIN_VALUE + " " + Long.MAX_VALUE);
        System.out.println("char\t2");
        System.out.println("boolean\t1\t\tFalse\t\t\t\tTrue");
        System.out.println("float\t4\t\t" + Float.MIN_VALUE + "\t\t\t\t" + Float.MAX_VALUE);
        System.out.println("double\t8\t\t" + Double.MIN_VALUE + "\t\t\t" + Double.MAX_VALUE);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть тип даних (byte, short, int, long, char, boolean, float, double)");
        String dataType = scanner.nextLine();
        System.out.print("Введіть значення: ");
        String value = scanner.nextLine();

        try {
            switch (dataType) {
                case "byte":
                    byte byteValue = Byte.parseByte(value);
                    System.out.println("Значення в байтах: " + byteValue);
                    break;
                case "short":
                    short shortValue = Short.parseShort(value);
                    System.out.println("Значення для short: " + shortValue);
                    break;
                case "int":
                    int intValue = Integer.parseInt(value);
                    System.out.println("Значення для int: " + intValue);
                    break;
                case "long":
                    long longValue = Byte.parseByte(value);
                    System.out.println("Значення для long: " + longValue);
                    break;
                case "char":
                    char charValue = value.charAt(0);
                    System.out.println("Символ: " + charValue);
                    break;
                case "boolean":
                    boolean booleanValue = Boolean.parseBoolean(value);
                    System.out.println("Логічне значення: " + booleanValue);
                    break;
                case "float":
                    float floatValue = Float.parseFloat(value);
                    System.out.println("Значення з комою: " + floatValue);
                    break;
                case "double":
                    double doubleValue = Double.parseDouble(value);
                    System.out.println("Значення зі збільшеною комою: " + doubleValue);
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Невірне ведення.");
        }
    }
}
