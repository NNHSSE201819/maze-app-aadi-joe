public abstract class MazeSolver
{
    protected Maze m;

    public MazeSolver(Maze maze)
    {
        this.m = maze;
    }

    public boolean isSolved()
    {

    }

    public String getPath()
    {

    }

    public Square step()
    {

    }

    public void solve()
    {

    }

    public abstract void makeEmpty();
    public abstract boolean isEmpty();
    public abstract void add(Square sq);
    public abstract Square next();

}
