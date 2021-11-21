import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(toBase2(23));

    }

    public static String toBase2(int input) {
        if (input < 0) {
            System.out.println("Enter a value > 0");
            return null;
        }
        if (input == 0) {
            return "0";
        }
        long remainder;
        long quotient = input;
        byte[] result = new byte[64];

        remainder = quotient % 2; // get remainder
        result[result.length - 1] = (byte) remainder; // assign number to correct location in array
        for (int i = result.length - 2; i >= 0; i--) {
            quotient /= 2;
            remainder = quotient % 2;
            result[i] = (byte) remainder;
        }

        StringBuilder output = new StringBuilder();
        int i = 0;
        for (; i < result.length; i++) {
            if (result[i] != 0)
                break;
        }
        for (; i < result.length; i++) {
            output.append(result[i]);
        }
        return output.toString();
    }

    public static boolean passwordCheck(String input) {
        int caps = 0;
        int nums = 0;

        for (char letter : input.toCharArray()) {
            if (Character.isDigit(letter)) {
                nums++;
            }
            if (Character.isUpperCase(letter)) {
                caps++;
            }
        }
        System.out.printf("Your password contains %d capital letters, %d numbers, and %d chars\n", caps, nums,
                input.length());

        if (caps < 1 || nums < 1 || input.length() < 5) {
            System.out.println("Provide a stronger password.");
            return false;
        } else {
            System.out.println("Welcome to the website");
            return true;
        }
    }

    public static void printDivBy10(int in) {
        for (int i = in; i > 0; i--) {
            if (i % 10 == 0) {
                System.out.println(i);
            }
        }

    }

    public static boolean isTriangle(double sideOne, double sideTwo, double sideThree) {
        return (sideOne + sideTwo > sideThree && sideTwo + sideThree > sideOne && sideThree + sideOne > sideTwo);
        // only true of all three statements are true, else false.
    }

    // returns:
    // 1 if in > 0
    // -1 if in < 0
    // 0 if in == 0
    public static int input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Int: ");
        int in = input.nextInt();
        input.close();
        if (in > 0) {
            return 1;
        } else if (in < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
