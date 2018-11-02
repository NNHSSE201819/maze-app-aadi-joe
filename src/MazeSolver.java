import java.util.ArrayList;

public abstract class MazeSolver
{
    protected Maze m;


    public MazeSolver(Maze maze)
    {

        this.m = maze;
    }

    public boolean isSolved()
    {
        Square n = next();
        if(n.getType() == 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getPath()
    {
        Square n = next();
        String s = "";
        if(n.getType() != 3)
        {
            return  "You are not at the exit";
        }

        while(n.getPrevious().getType() !=  2)
        {
            s += Integer.toString(n.getRow()) + ", " + Integer.toString(n.getCol()) + ";";
            n = n.getPrevious();
        }
        return s;
    }

    public Square step()
    {

        if (isEmpty())
        {
            return null;
        }
        Square n = next();

        if(n.getType() == 3)
        {
            getPath();
            return n;
        }

        ArrayList<Square> s = m.getNeighbors(n);
        for(int i =4; i >0; i--)
        {
            if(s.get(i).getType() != 0)
            {
                s.remove(i);
            }
        }
        for (Square sq : s)
        {
            if(sq.getExplored() == 0)
            {
                sq.setExplored(2);
                add(sq);
            }
        }
        return n;
    }

    public void solve()
    {
        Square s = next();
        while(s.getType() != 3 && isEmpty()== false)
        {
            step();
        }
    }

    public abstract void makeEmpty();
    public abstract boolean isEmpty();
    public abstract void add(Square sq);
    public abstract Square next();

}
