import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyQueue<T> implements QueueADT<T>
{
    private Node first;

    public void enqueue(T item)
    {
    }

    public T dequeue() throws NoSuchElementException
    {
    }

    public T front() throws NoSuchElementException
    {
    }

    public int size()
    {
    }

    public boolean isEmpty()
    {
    }

    public void clear()
    {
    }

    class Node
    {
        public T data;
        public Node next;
    }
}
