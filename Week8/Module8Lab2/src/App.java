import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        boolean[] output = sieve(20);

        for (int i = 0; i < output.length; i++) {
            System.out.printf("%b %d\n", output[i], i);
        }

    }

    public static boolean[] sieve(int n) {

        boolean[] a = new boolean[n];
        Arrays.fill(a, true);

        for (int i = 2; i < Math.sqrt(n); i++) {

            if (a[i] == true) {

                for (int j = i * i; j < n; j += i) {

                    a[j] = false;
                }
            }
        }

        return a;
    }

}
