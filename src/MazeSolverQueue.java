public class MazeSolverQueue extends MazeSolver
{
    private MyQueue<Square> q;
    public MazeSolverQueue(Maze maze)
    {
        super(maze);
    }

    public void makeEmpty()
    {
        q = new MyQueue<Square>();
    }

    public static void main(String[] args)
    {
        Maze maze = new Maze();
        maze.loadMaze("src/maze-81a");
        MazeSolver solver = new MazeSolverQueue(maze);
        solver.solve();
        System.out.println(solver.getPath());
        System.out.println(maze.getFinish().getPrevious());


    }

    public boolean isEmpty()
    {
        return q.isEmpty();
    }

    public void add(Square sq)
    {
        q.enqueue(sq);
    }

    public Square next()
    {
        return q.dequeue();
    }
}
