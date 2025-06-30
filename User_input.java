import java.util.Scanner;

public class User_input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("hello "+ name);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println(name + "Your age is " + age);
    }
}
