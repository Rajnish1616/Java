import java.util.*;

 class Exit {
     public static void main(String[] args) {
         Scanner input = new Scanner (System.in);

         while(true){
             System.out.print("enter your string: ");
             String word = input.next();
             if(word.equals("Exit") ){
                 break;
             }
         }
         System.out.println("you have successfully exited");
     }
}
