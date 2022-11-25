
public class Program3 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before Swapping: \na=" + a + " b=" + b);

        int temp = a; // using 3rd variable
        a = b;
        b = temp;

        System.out.println("After Swapping: \na=" + a + " b=" + b);
    }
}
