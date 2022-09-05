import java.util.Scanner;

public class TernaryFunc {


    public static String check(int a,int b){
        if(a>b) return "true";
        return "false";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = s.nextInt();
        int b = s.nextInt();

        String ans = a>b?check(a,b):check(a,b);  // ternary can handle functions too
        // but only those who returns something

        System.out.println(ans);
        
    }
}