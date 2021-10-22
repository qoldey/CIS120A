public class Printf {
    public static void main(String[] args) {
        float f = 1.20213123f;
        double d = 2.2213123124d;
        int i = 4; // %03d will 'zero(0) fill the number if it is less than 3 digits'
        String s = "wow";

        int u = 4;
        // double z = u * .01;
        System.out.println(u * .01);
        System.out.printf("%.2f", u * .01);

        System.out.printf("float: %.3f Double: %.2f Int: %03d String: %s\n\n", f, d, i, s);
        // %.3f formats doubles AND floats to only have 3 decimal points
        // trying to format something that
        // See what happens if you try to display a value with type int using %f.
        // When trying to format an int into a float, we get an
        // IllegalFormatPrecisionException: 2. This is the compiler telling us that it
        // cannot format an int using double formatting.

        // And what happens if you display a double using %d
        // When trying to display a double with integer formatting, we get the same
        // error, this is because Java cannot format a double using formatting intended
        // for an int.

        // What if you use two format specifiers, but then only provide one value?
        // If we attempt to format more arguments than we provide, we get the same error
        // of printf being unable to complete the task, thus throwing another
        // IllegalFormatPrecisionException

        double x;
        x = 3.14159;
        System.out.printf("x is %f", x);
    }
}