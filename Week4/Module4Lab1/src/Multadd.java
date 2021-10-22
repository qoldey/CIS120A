import java.util.Scanner;

public class Multadd {
    public static void main(String[] args) {
        // Create a new program called Multadd.java.
        Scanner input = new Scanner(System.in);

        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
        input.close();

        // Write a main method that tests multadd by invoking it with a few simple
        // parameters, like 1.0, 2.0, 3.0.
        System.out.printf("Result: %f \n", multadd(a, b, c));

        // Also in main, use multadd to compute the value sin(π/4)+(cos(π/4)/2)
        System.out.printf("Result: %f\n", multadd(Math.cos(Math.PI / 4.0), 1.0 / 2.0, Math.sin(Math.PI / 4.0)));

    }

    // Write a method called multadd that takes three doubles as parameters and that
    // returns a * b + c.
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

}
