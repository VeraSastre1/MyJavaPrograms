import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
       
       double fahrenheit;
       
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = scan.nextDouble();
        
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        System.out.printf("Temperature in Celsius: %.2f\u00B0C", celsius);
        
        System.out.println();

        scan.close(); 
    }
}