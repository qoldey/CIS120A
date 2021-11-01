import java.util.Scanner;

public class EstRoot {
    public static void main(String[] args) throws Exception {

        double input;
        // loop around this section so that the user may keep having square roots
        // computed by your program.
        System.out.println("To exit enter a negative.");
        while (true) {
            // prompt the user for the value they want the square root of and invoke the
            // squareRoot method to compute it.
            input = input();
            // way to have the user tell the program to stop is to put in a negative value
            if (input > 0) {
                double out = squareRoot(input);
                // Report the results
                System.out.println(out);
            } else {
                System.out.println("Goodbye 0/");
                break;
            }
        }

    }

    // Write a method called squareRoot that takes a double and returns an
    // approximation of the square root of the parameter
    public static double squareRoot(double a) {
        // next guess
        double x1;

        // first guess
        double x0;

        // As your initial guess, try a/2
        x1 = 2;

        do {
            x0 = x1;
            // A formula who, given a number (a) finds its square root by starting with a
            // rough guess (x0) and then improves the guess (x1)
            x1 = (x0 + (a / x0)) / 2;

            // iterate until it gets two consecutive estimates that differ by less than
            // 0.0001
        } while (Math.abs(x0 - x1) > 0.0001);
        // use Math.abs to calculate the absolute value of the difference

        return x1;
    }

    // validate the user input as discussed in Module 5
    public static double input() {
        double output;
        Scanner input = new Scanner(System.in);

        System.out.print("squareRoot: ");
        while (true) {
            if (input.hasNextDouble()) {
                output = input.nextDouble();
                break;
            } else {
                System.out.print("Error: Enter valid number: ");
                input.next();
            }
        }

        // input.close(); Cannot close input scanner since the method will be used again
        return output;
    }

}
