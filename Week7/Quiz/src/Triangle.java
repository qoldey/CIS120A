public class App {
    public static void main(String[] args) throws Exception {
        independence();
    }

    public static void independence() {

        int x = 1;
        System.out.println(x % 2);
        if (x % 2 == 0) {
            System.out.println("x is even");
        }
    }

    public static void multiplytable(int range) {

        for (int i = 1; i < range + 1; i++) {

            for (int j = 1; j < range + 1; j++) {
                System.out.printf(" %4d", j * i);
            }
            System.out.println();

        }

    }

    public static void checkString() {
        String str = "test"; // Line of text entered by the user.
        int count; // Number of different letters found in str.
        char letter; // A letter of the alphabet.

        str = str.toUpperCase();

        count = 0;
        System.out.println("Your input contains the following letters:");
        System.out.println();
        System.out.print("   ");
        for (letter = 'A'; letter <= 'Z'; letter++) {
            int i; // Position of a character in str.
            for (i = 0; i < str.length(); i++) {
                if (letter == str.charAt(i)) {
                    System.out.print(letter);
                    System.out.print(' ');
                    count++;
                    break;
                }
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("There were " + count + " different letters.");
    }
}
