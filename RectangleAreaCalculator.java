import java.util.Scanner;

public class RectangleAreaCalculator {

    public static void main(String[] args) {
        double length;
        double width;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length: ");
        length = scan.nextDouble();
        System.out.print("Enter the width: ");
        width = scan.nextDouble();

        double area = (double) length * width;

        System.out.println("The area of the rectangle is: " + String.format("%.2f", area));

        scan.close();

    }
}