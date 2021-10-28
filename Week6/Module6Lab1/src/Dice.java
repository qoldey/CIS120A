import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 1; i > 0; i++) {
            //roll die 1
            int die1 = random.nextInt(6) + 1;
            //roll die 2
            int die2 = random.nextInt(6) + 1;
            //print results
            System.err.printf("Roll %d: %d & %d\n", i, die1, die2);
            //if snake eyes, kill and tell user how many rolls it took.
            if (die1 == 1 && die2 == 1) {
                System.out.printf("Snake Eyes! (Took %d rolls)\n", i);
                break;
            }
        }
    }
}
