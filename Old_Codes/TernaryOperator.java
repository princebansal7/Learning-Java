// Ternary operator in java:

// (condition) ? (returns-something_if_true) : (return_something_if_false)
// => unlike C/C++ , in java here instead of a statement we write something which can be returned
//eg:
//   (a>b) ? System.out.println("a is big"):System.out.println("b is big"); // Wrong
//   String str = (a>b)? "a is big":"b is big"; // Correct
// => we can write functions too if they don't have return type void i.e, they return something 
//    (also works in C/C++ irrespective of return type)

// NOTE:
//  int x = (a>b) ? System.out.println("a is big"):System.out.println("b is big"); // Syntax Error
//  => System.out.print() : Doesn't return anything
//  c/c++, printf() had return type int
//  but System.out.print() have return type void

//  - To accept a single character use: System.in.read();

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // System.out.print("Enter 2 Numbers a & b: ");
        // int a = s.nextInt();
        // int b = s.nextInt();
        // String ans = a > b ? "a is Greater" : "b is Greater";
        // System.out.println(ans);

        // Now, we want to print a, b values too

        // String ans = a > b ? a + " is Greater" : b + " is Greater";
        // System.out.println(ans);

        // Nested ternary:

        System.out.print("Enter 3 Numbers a, b & c: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        String ans = (a > b) ? ((a > c) ? a + " is Gretaer" : c + " is Greater")
                : ((b > c) ? b + " is Gretaer" : c + " is Greater");
        System.out.println(ans);
    }
}
