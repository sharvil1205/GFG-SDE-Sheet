// Basic Implementation of a binary tree

public class binary_tree
{
    static Node root;
    static class Node{
        int data;
        Node left, right;

        public Node(int data)
        {
            this.data=data;
            left=right=null;
        }
    }

    public static void main(String[] args) {
        Node first=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(4);
        Node fifth=new Node(5);
        
        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=fifth;
        System.out.println("Pre-Order Traversal: ");
        preOrder(root);
        System.out.println("");
        System.out.println("");
        System.out.println("In-Order Traversal: ");
        inOrder(root);
        System.out.println("");
        System.out.println("");
        System.out.println("Post-Order Traversal: ");
        postOrder(root);
    }
    static void preOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void inOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void postOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
} 