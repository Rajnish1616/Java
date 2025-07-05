import java.util.Scanner;

public class Compound_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double p = input.nextDouble();

        System.out.print("Enter rate: ");
        double r = input.nextDouble();

        System.out.print("Enter time: ");
        double t = input.nextDouble();

        double base = (1 + r/100);
        double exponent = t;


        double result = Math.pow(base,exponent);
        double compoundInterest = p * result;

        System.out.println("compound interest will be: "+compoundInterest);
    }

}

