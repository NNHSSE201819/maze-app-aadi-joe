import java.util.ArrayList;
import java.util.Scanner;

public class Maze {
    private Square[][] maze;


    public Maze()
    {

    }
    public boolean loadMaze(String frame)
    {
         Scanner s = new Scanner(frame);
         int row = s.nextInt();
         int col = s.nextInt();
        this.maze = new Square[row][col];

        for (int r=0; r < row; r++) {
            for (int c=0; c < col; c++) {
                maze[r][c] = null;
            }
        }
    }

    public ArrayList<Square> getNeighbors(Square sq)
    {

    }

    public Square getStart()
    {
        for (int r=0; r < maze.length; r++) {
            for (int c=0; c < maze[0].length; c++) {
                if (maze[r][c].getType() == 2)
                {return maze[r][c];}
            }
        }
    }
    public  Square getFinish()
    {
        for (int r=0; r < maze.length; r++) {
            for (int c=0; c < maze[0].length; c++) {
                if (maze[r][c].getType() == 3)
                {return maze[r][c];}
            }
        }
    }

    public void reset()
    {

    }

    public String toString()
    {

    }

}
