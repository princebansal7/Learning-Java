import java.util.Scanner;

public class JaggedArrayExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Salesman: ");
        int n = s.nextInt();
        int[][] salesman = new int[n][];

        for (int i = 0; i < salesman.length; i++) {
            System.out.print("Enter number of sales made by salesman" + (i + 1) + ": ");
            int m = s.nextInt();
            salesman[i] = new int[m];
            for (int j = 0; j < salesman[i].length; j++) {
                System.out.print("Enter sale " + (j + 1) + ": ");
                salesman[i][j] = s.nextInt();
            }
        }

        for (int[] sales : salesman) {
            int sum = 0;
            for (int val : sales) {
                sum += val;
            }
            System.out.println("Total sale is: " + (sum));
        }

    }
}
