import java.util.ArrayList;
import java.util.Arrays;

public class Anagram extends Library {
    public static void main(String[] args) {

        // an anagram is basically when two strings char arrays match.
        // Examples: betas, baste, abets : stop, pots : allen downey, well annoyed

        // Options
        String write = ":w";
        String quit = ":q";
        String exit = "Exiting, Goodbye (^-^*)/";
        String keybinds = "Keybinds:\nCompare current entries = " + write + "\nQuit = " + quit;

        System.out.println(keybinds);

        while (true) {
            // get inputs with passed options
            System.out.printf("Input String");
            ArrayList<String> inputs = inputArray(write, quit, exit);

            // check if inputs are Anagrams
            if (AnagramCheck(inputs)) {
                System.out.printf("True, Input Strings are anagrams.\n");
            } else {
                System.out.printf("False, Input Strings are not anagrams.\n");
            }
        }
    }

    // takes strings and checks whether they are anagrams of each other.
    public static boolean AnagramCheck(ArrayList<String> inputs) {

        // must compare at least 2 arrays
        if (inputs.size() < 2) {
            System.err.printf("ERROR 002: Method requires minimum two(2) String Arguments.\n");
            System.exit(0);
        }
        // same runtime of n3 compared to making separate array for letterHist returns
        for (int i = 0; i < inputs.size() - 1; i++) {
            // if any two input Strings' letterHist are not equal
            if (!Arrays.equals(letterHist(inputs.get(i)), letterHist(inputs.get(i + 1)))) {
                return false;
            }
        }
        return true;
    }
}