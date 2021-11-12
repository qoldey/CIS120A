public class Histogram {
    public static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void main(String[] args) {
        // input
        String in = "75170fc230cd88f32e475ff4087f81d9";

        // print letterHist
        letterHist(in, true);
    }

    // a method called letterHist that takes a string as a parameter and returns an
    // int array with the frequency of each letter, optionally printing the results
    // as a histogram with the print parameter.
    public static int[] letterHist(String input, boolean... print) {
        int[] charCount = new int[alphabet.length];

        char letter;

        // Only traverse the string once.
        for (int i = 0; i < input.length(); i++) {

            letter = input.charAt(i);

            for (int j = 0; j < alphabet.length; j++) {

                // The zeroth element of the histogram should contain the number of a’s in the
                // string (upper- and lowercase); the 25th element should contain the number of
                // z’s.
                if (Character.toLowerCase(letter) == Character.toLowerCase(alphabet[j])) {
                    charCount[j]++;
                }

            }

        }

        if (print.length > 0 && print[0] == true) {
            for (int i = 0; i < charCount.length; i++) {

                System.out.printf("%d %C : ", charCount[i], alphabet[i]);
                for (int j = 0; j < charCount[i]; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }

        }

        return charCount;
    }

}
