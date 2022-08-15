public class PrimeInRange {

    public static void main(String[] args) {
        int a = 1, b = 50;

        // LOGIC-1:
        // boolean ok = false;
        // for (int i = a; i <= b; i++) {
        //     for (int j = 2; j < i; j++) {
        //         if (i % j == 0) {
        //             ok = true; // Not prime
        //             break;
        //         }
        //     }
        //     if (i == 1) { // edge case
        //         ok = true;
        //     }
        //     if (ok == false) // prime found
        //         System.out.println(i + " ");
        //     ok = false; // resetting when not prime found
        // }

        // LOGIC-2:
        int j;
        for (int i = a; i <= b; i++) {
            for (j = 2; j < i; j++)
                if (i % j == 0)
                    break;

            if (i == j) {
                System.out.println(i); // prime
            }
        }
    }
}
