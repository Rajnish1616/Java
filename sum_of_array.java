public class sum_of_array {
    static int add(){
        int[] arr = {1,5,3};
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The sum of elements in array: "+add());
    }
}

