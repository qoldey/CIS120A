import java.util.Scanner;

public class Interactive {
        public static void main(String[] args) {

                String BRG = """

                                   **********   **********     **********
                                   **      ***  **      ***   ****    ****
                                   **      ***  **      ***  ***
                                   ***********  ***********  **
                                   ***********  *********    **      *****
                                   **      ***  **    ***    ***        **
                                   **      ***  **     ***    ****    ****
                                   **********   **      ***    **********
                                   *********    **       ***      ****
                                """;
                String SLR = """

                                     *********   **           **********
                                    ***     ***  **           **      ***
                                    ***          **           **      ***
                                    *********    **           ***********
                                      *********  **           *********
                                            ***  **           **    ***
                                    ***     ***  **           **     ***
                                     *********   **           **      ***
                                       *****     ***********  **       ***
                                """;

                System.out.println("Please Enter Your Initials: "); // prompt user
                System.out.println("First Initial: ");
                Scanner input = new Scanner(System.in); // get input
                String initials = input.next(); // set input

                System.out.println("Second Initial: ");
                String initials2 = input.next();

                System.out.println("Third Initial: ");
                String initials3 = input.next();
                input.close();

                System.out.println("Initials as Stars: ");

                String[] initialsArray = { initials, initials2, initials3 };

                if (initialsArray[0].equalsIgnoreCase("s") && initialsArray[1].equalsIgnoreCase("l")
                                && initialsArray[2].equalsIgnoreCase("r")) {
                        System.out.println(SLR);
                } else {
                        System.out.println(BRG);
                }

                for (String counter : initialsArray) {
                        System.out.print(counter.toUpperCase());
                }
                System.out.println();
                /*
                 * SAR
                 * 
                 * 
                 */

                // if user doesn't input one of available strings, return default value, saying
                // "not added to database".

        }
}
