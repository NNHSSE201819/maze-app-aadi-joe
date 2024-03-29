import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Maze
{
    private Square[][] maze;


    public Maze()
    {

    }
    public boolean loadMaze(String frame)
    {
        try
        {
            File mazeFile = new File(frame);
            Scanner s = new Scanner(mazeFile);
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
        ArrayList<Square> n = new ArrayList<>();
        int row = sq.getRow();
        int col = sq.getCol();

        if(row == 0 && col == 0)
        {
            n.add(maze[row+1][col]);
            n.add(maze[row][col+1]);
            return n;
        }
        else if(row == 0 && col == maze[0].length-1)
        {
            n.add(maze[row+1][col]);
            n.add(maze[row][col-1]);
            return n;
        }
        else if(row == maze.length-1 && col == maze[0].length-1)
        {
            n.add(maze[row-1][col]);
            n.add(maze[row][col-1]);
            return n;
        }
        else if(row == maze.length-1 && col == 0)
        {
            n.add(maze[row-1][col]);
            n.add(maze[row][col+1]);
            return n;
        }
        else if(row == 0 && (col != 0 && col != maze[0].length-1))
        {
            n.add(maze[row+1][col]);
            n.add(maze[row][col-1]);
            n.add(maze[row][col+1]);
            return n;
        }
        else if(col == 0 && (row != 0 && row != maze.length-1))
        {
            n.add(maze[row-1][col]);
            n.add(maze[row+1][col]);
            n.add(maze[row][col+1]);

            return n;
        }
        else if(row == maze.length-1 && (col!=0 && col != maze[0].length-1))
        {
            n.add(maze[row-1][col]);
            n.add(maze[row][col-1]);
            n.add(maze[row][col+1]);

            return n;
        }
        else if(col == maze[0].length-1 && (row != 0 && row != maze.length-1))
        {
            n.add(maze[row-1][col]);
            n.add(maze[row+1][col]);
            n.add(maze[row][col-1]);
            return n;
        }
        else
        {
            n.add(maze[row-1][col]);
            n.add(maze[row+1][col]);
            n.add(maze[row][col-1]);
            n.add(maze[row][col+1]);
            return n;
        }



    }

    public Square getStart()
    {
        Square s = null;
        for (int r=0; r < maze.length; r++) {
            for (int c=0; c < maze[0].length; c++) {
                if (maze[r][c].getType() == 2)
                {s = maze[r][c];}
                
            }
        }
        return s;
    }
    public Square getFinish()
    {   Square s = null;
        for (int r=0; r < maze.length; r++) {
            for (int c=0; c < maze[0].length; c++) {
                if (maze[r][c].getType() == 3)
                {s =  maze[r][c];}
            }
        }
        return s;
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
        String s = "";
        for (int r=0; r < maze.length; r++)
        {

            for (int c=0; c < maze[0].length; c++)
            {
                s = s + " " + maze[r][c].toString();
            }
            s += "\n";
        }
        return s;

    }

}


