import java.util.Scanner;

public class IfGotcha {
  public static void main(String[] args) {
    int x = 4;
    int y = 0;
    if (x == 0) {
      if (y == 0) {
        System.out.println("Both x and y are zero");
      }
    } else if (x == 0) {
      System.out.println("Either x or y is zero");
    } else if (y == 0) {
      System.out.println("Either x or y is zero");
    } else {
      System.out.println("Neither x nor y is zero");
    }

  }

  public static void isPositive(int number) {

    if (number > 0) {
      System.out.printf("%d is positive.\n", number);
    } else if (number < 0) {
      System.out.printf("%d is negative.\n", number);
    } else {
      System.out.printf("%d = 0\n", number);
    }
  }

  public static int input() {
    Scanner kbdInput = new Scanner(System.in);

    boolean test = true;
    int number = 0;
    System.out.print("Input Int: ");
    do {
      if (kbdInput.hasNextInt()) {
        number = kbdInput.nextInt();
        test = false;
      } else {
        System.out.print("Error. Enter a valid int: ");
        kbdInput.next();
      }
    } while (test == true);
    kbdInput.close();
    return number;
  }

}