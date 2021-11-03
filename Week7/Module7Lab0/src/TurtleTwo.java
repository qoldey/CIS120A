import java.awt.Color; // rgb color 
import java.util.Random; // random number gen

public class TurtleTwo {

    static Turtle turtle = new Turtle(); // new pen
    static Random rng = new Random(); // rng
    static int scale; // global scale var

    public static void main(String[] args) {
        Turtle.bgcolor(new Color(17, 50, 77)); // background colour
        Color green = new Color(0, 255, 0);
        scale = 500; // scale
        turtle.width(1); // width of line
        turtle.hide(); // hide turtle graphic
        turtle.speed(1); // lower number draws faster, 100 is default.
        Stars(scale); // draw stars
    }

    public static void Stars(int scale) {
        for (int i = 0; i < 10; i++) {
            rngcolor(); // random colour
            Star(); // draw star
            rnglocation(); // move pen to random location
        }
        Turtle.zoomFit(); // zoom to fit end drawing
    }

    public static void rnglocation() {
        // random x y position [0-999] to start next star @
        int x = rng.nextInt(scale * 4);
        int y = rng.nextInt(scale * 4);
        turtle.setPosition(x, y);
    }

    public static void rngcolor() {
        // random number 0-255 for rgb values
        int r = (rng.nextInt(256));
        int g = (rng.nextInt(256));
        int b = (rng.nextInt(256));
        // assign rgb values to penColor
        turtle.penColor(new Color(r, g, b));
    }

    // move in motion of star @ scale
    public static void Star() {
        turtle.down(); // pen down
        turtle.right(36); // angle of start corner
        for (int i = 0; i < 5; i++) { // 5 lines to draw a star
            turtle.forward(scale);
            turtle.right(216); // 180 + 36
        }
        turtle.setDirection(0); // reset position after drawing star
        turtle.up(); // pen up
    }
}

// Modify the Turtle Graphics program you wrote in Module 4 that drew 10 stars
// at random locations in random colors. Replace the repeated code you wrote
// (you wrote essentially the same code 10 times) with a for loop. Instead of
// specifying the colors with Strings as you did before, create random colors as
// discussed in the Instructor Notes for this module.