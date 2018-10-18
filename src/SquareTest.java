import junit.framework.TestCase;

public class SquareTest extends TestCase
{

    Square sqr = new Square(3,4,0);

    public void testGetRow()
    {
        int row = sqr.getRow();
        assertEquals(3, row);
        sqr.setRow(7);
        assertEquals(7, sqr.getRow());
    }

    public void testGetCol()
    {
        int col = sqr.getCol();
        assertEquals(4, col);
        sqr.setCol(5);
        assertEquals(5, sqr.getCol());
    }

    public void testGetType()
    {
        int type = sqr.getType();
        assertEquals(0, type);
        sqr.setType(2);
        assertEquals(2, sqr.getType());
    }

    public void testToString()
    {
        String expected = "";
        if (sqr.getType() == 0)
        {
            expected = "_";
        }
        else if (sqr.getType() == 1)
        {
            expected = "#";
        }
        else if (sqr.getType() == 2)
        {
            expected = "S";
        }
        else if (sqr.getType() == 3)
        {
            expected = "E";
        }
        assertEquals(expected, sqr.toString());
    }
}