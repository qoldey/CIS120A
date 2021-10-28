public class App {
    public static void main(String[] args) {
        loop(0);
    }

    public static void loop(int n) {
        int i = n;
        while (i > 1) {
            System.out.println(i);
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = i + 1;
            }
        }
    }

    String quiz = """
                1)

            iteration	i	n
            1	10	10
            2	5	10
            3	6	10
            4	3	10
            5	4	10
            6	2	10

            2)

            Output:

            10
            5
            6
            3
            4
            2

            3)

            So long as n is divisible by 2, it will be divided by 2. 

            If n is not divisible by 2, 1 will be added to it, thereby making it divisible by 2.

            One of these two cases will always occur for any value greater than 1.
                """;

}
