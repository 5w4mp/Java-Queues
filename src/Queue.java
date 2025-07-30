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
}
