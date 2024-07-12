package dataStructure;

class Queue<T>
{
    public int length;
    public Node<T> head;
    public Node<T> tail;

    public Queue()
    {
        this.head = this.tail = null;
        this.length = 0;
    }

    public void enqueue(T value)
    {
        this.length++;

        Node<T> node = new Node<T>(value);
        this.tail.next = node;
        this.tail = node;
    }

    public T deque()
    {
        this.length--;

        Node<T> head = this.head;
        this.head = this.head.next;
        head.next = null;

        return head.value;
    }

    public T peek()
    {
        return this.head.value;
    }
}