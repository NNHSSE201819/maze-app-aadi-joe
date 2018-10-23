import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Maze{
    private Square[][] maze;


    public Maze()
    {

    }
    public boolean loadMaze(String frame)
    {
        try
        {
            File mazeFile = new File(frame);
            Scanner s = new Scanner(frame);
            int row = s.nextInt();
            int col = s.nextInt();
            this.maze = new Square[row][col];

            for (int r=0; r < row; r++) {
                for (int c=0; c < col; c++) {
                    maze[r][c] = new Square(r,c,s.nextInt());
                }
            }
            return true;
        }
        catch(Exception e)
        {
            System.out.println( "The specified file: " + frame + " was not found." );
            return false;
        }


    }

    public ArrayList<Square> getNeighbors(Square sq)
    {
        ArrayList<Square> n = new ArrayList();
        int row = sq.getRow();
        int col = sq.getCol();

        if(maze[row-1][col]!= null)
        {
            n.add(maze[row+1][col]);
        }
        if(maze[row][col+1]!= null)
        {
            n.add(maze[row+1][col]);
        }
        if(maze[row+1][col]!= null)
        {
            n.add(maze[row+1][col]);
        }
        if(maze[row][col-1]!= null)
        {
            n.add(maze[row+1][col]);
        }
        return n;
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
    public Square getFinish()
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
        for (int r=0; r < maze.length; r++) {
            for (int c=0; c < maze[0].length; c++) {
                maze[r][c].reset();
            }
        }
    }

    public String toString()
    {

    }

}
