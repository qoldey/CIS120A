import java.util.Scanner;

public class Sums {
    public static void main(String[] args) {
        // Argument
        System.out.printf("Enter x value: ");
        double x = input();

        // upper limit
        System.out.printf("Enter n value: ");
        double n = input();

        System.out.printf("%.2f: \n", gauss(x, n));
    }

    // returns the sum of the first n terms of the series.
    public static double gauss(double x, double n) {
        double sum = 0;
        double iteration = 0;
        double temp = 0;

        // Lower limit
        int i = 0;

        for (; i < n; i++) {

            iteration = (pow(-1, i) * (double) pow(x, (2 * i))) / factorial(i);
            sum += iteration;
            // System.out.println(iteration); //uncomment to show progress
        }
        System.out.printf("Sum of first %d terms in series: %.2f\n", i, sum);
        i = 0;
        iteration = 0;
        sum = 0;
        do {// I have yet to see this go past 26.
            temp = iteration;
            iteration = (pow(-1, i) * (double) pow(x, (2 * i))) / factorial(i);
            sum += iteration;
            // System.out.println(iteration); //uncomment to show progress.
            i++;
        } while (Math.abs(iteration - temp) > 0.0001);

        System.out.printf("Sum of first %d terms in series:\ni=0 n=%d ∑ (−1^i %.2f^2i) / i! = ", i, i, x);
        return sum;
        // exp(−x^2) = 1 − x2 + x^4/2 − x^6/6 + …
        // i=0∑n​ (−1^i x^2i) / (i!) --sub(i)=
        // -1^(0) x^2(0) / 0! + -1^(1) x^2(1) / (1)! + -1^(2) x^2(2) / (2)!
        // (1 (x^0) / (1)) + (-1 (x^2) / (1)) + (1 x^4 / (2*1)))
        // (1 / 1) + (-x^2 / 1) + (x^4/2)
        // 1 - x^2 + x^4/2 - x^6/6 + x^8/24 - ...
    }

    // compute the (even) powers of x
    public static long pow(double number, double pow) {
        long result = 1;
        for (int i = 0; i < pow; i++) {
            result *= number;
            // 1 * number, then number * number for each
        }
        return result;

    }

    // compute factorial denominators
    public static double factorial(double number) {
        // return number * (number - 1) * (number - 2)...factorial(0)=1
        if (number == 0) {
            return 1;
        } else {
            return (number * factorial(number - 1));
        }
    }

    public static double input() {
        double output;
        Scanner input = new Scanner(System.in);

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

class solution {
    public static double run() {
        // Add n terms of the series for e^(-x^2)

        double result = 0; // accumulator
        double x = .7; // a value for x
        int n = 20; // number of terms to add

        double term = 1; // first term in the series is 1
                         // we are assuming n >= 1

        result += term; // add the first term to the accumulator

        // got the first term added, now add the rest of them up

        for (int i = 1; i <= n; i++) {
            // to get the next term from the current one, increase power of x by 2
            // (so multiply by x twice), and increase the factorial
            // by a factor of i. This grows the denominator factorial by
            // 1 (i.e from 3! to 4!), which is what we want. Also switch the sign.
            // see https://laketahoecc.instructure.com/courses/6059/assignments/124369

            term = -(term * x * x) / i;

            // now add the new term on to the accumulator

            result += term;
        }

        // done! return the result
        return result;
    }

    public static void main(String[] args) {
        run();
    }
}