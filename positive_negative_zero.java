import java.util.Scanner;

public class positive_negative_zero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number:");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("It is a positive number");
        } else if (num < 0) {
            System.out.println("It is a negative number");
        } else {
            System.out.println("It is zero");
        }
    }
}
