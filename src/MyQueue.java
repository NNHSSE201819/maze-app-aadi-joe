import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyQueue<T> implements QueueADT<T>
{
    private Node first;
    private Node current;

    public void enqueue(T item)
    {
        this.current = this.first;
        while (this.current.hasNext())
        {
            this.current = this.current.next;
        }
        Node node = new Node();
        node.data = item;
        current.next = node;
    }

    public T dequeue() throws NoSuchElementException
    {
        T value = first.data;
        this.first = this.first.next;
        return value;
    }

    public T front() throws NoSuchElementException
    {
        return first.data;
    }

    public int size()
    {
        if (this.first.data == null)
        {
            return 0;
        }
        int count = 1;
        this.current = this.first;
        while (this.current.hasNext())
        {
            this.current = this.current.next;
            count += 1;
        }
        return count;
    }

    public boolean isEmpty()
    {
        if (this.first.data == null)
        {
            return true;
        }
        return false;
    }

    public void clear()
    {
        while (this.first.hasNext())
        {
            this.dequeue();
        }
        this.dequeue();
    }

    class Node
    {
        public T data;
        public Node next;
        public boolean hasNext()
        {
            if (next == null)
            {
                return false;
            }
            return true;
        }
    }
}
