import java.util.ArrayList;
import java.util.Arrays;

public class Anagram extends Library {
    /// public static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void main(String[] args) {

        // an anagram is basically when two strings char arrays match.
        // Examples: betas, baste, abets : stop, pots : allen downey, well annoyed

        // write inputs array
        String write = ":w";
        // quit program
        String quit = ":q";
        // exit message
        String exit = "Exiting, Goodbye (^-^*)/";
        // welcome message
        String welcome = "Keybinds:\nCompare current entries = " + write + "\nQuit = " + quit;

        System.out.println(welcome);

        while (true) {
            System.out.printf("Input String");
            // get inputs with passed settings

            // ArrayList<String> inputs = inputArray(write, quit, exit);
            ArrayList<String> inputs = inputArray();

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

// Two words are anagrams if they contain the same letters and the same count of
// each letter - each letter that appears in both words also appears the same
// number of times. For example, “stop” is an anagram of “pots” and “allen
// downey” is an anagram of “well annoyed”. Write a method that takes two
// strings and checks whether they are anagrams of each other.

// Include your method in a Java program that interacts with the user, asking
// them to enter a pair of strings, reporting whether they are anagrams, and
// asking if the user wishes to continue or terminate the program.