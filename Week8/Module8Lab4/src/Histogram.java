public class App {
    public static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void main(String[] args) {
        String in = "75170fc230cd88f32e475ff4087f81d9";

        int[] charCount = letterHist(in);

        String[][] histogram = new String[charCount.length][alphabet.length];
        for (int i = 0; i < alphabet.length; i++) {

            histogram[i][0] = Character.toString(alphabet[i]);
            histogram[i][1] = Integer.toString(charCount[i]);

        }

        for (int i = 0; i < charCount.length; i++) {

            System.out.printf("%d %C : ", charCount[i], alphabet[i]);
            for (int j = 0; j < charCount[i]; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        // Try Showing most reoccurring letter first next??

    }

    // a method called letterHist that takes a string as a parameter and returns a
    // histogram of the letters in the string.
    public static int[] letterHist(String input) {
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

        return charCount;
    }

}
