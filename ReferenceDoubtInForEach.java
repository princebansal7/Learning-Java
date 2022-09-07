import java.util.Scanner;

public class ReferenceDoubtInForEach {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int []arr = new int[5];
        int sum = 0;
        for(int i=0;i<5;i++){
            System.out.print("Enter number "+(i+1)+": ");
            int a = s.nextInt();
            arr[i] =a;
        }
        for(Integer x:arr) {
            x = x+10;
            System.out.print(x+" ");
        }
        System.out.println();
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}