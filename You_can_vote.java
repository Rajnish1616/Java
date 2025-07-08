import java.util.Scanner;

public class You_can_vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("you cannot vote");
        }
    }
}
