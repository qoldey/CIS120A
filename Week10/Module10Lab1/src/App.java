import java.util.Arrays;

public class App {

    // find
    public static void main(String[] args) throws Exception {
        double[] input = { 3, 2, 3, 4, 6, 5 };

        System.out.println(Arrays.toString(input));
        // System.out.println(Arrays.toString(mergeSort(input)));
    }

    public static void mergeSort(double[] input) {

        // TODO: change from return values to referencing the direct input array and
        // changing it.
        if (input.length < 2) {
            // return;
        }

        int mid = input.length / 2;
        double[] leftArray = new double[mid];
        double[] rightArray = new double[input.length - mid];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = input[i];
        }
        for (int i = mid; i < input.length; i++) {
            rightArray[i - mid] = input[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        combine(input, leftArray, rightArray);
    }

    private static double[] combine(double[] in, double[] left, double[] right) {
        int m = 0, r = 0, l = 0; // merged, left, and aright array counters
        double[] out = new double[in.length]; // merged output

        while (m < left.length && r < right.length) { // do until we are out of elements to add
            if (left[l] <= right[r]) { // if left is smaller, add it to the output array
                out[m] = left[l];
                l++; // next element in left array
            } else { // if right is smaller, add it to the output array
                out[m] = right[r];
                r++;// next element in right array
            }
            m++;
        }

        // add any missed elements
        while (l < left.length) {
            out[m] = left[l];
            m++;
            l++;
        }
        while (r < right.length) {
            out[m] = right[r];
            m++;
            r++;
        }
        return out;
    }
}