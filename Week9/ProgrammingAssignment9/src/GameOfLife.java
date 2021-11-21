import java.util.Arrays;

public class GameOfLife {

    // Any live cell with fewer than two live neighbors dies, as if caused by under
    // population.
    // Any live cell with two or three live neighbors lives on to the next
    // generation.
    // Any live cell with more than three live neighbors dies, as if by
    // overpopulation.
    // Any dead cell with exactly three live neighbors becomes a live cell, as if by
    // reproduction.
    public static void main(String[] args) {
        System.out.println("hello");
    }

    public static void life() {
        boolean[][] world = new boolean[10][10];

        for (int i = 0; i < world.length; i++) {
            Arrays.fill(world[i], true);
            for (int j = 0; j < world[i].length; j++) {
                System.out.println(world[i][j]);

            }
        }

    }
}
