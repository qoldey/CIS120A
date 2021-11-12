import java.util.Arrays;

public class App {
    public static int[] make(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        return a;
    }

    public static void dub(int[] jub) {
        for (int i = 0; i < jub.length; i++) {
            jub[i] *= 2;
        }
    }

    public static int mus(int[] zoo) {
        int fus = 0;
        for (int i = 0; i < zoo.length; i++) {
            fus += zoo[i];
        }
        return fus;
    }

    public static void main(String[] args) {
        // int[] bob = make(5);
        int[] test = new int[5];
        test[0] = 1;
        test[1] = 2;
        test[2] = 3;
        test[3] = 4;
        test[4] = 5;

        int[] two = test;
        // dub(bob);
        int jub[] = two;
        jub[0] *= 2;
        jub[1] *= 2;
        jub[2] *= 2;
        jub[3] *= 2;
        jub[4] *= 2;

        // System.out.println(mus(bob));
        int[] zoo = test;
        int fus = 0;

        fus += zoo[0];
        fus += zoo[1];
        fus += zoo[2];
        fus += zoo[3];
        fus += zoo[4];

        System.out.println(fus);
        System.out.println(zoo.length);
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 }; // array initializer

        int[] b = java.util.Arrays.copyOf(a, 2);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        for (int i = 0; i < counts.length; i++) {
            int index = scores[i];
            counts[index]++;
        }

    }
}