import java.util.LinkedList;
import java.util.Queue;

public class level_order_bt 
{
    static Node root;
    static class Node
    {
        int data;
        Node left,right;
        public Node(int data)
        {
            this.data=data;
            left=right=null;
        }
    }    
public static void main(String[] args) 
{
    Node first = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    Node fourth = new Node(4);
    Node fifth = new Node(5);
    root=first;
    first.left=second;
    first.right=third;
    second.left=fourth;
    second.right=fifth;    
    levelOrder(root);
    
}
public static void levelOrder(Node root)
{
    if(root==null) return;
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty())
    {
        Node temp=q.poll();
        System.out.print(temp.data + " ");
        if(temp.left!=null) q.add(temp.left);
        if(temp.right!=null) q.add(temp.right);
    }
}
}