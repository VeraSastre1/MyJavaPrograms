import java.util.Scanner;

public class CircleAreaCalculator {

    public static void main(String[] args) {
        double radius;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        radius = scan.nextDouble();

        double area = (double) (Math.PI) * radius * radius;

        System.out.printf("The area of the circle is: %.2f", area);

        System.out.println();

        scan.close();

    }
}