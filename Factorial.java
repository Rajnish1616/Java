import java.util.Scanner;
public class Factorial {
    static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        int result = n*fact(n-1);
        return result;

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = input.nextInt();

        System.out.println("Factorial of "+n+" is "+fact(n));
    }
}
