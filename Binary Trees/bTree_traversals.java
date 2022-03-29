// All traversals of binary tree (level order, in Order, post Order, pre Order (both iterative and recursive))

import java.util.*;
public class bTree_traversals  
{
    static Node root;
    static class Node
    {
        int data;
        Node right, left;

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

        root = insert(str);          // insert elements in binary tree
        
        System.out.print("Level Order: ");
        levelOrder(root);
        System.out.println();

        System.out.print("Pre Order: ");
        preOrder(root);   
        System.out.println();

        System.out.print("Pre Order Iterative: ");
        iterativePreOrder(root);
        System.out.println();

        System.out.print("In Order: ");
        inOrder(root);
        System.out.println();

        System.out.print("Post Order: ");
        postOrder(root);
        System.out.println();
        System.out.println();

        sc.close();
    } 

    public static Node insert(String str)                    // Function to input binary string
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

    public static void levelOrder(Node root)                  // Level order traversal
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

    public static void preOrder(Node root)                   // Preorder traversal
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root)                  // Inorder traversal
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    
    public static void postOrder(Node root)                   // Postorder traversal
    {
        if(root==null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void iterativePreOrder(Node root)            // Preorder iterative
    {
        if(root==null) return;
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty())
        {
            Node temp = st.pop();
            System.out.print(temp.data + " ");
            if(temp.right!=null) st.push(temp.right);
            if(temp.left!=null) st.push(temp.left);
        }
    }
}