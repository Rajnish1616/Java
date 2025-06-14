import java.util.Scanner;
public class print_from_n_to_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number n: ");
        int n = input.nextInt();
        PI(n);

    }
    public static void PI(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        PI(n-1);
    }
}
