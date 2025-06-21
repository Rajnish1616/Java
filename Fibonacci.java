import java.util.Scanner;
public class Fibonacci {
    static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibo(n-1) +fibo(n-2);


    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = input.nextInt();

        if (n<0){
            System.out.println("Enter positive number only");
        }else {
            System.out.println("Fibonacci series of "+n+" is "+fibo(n));
        }
        for(int i=0;i<=n;i++){
            System.out.println(fibo(i));
        }


    }
}
