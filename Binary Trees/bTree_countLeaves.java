// Count the number of leaf nodes in binary tree

import java.util.*;

public class bTree_countLeaves{
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter space seperated integers of binary tree (enter null as 'N')");
        String str = sc.nextLine();
        root = insert(str);
        System.out.println("Number of leaves using recursive solution: " + countLeavesRecursive(root, 0));
        System.out.println("Number of leaves using iterative solution: " + countLeavesIterative(root, 0));
    }

    int cnt=0;
    static int countLeavesRecursive(Node root, int cnt)            // Recursive Solution
    {
        if(root==null) return cnt;
        if(root.left==null && root.right==null) 
        {
            cnt++;
            return cnt;
        }
        cnt=countLeavesRecursive(root.left, cnt);
        cnt=countLeavesRecursive(root.right, cnt);
        return cnt;
    }

    static int countLeavesIterative(Node root, int cnt)   // Iterative Solution
    {
        if(root==null) return 0;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            Node temp = q.poll();
            if(temp.left==null && temp.right==null) cnt++;
            if(temp.left!=null) q.offer(temp.left);
            if(temp.right!=null) q.offer(temp.right);
        }
        return cnt;
    }

    static Node insert(String str)                              // Create Binary Tree
    {
        if(str.equals("N") || str.length()==0) 
        {
            root=null;
            return null;
        }
        String[] s = str.split(" ");
        root=new Node(Integer.parseInt(s[0]));
        int i=1;
        Queue<Node> q = new LinkedList<>();
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
                temp.right=new Node(Integer.parseInt(s[i]));
                q.offer(temp.right);
            }
            i++;
        }
        return root;
    }
}