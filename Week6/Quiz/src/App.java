public class App {
    public static void main(String[] args) {
        String name1 = "Alan Turing";
        String name2 = "Ada Lovelace";
        int diff = name1.compareTo(name2);
        if (diff == 0) {
            System.out.println("The names are the same.");
        } else if (diff < 0) {
            System.out.printf("name1 comes before name2 by %d\n", diff);
        } else if (diff > 0) {
            System.out.printf("name2 comes before name1 by %d\n", diff);
        }
    }
}
