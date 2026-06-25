import java.util.Scanner;

public class TriangleAreaCalculator {

    public static void main(String[] args) {
        double base;
        double height;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the base: ");
        base = scan.nextDouble();
        System.out.print("Enter the height: ");
        height = scan.nextDouble();

        double area = (double) base * height / 2;

        System.out.printf("The area of the triangle is: %.2f", area);

        System.out.println();

        scan.close();

    }
}