import junit.framework.TestCase;

public class MyStackTest extends TestCase
{
    public void testPush()
    {
        MyStack m = new MyStack();
        m.push(1);
        m.push("Joe");
        System.out.println(m.top());
        assertEquals("Joe",m.top());
    }
    public void testPop()
    {
        MyStack m = new MyStack();
        m.push(1);
        m.push("Joe");
        m.pop();
        assertEquals(1,m.pop());

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
        MyStack m = new MyStack();
        m.push(1);
        m.push("Joe");
        assertEquals(2,m.size());
    }
    public void testIsEmpty()
    {
        MyStack m = new MyStack();
        m.push(1);
        m.push("Joe");
        assertEquals(false, m.isEmpty());
        m.pop();
        m.pop();
        assertEquals(true,  m.isEmpty());
    }
    public void testClear()
    {
        MyStack m = new MyStack();
        m.push(1);
        m.push("Joe");
        m.clear();
        assertEquals(m.isEmpty(),true);
    }
}

