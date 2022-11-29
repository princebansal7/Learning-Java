
public class p4 {
    public static void main(String[] args) {
        int n = 13498;
        int sum = 0;
        while (n > 0) {
            int ld = n % 10;
            sum += ld;
            n /= 10;
        }
        System.out.println("Sum is: " + sum);
    }
}
