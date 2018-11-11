public class MySolverStack extends MazeSolver
{
    MyStack<Square> worklist;

    public MySolverStack(Maze maze)
    {
        super(maze);
    }
    public void makeEmpty()
    {

        worklist = new MyStack<>();
    }


    public Square next()
    {
        return worklist.pop();
    }

    public void add(Square sq)
    {
        worklist.push(sq);
    }

    public boolean isEmpty()
    {
        return worklist.isEmpty();
    }

    public static void main(String[]args)
    {
        Maze m = new Maze();
        m.loadMaze("src/maze-1");
        MazeSolver solver = new MySolverStack(m);
        solver.solve();
        System.out.println(solver.getPath());
        System.out.println(m.getFinish().getPrevious());

    }
}
