import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.printf("\n%s\n", help());

        String human;
        Scanner input = new Scanner(System.in);
        String move;

        // Repeat steps 2 - 4 two more times, then terminate the program.
        // to change max number of games playable,
        // i > 0 = infinite games
        // i < 4 = 3 games.
        for (int i = 1; i > 0; i++) {
            System.out.printf("Game #%d\n:/> ", i);

            // Prompt the user for their selection.
            do {
                while (true) {
                    if (input.hasNextLine()) {
                        move = input.nextLine();
                        break;
                    } else {
                        System.out.println("Error. R, P, S or N? ");
                        input.nextLine();
                    }
                }
            } while (!(move.substring(0, 1).equalsIgnoreCase("r")) && !(move.substring(0, 1).equalsIgnoreCase("p"))
                    && !(move.substring(0, 1).equalsIgnoreCase("s")) && !(move.substring(0, 1).equalsIgnoreCase("n"))
                    && !(move.substring(0, 1).equalsIgnoreCase("h")));

            human = move.substring(0, 1).toLowerCase();
            if (human.equals("n")) {
                break;
            } else if (human.equals("h")) {
                System.out.printf("\n%s\n", help());
            } else {
                newgame(human, computer());
                System.out.printf("Play Again?\n\n");
            }
        }
        input.close();

    }

    // a void method that takes as parameters the user's choice and the program's
    // choice and determines and reports the result.
    public static void newgame(String human, String computer) {

        human = human.substring(0, 1).toLowerCase();

        // Determine and report the winner
        if (computer.equals("r")) {
            System.out.printf("\nComputer Plays Rock!\n%s\n", art(computer));
        } else if (computer.equals("p")) {
            System.out.printf("\nComputer Plays Paper!\n%s\n", art(computer));
        } else {
            System.out.printf("\nComputer Plays Scissors!\n%s\n", art(computer));
        }
        if (computer.equals(human)) {
            System.out.println("Tie!");
        } else if (computer.equals("p") && human.equals("r") || computer.equals("r") && human.equals("s")
                || computer.equals("s") && human.equals("p")) {
            System.out.println("Computer Wins!");
        } else {
            System.out.println("You Win!");
        }
    }

    // Generate a random selection
    public static String computer() {
        Random random = new Random();
        char[] move = "prs".toCharArray();
        String computer = Character.toString(move[random.nextInt(move.length)]);
        return computer;
    }

    // A statement saying that the program is going to play Rock,
    // Paper, Scissors with the user, with a brief explanation of the rules.
    public static String help() {
        return """
                Welcome to Rock Paper Scissors :)
                To play, enter your move when prompted!
                The computer will generate her own response and the winner will be decided.
                Respond n to stop playing.
                Respond h to show this message.
                """;
    }

    public static String art(String art) {

        if (art.equals("r")) {
            art = """
                        _______
                    ---'   ____)
                          (_____)
                          (_____)
                          (____)
                    ---.__(___)
                    """;
        } else if (art.equals("p")) {
            art = """
                    _______
                    ---'    ____)____
                               ______)
                              _______)
                             _______)
                    ---.__________)
                    """;
        } else {
            art = """
                    _______
                    ---'   ____)____
                              ______)
                           __________)
                          (____)
                    ---.__(___)
                    """;
        }
        return art;
    }

}
