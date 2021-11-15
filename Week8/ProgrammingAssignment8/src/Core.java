import java.util.Scanner;

//core utils
public class Core {

    public static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    // get String while user inputs string
    // TODO: add minimum user input of len 1
    public static String inputString() {
        String output = "";
        Scanner sysin = new Scanner(System.in);
        System.out.print("$ ");
        if (sysin.hasNextLine()) {
            output = sysin.nextLine();
        } else {
            inputString();
        }
        return output;
    }
}
