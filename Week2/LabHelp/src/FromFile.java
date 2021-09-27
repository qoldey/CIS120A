import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FromFile {
        public static void main(String[] args) throws FileNotFoundException {

                String dir = System.getProperty("user.dir");
                String path = dir + "/src/combos/combos.txt";
                FileReader file = new FileReader(path);

                Scanner scanner = new Scanner(file);

String 


                ArrayList <String> combos = new ArrayList<String>();

                BufferedReader reader = new BufferedReader(file);

                while (scanner.hasNextLine()) {
                        System.out.println(scanner.nextLine());
                }

                // 4-26 == AAA
                //
                // int i
                // for (int i = 50; i < 72; i++) {

                // System.out.println(line.nextLine());
                // }

        }
}
