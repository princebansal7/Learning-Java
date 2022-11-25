
public class Program4 {
    public static void main(String[] args) {
        int a = 10, b = 240;
        System.out.println("Before Swapping: \na=" + a + " b=" + b);

        // Without using 3rd variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping: \na=" + a + " b=" + b);
    }
}
