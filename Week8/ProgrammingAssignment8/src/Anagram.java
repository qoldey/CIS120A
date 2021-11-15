import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void main(String[] args) {
        // input

        String out = inputString();
        System.out.println(out);

        String inOne = "arches";
        String inTwo = "chaser";

        boolean check = AnagramCheck(inOne, inTwo);

        System.out.println(check);

        // and anagram is basically when two strings char arrays match.
    }

    public static String inputString() {
        String output = "";
        Scanner input = new Scanner(System.in);
        System.out.print("In: ");
        if (input.hasNextLine()) {
            output = input.nextLine();
        } else {
            inputString();
        }
        return output;
    }

    public static boolean AnagramCheck(String inOne, String inTwo) {

        int[] arrayOne = letterHist(inOne);
        System.out.println();
        int[] arrayTwo = letterHist(inTwo);

        // print letterHist
        if (Arrays.equals(arrayOne, arrayTwo)) {
            return true;

        } else {
            return false;
        }

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

// Two words are anagrams if they contain the same letters and the same count of
// each letter - each letter that appears in both words also appears the same
// number of times. For example, “stop” is an anagram of “pots” and “allen
// downey” is an anagram of “well annoyed”. Write a method that takes two
// strings and checks whether they are anagrams of each other.

// Include your method in a Java program that interacts with the user, asking
// them to enter a pair of strings, reporting whether they are anagrams, and
// asking if the user wishes to continue or terminate the program.