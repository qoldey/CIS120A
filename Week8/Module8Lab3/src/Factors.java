public class Factors {
    public static void main(String[] args) throws Exception {

        // number to check
        int n = 99;
        // test array
        int[] m = { 1, 3, 9, 11, 33, 99 };

        System.out.println(areFactors(n, m));
    }

    // a method named areFactors that takes an integer n and an array of integers,
    // and that returns true if the numbers in the array are all factors of n
    public static boolean areFactors(int n, int[] m) {

        // traverse m, if any number is not a factor, return false, else return true.
        for (int i = 0; i < m.length; i++) {
            if (!(n % m[i] == 0)) {
                return false;
            }
        }
        return true;

    }

}
