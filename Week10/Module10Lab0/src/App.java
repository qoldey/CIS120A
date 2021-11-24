import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int target = 5; // temp val, target needs to be middle val of input
        search(target, inputIntArray(3));

    }

    public static void search(int target, int[] input) {

        for (int i = 0; i < input.length; i++) {
            if (input[i] == target) {
                System.out.printf("Found %d in %d iterations\n", input[i], i);
            }
        }

    }

    public static int min(int x, int y) {

        if (x > y) {
            return y;
        } else {
            return x;
        }
    }

    public static int max(int x, int y) {

        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static int[] inputIntArray(int x) {

        int[] output = new int[x];

        for (int i = 0; i < output.length; i++) {
            output[i] = inputInt();
        }
        return output;

    }

    public static int inputInt() {
        int output = 0;// tmp
        Scanner sysin = new Scanner(System.in);
        System.out.print("$ ");// prompt
        if (sysin.hasNextLine()) {
            output = sysin.nextInt();
        } else {
            inputInt();
        }
        return output;
    }
}
