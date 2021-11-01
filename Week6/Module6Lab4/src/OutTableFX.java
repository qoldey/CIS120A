public class OutTableFX {

    // a program that will print out a t-table. A t-table is a two-column table of x
    // values and f(x) values where f is some function.
    public static void main(String[] args) {

        int iterations = 10; // iterations
        double x = 2;
        double fx;
        int xlength;
        int fxlength;

        System.out.printf("     x     |     2^x\n--------------------------\n");

        // print out a table of values for integer values of x in the interval [0,10}.
        x = 0;
        for (; x <= iterations; x++) {
            fx = Math.pow(2, x);

            // log in base 10 and round up = number of digits in number:
            xlength = (int) (Math.log10(x) + 1); // Math.log10 returns a double and adding one will round up
            fxlength = (int) (Math.log10(fx) + 1); // because it drops the decimals when casted to int

            if (x == 0) { // without this I get xlength = the min value possible
                xlength = 1;
            }
            // x 10's position is 5 spaces away from -
            for (int i = 0; i < 5 - xlength; i++) {
                System.out.print(" ");
            }
            System.out.printf("%.2f   |", x);

            // fx 10's position is 8 spaces away from |
            for (int i = 0; i < 8 - fxlength; i++) {
                System.out.print(" ");
            }
            System.out.printf("%.2f\n", fx);

            fx = x;
        }
    }
}
