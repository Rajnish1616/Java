import java.util.Scanner;

public class Swap_two_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number a: ");
        int a = input.nextInt();

        System.out.print("Enter the second number b: ");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
