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
        maze.loadMaze("src/maze-3");

    }
}
