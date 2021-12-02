import java.util.Scanner;

public class Middle {
    public static void main(String[] args) {
        //asks the user to enter three integer values
        int[] out = midSearch(inputIntArray(3));
        System.out.printf("Min: %d\nMid: %d\nMax: %d\n", out[0], out[1], out[2]);
    }

    // in : three{3} ints
    // out : min, mid, max
    public static int[] midSearch(int[] input) {
        if (!(input.length == 3)) {
            throw new IllegalArgumentException("Requires three(3) args");
        }
        int a = input[0], b = input[1], c = input[2];
        int[] out = new int[3];
        // Using smaller methods is the point of this assignment, but wouldn't it be
        // faster to use < & > here since that's all the method is doing?
        if (min(a, b) == a && min(a, c) == a && max(b, c) == c) { // if(a < b && a < c && c > b) //the same?
            out[0] = a;
            out[1] = b;
            out[2] = c;
        } else if (min(a, c) == a && min(a, b) == a && max(c, b) == b) {
            out[0] = a;
            out[1] = c;
            out[2] = b;
        } else if (min(b, a) == b && min(b, c) == b && max(a, c) == c) {
            out[0] = b;
            out[1] = a;
            out[2] = c;
        } else if (min(b, c) == b && min(b, a) == b && max(c, a) == a) {
            out[0] = b;
            out[1] = c;
            out[2] = a;
        } else if (min(c, a) == c && min(c, b) == c && max(a, b) == b) {
            out[0] = c;
            out[1] = a;
            out[2] = b;
        } else if (min(c, b) == c && min(c, a) == c && max(b, a) == a) {
            out[0] = c;
            out[1] = b;
            out[2] = a;
        } else {
            System.out.println("it broke");
        }
        return out;
    }

    //a method named min which accepts two parameters of type int and returns an int.  The return value is the smaller of the two parameters - the minimum value.
    public static int min(int x, int y) {
        if (x > y) {
            return y;
        } else {
            return x;
        }
    }
    //an analogous method named max.
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
