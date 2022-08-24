/*  Given a Binary Search Tree and a node value X, find if the node with value X is present in the BST or not. 
 
Input:         2
                \
                 81 
               /    \ 
             42      87 
              \       \ 
               66      90 
              / 
            45

X = 87
Output: true
Explanation: As 87 is present in the given nodes , so the output will be true.
*/

import java.util.*;
public class bst_search 
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter space seperated nodes of a binary search tree: ");
        String str = sc.nextLine();
        root = insert(str);

        System.out.println();
        if(iterativeSearch(root, 6)) System.out.print("Node 6 is present in the Binary Search tree");
        else System.out.print("Node 6 is not present in the Binary search tree");
        
        sc.close();    
    }

    static boolean iterativeSearch(Node root, int val)
    {
        if(root==null) return false;
        while(root!=null)
        {
            if(root.data==val) return true;
            if(val<root.data) root=root.left;
            else root=root.right;
        }
        return false;
    }

    static boolean recursiveSearch(Node root, int val)
    {
        if(root==null) return false;

        if(root.data == val) return true;
        if(val<root.data) return recursiveSearch(root.left, val);
        else return recursiveSearch(root.right, val);
    }
    





























    static void levelOrder(Node root)
    {
        Node temp = root;
        Queue<Node> q = new LinkedList<>();
        q.offer(temp);
        while(!q.isEmpty())
        {
            temp = q.poll();
            System.out.print(temp.data + " ");
            if(temp.left!=null) q.offer(temp.left);
            if(temp.right!=null)q.offer(temp.right);
        }
    }

    static void inorder(Node root)
    {
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static Node insert(String str)
    {
        if(str.length()==0 || str == "N") return null;

        String[] s = str.split(" ");
        Node temp_root = new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<>();
        q.offer(temp_root);

        int i=1;
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
        return temp_root;
    }
}
