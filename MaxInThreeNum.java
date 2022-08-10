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

// NOTE:
// in C/C++
//     if(Non_Zero_value)
//     {
// 
//     }  => this is allowed due to implicit type casting => non zero value get converted to true
// But in Java:
// doing above thing is not allowed as narrowing ( going big range to small) isn't allowed => gives error
// => if(true){
//
//    }

// => if(false){
// 
//    }     
// => only this is allowed => only boolean value is allowed in while(), if() etc conditions
