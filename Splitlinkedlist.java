 class Node
{
    int data;
    Node next;
 
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}
 
class Main
{
    public static void printList(String msg, Node head)
    {
        System.out.print(msg);
 
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }
 
        System.out.println("null");
    }
    public static Node[] alternatingSplit(Node source)
    {
        // Split the nodes into `a` and `b` lists
        Node a = null;
        Node b = null;
        Node current = source;
 
        while (current != null)
        {
            // Move a node to `a`
 
            Node newNode = current;         // the front source node
            current = current.next;         // advance the source
 
            newNode.next = a;               // link the old dest off the new node
            a = newNode;                    // move dest to point to the new node
 
            if (current != null)
            {
                // Move a node to `b`
 
                newNode = current;          // the front source node
                current = current.next;     // advance the source
 
                newNode.next = b;           // link the old dest off the new node
                b = newNode;                // move dest to point to the new node
            }
        }
 
        return new Node[] { a, b };
    }
 
    public static void main(String[] args)
    {
        // input keys
        int[] keys = { 1, 2, 3, 4, 5, 6, 7 };
 
        // construct the first linked list
        Node head = null;
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
 
        Node[] nodes = alternatingSplit(head);
 
        // print both lists
        printList("First List: ", nodes[0]);
        printList("Second List: ", nodes[1]);
    }
}

