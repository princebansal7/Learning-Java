import java.util.Scanner;

// to use package in our program, we use import
// java.util.* => util package all classes 
// java.util.Scanner => util package ki sirf scanner class use kr rhe h apne program me
// in c/c++ we don't have this facility, but in java we can use that particular class only which we want to use.
// No # statement => no preprocessor concept in java, only compiler handles it

class UserInputScannerClass {
    public static void main(String[] args) {
        // To Take input from user

        // nextByte(), nextShort(), nextInt(), nextLong()
        // nextFloat(), nextDouble()
        // nextBoolean()
        // next() => take input string without space like scanf() in c
        // nextLine() => take input string with space like gets() in c
        // nextChar() --> Does not exist

        // They Belongs to Scanner class and they are Non static => they'll get called
        // using an Object
        // Why scanner class ? because in Java we can take input from internet, sockets
        // (IP + Port number),
        // keyboard, files etc

        // So we've to connect with it
        // eg: if we take input with keyboard => Scanner s = new Scanner(System.in);
        // as taking input from Keyboard is represented by Object 'in' of System class
        // in java

        // let there is an Emp class in java
        // then how to create it's object ?

        // Emp E = new Emp();
        // Where:
        // E = reference variable
        // new is operator
        // Emp() => paranthesis is compulsory, if parameters then pass in it

        Scanner s = new Scanner(System.in); // s & in are object reference

        System.out.println("Enter two numbers; ");
        int x = s.nextInt(); // calling with the help of object s of Scanner class to take int input
        int y = s.nextInt(); // calling with the help of object s of Scanner class to take int input
        // if we don't take int input => java.util.InputMismatchException

        System.out.println("Sum is: " + (x + y));
    }
}

// Some key Points:
// Compiler forcing us to import for Scanner class,
// But, for System, String we are not doing any importing,
// because, System, String are present in lang package => java.lang and
// this package is by default get imported by java