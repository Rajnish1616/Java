import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        multiplication();
    }
    public static void multiplication() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter which table you want:");
        int num = input.nextInt();

        int i = 1;
        while (i < 11) {
            System.out.println(num + " * "+ i +" = "+ num*i);
            i++;
        }
    }
}
