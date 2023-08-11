import java.io.*;
class LinkedList2{
    Node head;
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    void printNthFromLast(int N)
    {
        int len = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        if (len < N)
            return;

        temp = head;
        for (int i = 1; i < len - N + 1; i++)
            temp = temp.next;
 
        System.out.println(temp.data);
    }
 
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
 
    // Driver's code
    public static void main(String[] args)
    {
        LinkedList2 list = new LinkedList2();
        list.push(20);
        list.push(4);
        list.push(15);
        list.push(35);
         
          // Function call
        list.printNthFromLast(4);
    }
}
