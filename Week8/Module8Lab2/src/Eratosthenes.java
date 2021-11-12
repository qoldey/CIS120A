import java.util.Arrays;

public class Eratosthenes {
    public static void main(String[] args) {
        boolean[] output = sieve(50);

        //print results
        for (int i = 0; i < output.length; i++) {
            System.out.printf("%b %d\n", output[i], i);
        }

    }

    // a method called sieve that takes an integer parameter, n, and returns a
    // boolean array that indicates, for each number from 0 to n - 1, whether the
    // number is prime.
    public static boolean[] sieve(int n) {

        boolean[] a = new boolean[n];

        // set all positions true
        Arrays.fill(a, true);

        // first prime -> last prime from 2 -> n
        for (int i = 2; i < Math.sqrt(n); i++) {

            if (a[i] == true) {

                // mark starting at i^2, loop to n in multiples of i
                for (int j = i * i; j < n; j += i) {

                    // mark each non prime number as false
                    a[j] = false;
                }
            }
        }

        //return array with results.
        return a;
    }

}
