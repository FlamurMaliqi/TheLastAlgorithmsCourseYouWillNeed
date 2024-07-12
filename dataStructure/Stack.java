package dataStructure;

public class Stack<T> 
{
    public int length;
    public NodeDouble<T> head;
    
    public Stack()
    {
        this.head = null;
        this.length = 0;
    }

    public void push(T value)
    {
        NodeDouble<T> node = new NodeDouble<T>(value);
        node.prev = this.head;
        this.head = node;
    }

    public T pop()
    {
        T value = this.head.value;
        this.head = this.head.prev;
        return value;
    }

    public T peek()
    {
        return this.head.value;
    }
}
