import java.awt.Color; // Allows us to get rgb color schemes within our class.
import java.util.Random; // "Random" Number Generator

//https://www.stevenlrichardson.com/CIS120A/WebContent/TurtleJavadoc/

//a program that uses the Turtle class to produce 10 randomly located five-pointed stars each with a randomly selected color.  See image
public class Stars extends Turtle {
    // inherit the Turtle class from Turtle.jar

    public static void main(String[] args) {
        new Stars(200); // new Stars object
    }

    Stars(int scale) { // object where we will be drawing.
        Random rng = new Random();
        bgcolor(new Color(53, 31, 91)); // rgb colors assigned to background

        width(1); // width of line
        hide(); // hide turtle graphic
        speed(1); // lower number draws faster, 100 is default.%

        // int size = 200; // starting size

        for (int i = 0; i < 10; i++) {
            // random number 0-255 for red green and blue values
            int r = (rng.nextInt(256));
            int g = (rng.nextInt(256));
            int b = (rng.nextInt(256));
            // assign rgb values to penColor
            penColor(new Color(r, g, b));

            down(); // pen down
            Star(scale);// move in motion of star @ scale
            up(); // pen up

            // random x y position [0-999] to start next star @
            int x = rng.nextInt(1000);
            int y = rng.nextInt(1000);
            setPosition(x, y);
        }
        zoomFit(); // zoom to fit end drawing
    }

    public void Star(double scale) { // draws a square @ size of input
        right(36); // angle of start corner
        for (int i = 0; i < 5; i++) { // 5 lines to draw a star
            forward(scale);
            right(216); // 180 + 36
        }
        setDirection(0); // reset position after drawing star
    }

}
