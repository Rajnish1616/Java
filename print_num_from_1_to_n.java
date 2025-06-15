import java.util.Scanner;
public class print_num_from_1_to_n {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number n: ");
        int n = input.nextInt();
        PI(n) ;
    }
    public static void PI(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        PI(n-1);
        System.out.println(n);
    }
}
