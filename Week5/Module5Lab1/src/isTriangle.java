import java.util.Scanner;

public class isTriangle {
    public static void main(String[] args) {
        double[] input = input();

        double a = input[0];
        double b = input[1];
        double c = input[2];
        // Invokes a boolean method named isTriangle() passing the three side lengths as
        // arguments
        if (isTrianglee(a, b, c)) {
            System.out.printf("%.2f, %.2f & %.2f can form a triangle.\n", a, b, c);
        } else {
            System.out.printf("%.2f, %.2f & %.2f cannot form a triangle.\n", a, b, c);
        }
    }

    // I was getting this error with the name isTriangle, so I renamed it.
    // isTriangle: This method has a constructor name
    public static boolean isTrianglee(double a, double b, double c) {
        // Uses the return value from the method to report whether the three side
        // lengths can form a triangle
        return (a + b > c && b + c > a && c + a > b);
        // the sum of any two must exceed the third to be a triangle.
        // geogebra.org/m/JHgTXKrt - visual
    }

    public static double[] input() {
        Scanner input = new Scanner(System.in);
        double[] output = new double[3];

        // Prompts the user to enter three side lengths as doubles
        for (int i = 0; i < 3; i++) {
            System.out.printf("Side%d: ", i);
            while (true) {
                if (input.hasNextDouble()) {
                    output[i] = input.nextDouble();
                    break;
                } else {
                    System.out.print("Error. Enter a valid number: ");
                    input.next();
                }
            }
        }
        input.close();
        return output;
    }
}
