import java.util.*;

class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password;
        do{
            System.out.print("Enter your Password: ");
            password = input.next();
        } while(!isValidPassword(password));
        System.out.println("your password i");
    }
    public static boolean isValidPassword(String password){
        return password.length() >6;
    }
}
