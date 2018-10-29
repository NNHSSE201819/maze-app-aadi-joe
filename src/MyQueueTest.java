import junit.framework.TestCase;

public class MyQueueTest extends TestCase
{
    private MyQueue<Integer> q;

    public MyQueueTest()
    {
        q = new MyQueue<Integer>();
        q.enqueue(7);
        q.enqueue(4);
        q.enqueue(3);
    }


    public void testEnqueueDequeue()
    {
        assertEquals(new Integer(7), q.dequeue());
        q.enqueue(5);
        assertEquals(new Integer(4), q.dequeue());
        q.enqueue(6);

    }


    public void testFront()
    {
        assertEquals(new Integer(3), q.front());
        assertEquals(new Integer(3), q.front());
    }

    public void testSize()
    {
        assertEquals(3, q.size());
    }

    public void testIsEmpty()
    {
        assertEquals(false, q.isEmpty());
    }

    public void testClear()
    {
    }
}