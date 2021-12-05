import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) throws Exception {
        double[] input = { 3, 2, 3, 4, 6, 5 };

        System.out.println("Input: " + Arrays.toString(input));
        double[] output = sort(input);

        System.out.printf("First: %.2f\nMid: %.2f\nLast: %.2f\nOutput: %s \n", output[0],
                output[output.length / 2],
                output[output.length - 1], Arrays.toString(output));
    }

    public static double[] sort(double[] in) {
        if (!(in.length == 1)) {

            int mid = in.length / 2; // middle of array
            double[] first = new double[mid]; // first half
            double[] second = new double[in.length - mid]; // second half, can be odd

            for (int i = 0; i < mid; i++) {
                first[i] = in[i]; // assign first half of array
            }
            for (int i = mid; i < in.length; i++) {
                second[i - mid] = in[i]; // assign second half
            }

            // repeat mergeSort on each half
            sort(first);
            sort(second);

            merge(in, first, second);// combine results for one array
        }
        return in;
    }

    public static double[] merge(double[] in, double[] first, double[] second) {
        int i = 0, left = 0, right = 0; // merged, first, and second array counters

        while (left < first.length && right < second.length) { // do until we are out of elements to add
            if (first[left] <= second[right]) { // if left is smaller,
                in[i] = first[left]; // add it to the output array
                left++; // next element in left array
            } else { // if right is smaller
                in[i] = second[right]; // add it to the output array
                right++;// next element in right array
            }
            i++; // counter
        }

        // add remaining elements
        while (left < first.length) {
            in[i] = first[left];
            left++;
            i++;
        }
        while (right < second.length) {
            in[i] = second[right];
            right++;
            i++;
        }
        return in; // arrays are pointers
    }
}