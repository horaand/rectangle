package rectangle;

import java.util.Random;

public class rectangle {
    public static void main(String[] args) {
        Random random = new Random();

        double num1 = Math.round(random.nextDouble() * 10 * 100.0) / 100.0;
        double num2 = Math.round(random.nextDouble() * 10 * 100.0) / 100.0;

        System.out.println(num1);
        System.out.println(num2);

        double rectangle = 2 * (num1 + num2);
        System.out.println("Perimeter of a rectangle: " + rectangle);

        double area = (num1 * num2);
        System.out.println("Area of a rectangle: " + area);
    }
}
