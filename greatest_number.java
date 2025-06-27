import java.util.Scanner;

public class greatest_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the greatest of all");
        }else if (num2 >= num3) {
            System.out.println(num2 + " is the greatest of three");
        }else {
            System.out.println(num3 + " is the greatest of three");
        }
    }
}
