import junit.framework.TestCase;

public class MyStackTest extends TestCase
{
    public void testPush()
    {
        MyStack m = new MyStack();
        m.push(1);
        m.push("Joe");

    }
    public void testPop()
    {

    }
    public void testTop()
    {
        MyStack m = new MyStack();
        m.push(1);
        m.push("Joe");
        assertEquals("Joe",m.top());
    }
    public void testSize()
    {

    }
    public void testIsEmpty()
    {

    }
    public void testClear()
    {

    }
}

