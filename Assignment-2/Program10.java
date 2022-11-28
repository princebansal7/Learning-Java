public class Program10 {
    public static void main(String[] args) {
        // rotating number towards right by 1 position

        int n = 1001;
        int count = 0; // to count digits
        int temp = n;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int digit = n % 10; // fetching last digit
        int newNum = n / 10; // getting number without unit digit

        while (count > 0) {
            digit *= 10;
            count--;
        }

        newNum = (digit / 10) + newNum;
        System.out.println("Rotated number is: " + newNum);

    }
}
