public class Array {
    public static void main(String[] args) {
        int[] myarr = new int[5];
        myarr[0] = 12;
        myarr[1] = 32;
        myarr[2] = 42;
        myarr[3] = 52;
        myarr[4] = 22;
        System.out.println(myarr[0]);
        System.out.println(myarr[1]);
        System.out.println(myarr[2]);
        System.out.println(myarr[3]);
        System.out.println(myarr[4]);

        int index = 0;
        while (index < 5) {
            System.out.println("the elements of array is: " + myarr[index]);
            index = index + 1;
        }

    }
}
