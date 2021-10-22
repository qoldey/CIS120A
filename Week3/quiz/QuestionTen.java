import java.util.Scanner;

public class QuestionTen {

    public static void main(String[] args) {
        int inch;
        double cm;
        final double CM_PER_INCH = 2.54;
        Scanner input = new Scanner(System.in);
        System.out.print("How many inches? ");
        inch = input.nextInt();
        cm = inch * CM_PER_INCH;
        System.out.printf("%d in = %.2f cm\n", inch, cm);
        input.close();
    }
}
