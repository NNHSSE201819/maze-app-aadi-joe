import junit.framework.TestCase;
import java.util.ArrayList;

public class MazeTest extends TestCase
{

    public void testLoadMaze()
    {
        Maze m = new Maze();
        assertEquals(true, m.loadMaze("src/maze-4"));
        System.out.println("heyo");
        assertEquals(false, m.loadMaze("src/BadMaze"));
    }

    public void testGetNeighbors()
    {
        Maze m = new Maze();
        m.loadMaze("src/maze-3");
        ArrayList<Square> list = new ArrayList<Square>();
        list.add(new Square(0, 3, 0));
        list.add(new Square(1, 4, 3));
        list.add(new Square(2, 3, 0));
        list.add(new Square(1, 2, 1));
        assertEquals(list, m.getNeighbors(new Square(1, 3, 0)));
    }

    public void testGetStart()
    {
        Maze m = new Maze();
        m.loadMaze("src/maze-2");
        assertEquals(6, m.getStart().getRow());
        assertEquals(4, m.getStart().getCol());

        Maze n = new Maze();
        n.loadMaze("src/maze-3");
        assertEquals(1, n.getStart().getRow());
        assertEquals(0, n.getStart().getCol());
    }

    public void testGetFinish()
    {
        Maze m = new Maze();
        m.loadMaze("src/maze-2");
        assertEquals(6, m.getFinish().getRow());
        assertEquals(11, m.getFinish().getCol());

        Maze n = new Maze();
        n.loadMaze("src/maze-3");
        assertEquals(1, n.getFinish().getRow());
        assertEquals(4, n.getFinish().getCol());
    }

    public void testReset()
    {
        Maze m = new Maze();
        m.loadMaze("src/maze-3");
        String s = m.toString();
        m.reset();
        String t = m.toString();
        assertEquals(s,t);
    }

    public void testToString()
    {
        Maze m = new Maze();
        m.loadMaze("src/maze-1");
        String s = " S _ _/n _ _ _/n _ _ E/n";
        assertEquals(s, m.toString());
    }
}