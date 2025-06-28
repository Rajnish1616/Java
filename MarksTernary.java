import java.util.Scanner;
public class MarksTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the marks: ");
        int marks = input.nextInt();

        String category = (marks >= 80) ? "high" : (marks >= 50 ? "moderate" : "low");
        System.out.println("Your category is: " + category);
    }
}
