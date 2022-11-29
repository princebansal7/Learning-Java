
public class p9 {
    public static void main(String[] args) {
        int n = 1554;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        if (count == 3)
            System.out.println("yes 3 digit number");
        else
            System.out.println("No");
    }
}