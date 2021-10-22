public class CountChange {
    public static void main(String[] args) {
        int quarters = 3;
        int dimes = 2;
        int nickels = 2;
        int pennies = 1;

        System.out.println(quarters + " quarter(s)");
        System.out.println(dimes + " dime(s)");
        System.out.println(nickels + " nickel(s)");
        System.out.println("and " + pennies + " penny(s) is:");
        System.out.println("$" + changeCount(quarters, dimes, nickels, pennies)); // prints output of changeCount
    }

    public static double changeCount(int quarter, int dime, int nickel, int penny) { // converts change dollar format
        double cash = (0.01) * ((25 * quarter) + (10 * dime) + (5 * nickel) + (1 * penny));
        // multiply total cash in cents by .01 to convert to dollar format.
        return cash; // return output of cash

    }
}
