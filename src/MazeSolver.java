import java.util.ArrayList;

public abstract class MazeSolver
{
    protected Maze m;
    private boolean isSolved;

    public MazeSolver(Maze maze)
    {
        makeEmpty();
        add(maze.getStart());
        this.m = maze;
        this.isSolved = false;
    }

    public boolean isSolved()
    {
        return isSolved;
    }

    public String getPath()
    {
        Square p = m.getFinish().getPrevious();
        if(p == null)
        {

            return "You are not at the exit.";

        }

        ArrayList<Square> l = new ArrayList<>();
        Square s = m.getFinish();
        while(s!=m.getStart())
        {
            l.add(s);
            s = s.getPrevious();

            if(s != m.getStart())
            {
                s.setType(6);
            }
        }
        String output = m.getStart().toString();
        for(int i = l.size()-1; i>0; i--)
        {

            output += "=>["+l.get(i).getRow()+","+l.get(i).getCol()+"]";
        }
        output += "=>"+ m.getFinish().toString();
        return output;

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
        for(int i = s.size()-1; i >0; i--)
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
        while (isSolved == false)
        {
            Square s = step();
            if (s == m.getFinish())
            {
                break;
            }
            else if(s == null)
            {
                isSolved = true;
            }

        }
        isSolved = true;
    }



    public abstract void makeEmpty();
    public abstract boolean isEmpty();
    public abstract void add(Square sq);
    public abstract Square next();

}
