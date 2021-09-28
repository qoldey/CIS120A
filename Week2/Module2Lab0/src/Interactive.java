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
                System.out.print("First Name/Initial: ");
                Scanner input = new Scanner(System.in); // Make new object that reads user input from CLI
                String initial1 = input.next(); // get initial 1

                System.out.print("Middle Name/Initial: ");
                String initial2 = input.next(); // get initial 2

                System.out.print("Last Name/Initial: ");
                String initial3 = input.next(); // get initial 3
                input.close(); // stop getting input

                String[] initialsArray = { initial1.substring(0, 1), initial2.substring(0, 1),
                                initial3.substring(0, 1) }; // make array with each initial from first line of users
                                                            // input

                System.out.print("Your Initials: ");
                for (String counter : initialsArray) {
                        System.out.print(counter.toUpperCase()); // print users initials
                        System.out.print(".");
                }
                System.out.println("");

                if (initialsArray[0].equalsIgnoreCase("s") && initialsArray[1].equalsIgnoreCase("l")
                                && initialsArray[2].equalsIgnoreCase("r")) { // if initials = SLR
                        System.out.println("Initials as Stars: ");
                        System.out.println(SLR); // print SLR in stars
                } else {
                        System.out.println("Initials Not in Database."); // if not
                        System.out.println("Showing Default Combination:");
                        System.out.println(BRG); // print default initials
                }

        }
}
