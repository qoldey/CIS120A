public class StringManip {
    public static void main(String[] args) throws Exception {
        String input = "TestString";
        char testChar = 't';
        int indexOf = indexOfC(input, testChar); // index of testChar in input
        System.out.println(indexOf);

    }

    // return the index of the first occurrence of the char parameter if found,
    // return -1 if not.
    // two input parameters: a String to search and a char to search for.
    public static int indexOfC(String inString, char inChar) {
        int out = 0;

        if (inString.contains(Character.toString(inChar))) { // if found
            int i = 0;
            for (char letter : inString.toCharArray()) {
                if (Character.toString(letter).equals(Character.toString(inChar))) { // caps sensitive,equalsIgnoreCase
                    out = i; // return index
                    break;
                }
                i++;
            }
        } else {
            out = -1; // -1 if not
        }

        return out;

    }

    // replace every occurrence of a char in a String with another
    // input parameters: a String to search and replace in,
    // a char to search for and a char to replace with.
    public static void replaceC() {

        // Your replace method can make use of your indexOf
        // method. This method will require three

        // When you try to replace a char in a String you will run into a complication:
        // Java Strings are immutable - you literally cannot change their content. So
        // your
        // replace method is going to have to build a new String character by character,
        // choosing either to append the char from the original String, or instead the
        // replacement char, when building the new String.

    }
}
