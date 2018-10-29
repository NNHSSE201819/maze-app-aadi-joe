import java.util.NoSuchElementException;
import java.util.ArrayList;

public class MyStack<T> implements StackADT<T>
{
    private ArrayList<T> a = new ArrayList<T>();

    public void push(T item)
    {
        a.add(item);
    }

    public T pop() throws NoSuchElementException
    {
        return a.remove(a.size()-1);
    }

    public T top() throws NoSuchElementException
    {
        return a.get(a.size()-1);
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
