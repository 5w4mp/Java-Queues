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


}
