package dataStructure;

public class NodeDouble<T>
{
    public T value;
    public NodeDouble<T> next; 
    public NodeDouble<T> prev; 
    public NodeDouble(T value)
    {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}