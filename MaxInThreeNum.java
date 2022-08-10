import java.util.Scanner;

public class MaxInThreeNum {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
         System.out.print("Enter 3 Numbers a, b & c: ");
         int a = s.nextInt();
         int b = s.nextInt();
         int c = s.nextInt();

         if(a>b){
            if(a>c){
                System.out.println("a is greatest");
            }
            else{
                System.out.println("c is greatest");
            }
         }
         else{
            if(b>c){
                System.out.println("b is greatest");

            }
            else{
                System.out.println("c is greatest");
            }
         }
    }
}
