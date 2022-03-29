import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bTree_mirror 
{
    static Node root;
    static class Node
    {
        Node left,right;
        int data;

        public Node(int data)
        {
            this.data=data;
            left=right=null;
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        root = insert(str);     // Input Binary Tree    
        System.out.println(isSymmetric(root));
        sc.close();
    }
    public static Node insert(String str)         // Function to input binary tree
    {
        if(str.length()==0 || str.equals("N"))
        {
            root=null;
            return null;
        }
        String[] s = str.split(" ");
        root = new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<>();
        int i=1;
        q.offer(root);
        while(!q.isEmpty() && i<s.length)
        {
            Node temp = q.poll();
            if(!s[i].equals("N"))
            {
                temp.left = new Node(Integer.parseInt(s[i]));
                q.offer(temp.left);
            }            
            i++;
            if(i>=s.length) break;
            if(!s[i].equals("N"))
            {
                temp.right = new Node(Integer.parseInt(s[i]));
                q.offer(temp.right);
            }
            i++;
        }
        return root;
    }

    public static boolean isSymmetric(Node root)
    {
        if(root==null) return true;
        return mirror(root.left, root.right);
    }
    public static boolean mirror(Node left, Node right)
    {
        if(left==null || right==null) return left==right;
        if(left.data!=right.data) return false;
        return mirror(left.left, right.right) && mirror(left.right, right.left);
    }
}
