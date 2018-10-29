import java.util.NoSuchElementException;
import java.util.ArrayList;

public class MyStack<T>
{
    private ArrayList a = new ArrayList<T>();

    public void push(T item)
    {
        a.add(item);
    }

    public void pop() throws NoSuchElementException
    {
        a.remove(a.size()-1);
    }

    public void top() throws NoSuchElementException
    {
        a.get(a.size()-1);
    }

    public int size()
    {
        return a.size();
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public  void clear()
    {
        a.clear();
    }


}
