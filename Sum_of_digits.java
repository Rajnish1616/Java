import java.util.Scanner;
public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int sum = digit(num);
        System.out.println("Sum of the digits of given number is: " + sum);
    }
    public static int digit(int num){
        int sum = 0;
        while (num > 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        return sum;
    }
}
