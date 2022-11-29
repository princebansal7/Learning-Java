
public class p9 {
    public static void main(String[] args) {
        int n = 961, reverse = 0;

        int ld = n % 10;
        reverse = reverse * 10 + ld;
        n /= 10;

        ld = n % 10;
        reverse = reverse * 10 + ld;
        n /= 10;

        ld = n % 10;
        reverse = reverse * 10 + ld;
        n /= 10;

        System.out.println("Reverse is: " + reverse);

    }
}
