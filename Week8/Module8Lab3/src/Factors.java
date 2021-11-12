public class Factors {
    public static void main(String[] args) throws Exception {

        int[] m = { 1, 3, 9, 11, 33, 99 };

        int n = 99;

        System.out.println(areFactors(n, m));
    }

    public static boolean areFactors(int n, int[] m) {

        for (int i = 0; i < m.length; i++) {
            if (!(n % m[i] == 0)) {
                return false;
            }
        }
        return true;

    }

}
