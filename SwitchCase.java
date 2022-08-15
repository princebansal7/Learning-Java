public class SwitchCase {
    public static void main(String[] args) {

        // NOTE: In java,
        // - Inside switch() condition only byte, char, short, int,
        //   boolean, String is allowed
        // - float, double, long is not allowed (due to range issue)
        // - In case, only byte, char, short, int, boolean, String, their value is
        //   allowed

        // will taking command line argument: a + b or a - b etc
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[2]);

        switch (args[1]) {
            case "+":
                System.out.println("Sum is: " + (x + y));
                break;
            case "-":
                System.out.println("Subtraction is: " + (x - y));
                break;
            case "/":
                System.out.println("Division is: " + (x / y));
                break;
            case "X": // we can't pass * as command line argument as it is reserved for other use in
                      // command line terminal
                System.out.println("Multiplication is: " + (x * y));
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
