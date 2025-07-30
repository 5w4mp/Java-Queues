public class Queue
{
    private class Node
    {
        private Object data;
        private Node next;

        public Node(Object e)
        {
            this.data = e;
            this.next = null;
        }
    }
    private Node head, tail;
    private int size;

    public void linkedQueue()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public int size(){return this.size;}
    public boolean isEmpty()
    {
        if(head == null && tail == null || this.size ==0)
        {
            return true;
        }
        return false;
    }
    public void enqueue(Object element)
    {
        Node nn = new Node(element);
        if(this.size == 0){ head = nn; tail = nn;}
        else{tail.next = nn; tail = nn;}
        this.size++;
    }
    public Object dequeue() throws Exception
    {
        if(size == 0){throw new Exception("Queue is empty. ");}
        Object temp = head.data;
        head = head.next;
        this.size--;
        if(size == 0) {tail = null;}
        return temp;
    }

    public Object front() throws Exception
    {
        if(size == 0){throw new Exception("Queue is empty. ");}
        return head.data;
    }


}
