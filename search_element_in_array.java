import java.util.Scanner;
public class search_element_in_array {
    static int search(int n){
        int[] arr = {12,45,23,23,54,65,78};
        for(int i = 0;i<arr.length;i++){
            if(n == arr[i]){
                return i;
            }
        }return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number to search in array: ");
        int n = input.nextInt();

        System.out.println("The number is present at index : "+search(n));
    }
}
