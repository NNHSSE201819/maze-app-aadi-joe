import junit.framework.TestCase;

public class MazeTest extends TestCase {

    public void testLoadMaze()
    {
        Maze m = new Maze();

        assertEquals(true, m.loadMaze("maze-4"));

        assertEquals(false, m.loadMaze("Not a real maze this one"));

        assertEquals(false, m.loadMaze("BadMaze"));
    }

    public void testGetNeighbors()
    {

    }

    public void testGetStart()
    {
        Maze m = new Maze();
        m.loadMaze("maze-2");
        assertEquals(6, m.getStart().getRow());
        assertEquals(4, m.getStart().getCol());

        Maze n = new Maze();
        m.loadMaze("maze-3");
        assertEquals(1, n.getStart().getRow());
        assertEquals(0, n.getStart().getCol());
    }

    public void testGetFinish()
    {
        Maze m = new Maze();
        m.loadMaze("maze-2");
        assertEquals(6, m.getFinish().getRow());
        assertEquals(11, m.getFinish().getCol());

        Maze n = new Maze();
        m.loadMaze("maze-3");
        assertEquals(1, n.getFinish().getRow());
        assertEquals(4, n.getFinish().getCol());
    }

    public void testReset()
    {
    }

    public void testToString()
    {
    }
}