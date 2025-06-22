public class maximum_in_array {
    static int maximum(){
        int[] arr = {1,3,5,453,6,7,2};
        int max = 0;
        for(int i = 0; i<arr.length;i++){
            if(max <= arr[i]){
                max = arr[i];
            }
        } return max;
    }

    public static void main(String[] args) {
        System.out.println("Maximum in the array is: "+maximum());
    }
}
