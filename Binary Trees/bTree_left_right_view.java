// Left and Right view of Binary Tree

import java.util.*;
public class bTree_left_right_view 
{
    static Node root;
    public static class Node 
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter space-seperated elements of binary tree (Enter null as 'N'): ");
        String str = sc.nextLine();
        root = insert(str);
        System.out.print("Left View of Binary Tree: ");
        leftView(root);
        System.out.println();
        System.out.print("Right View of Binary Tree: ");
        rightView(root);
        sc.close();
    }
    static void leftView(Node root)
    {
        if(root==null) return;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i=1; i<=size; i++)
            {
                Node temp = q.poll();
                if(i==1) System.out.print(temp.data + " ");
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
            }
        }
    }
    static void rightView(Node root)
    {
        if(root==null) return;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i=1; i<=size; i++)
            {
                Node temp = q.poll();
                if(i==size) System.out.print(temp.data + " ");
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
            }
        }
    }

    static Node insert(String str)
    {
        if(str.equals("N") || str.length()==0) 
        {
            root=null;
            return root;
        } 
        String[] s = str.split(" ");
        root=new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<>();
        int i=1;
        q.offer(root);
        while(!q.isEmpty() && i<s.length)
        {
            Node temp=q.poll();
            if(!s[i].equals("N"))
            {
                temp.left = new Node(Integer.parseInt(s[i]));
                q.offer(temp.left);
            }
            i++;
            if(i>=s.length) break;
            if(!s[i].equals("N"))
            {
                temp.right= new Node(Integer.parseInt(s[i]));
                q.offer(temp.right);
            }
            i++;
        }
        return root;
    }
}