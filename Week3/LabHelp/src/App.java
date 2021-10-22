import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // String s = "1451234123142";

        // long l = Long.parseLong(input.nextLine());

        String s;

        // while and do while loops are similar.
        // do while loops loop at least once before checking the condition
        System.out.print("Number: ");
        do {
            s = input.nextLine();
            try {
                Long.parseLong(s);
                break;

            } catch (NumberFormatException e) {
                // if we get a NumberFormatException error, don't kill the program,
                // print message and continue looping.
                System.out.print("Enter a number: ");
            }
        } while (true);
        input.close();

        System.out.println(s + 4);

    }
}
