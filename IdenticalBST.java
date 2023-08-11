public class IdenticalBST {    
    // A binary tree node has data,
    // pointer to left child and
    // a pointer to right child
    static class Node
    {
        int data;
        Node left;
        Node right;
    };
     
    // Helper function that allocates a new node
    // with the given data and null left
    // and right pointers.
    static Node newNode(int data)
    {
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;
     
        return(node);
    }
     
    // Function to check if two trees
    // have same structure
    static boolean isSameStructure(Node a, Node b)
    {
        // 1. both empty
        if (a == null && b == null)
            return true;
     
        // 2. both non-empty . compare them
        if (a != null && b != null)
        {
            return
            (
                isSameStructure(a.left, b.left) &&
                isSameStructure(a.right, b.right)
            );
        }
         
        // 3. one empty, one not . false
        return false;
    }
     
    // Driver code
    public static void main(String args[])
    {
        Node root1 = newNode(10);
        Node root2 = newNode(100);
        root1.left = newNode(5);
        root1.right = newNode(20);
        root1.right.right = newNode(40);
     
        root2.left = newNode(50);
        root2.right = newNode(200);
        root2.right.right = newNode(400);

     
        if (isSameStructure(root1, root2))
            System.out.printf("Both trees have same structure");
        else
            System.out.printf("Trees do not have same structure");
    }
}
    