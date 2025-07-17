import java.util.Scanner;

public class Fahrenheit_to_celsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in fahrenheit: ");
        double f = input.nextDouble();

        double celsius = (f - 32) * 5/9;
        System.out.println("\n Temperature in celsius: " + celsius);

    }
}
