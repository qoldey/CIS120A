public class quiz {
    public static void main(String[] args) { // calls other methods for a cleaner main function
        // adder(19, 25); // numbers to add
        // adder(25, 41); // numbers to add
        // time(02, 50); // enter current time to time parameters
        math(17, 4);

    }

    public static void adder(int x, int y) { // method to add x and y
        int z = x + y; // z = x + y
        System.out.println(x + " + " + y + " = " + z); // Print results

    }

    public static void time(int hour, int minute) { // method to get current time
        for (int i = 0; i < 59; i++) {// repeat 60 times
            minute = minute + i; // add 1 to minute every minute
            System.out.println("The current time is " + hour + ":" + minute + "."); // print current time.

            // You can also add "InterruptedException" between the method name and the
            // opening bracket for any method calling Thread.sleep.
            // try/catch handles the error locally, so less clutter in other methods.
            try { // try sleeping the current active thread for one (1) minute
                Thread.sleep(60000); // ms in a minute This will wait a minute before looping.
            } catch (InterruptedException e) { // if get this response, failed.
                e.printStackTrace(); // if fails, catch the error and print to screen.
            }
        }

    }

    public static void math(int numerator, int denom) {

        int x = numerator / denom;
        int y = numerator % denom;
        float z = (float) numerator / (float) denom;

        System.out.println(numerator + " / " + denom + " = " + x);
        System.out.println(numerator + " % " + denom + " = " + y);
        System.out.println((float) numerator + " / " + (float) denom + " = " + z);
    }

}
