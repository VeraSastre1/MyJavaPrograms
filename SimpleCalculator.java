import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        int first_num;
        int second_num;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        first_num = scan.nextInt();
        System.out.print("Enter the second number: ");
        second_num = scan.nextInt();

        scan.nextLine();

        int sum = first_num + second_num;
        int difference = first_num - second_num;
        int product = first_num * second_num;
        float quotient = (float) first_num / second_num;
        int remainder = first_num % second_num;

        scan.nextLine();

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        scan.close();
    }
}