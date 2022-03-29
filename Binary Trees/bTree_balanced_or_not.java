import java.util.*;
public class bTree_balanced_or_not 
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
        String str = sc.nextLine();
        if(str.length()==0 || str=="N")
        {
            root=null;
        }    
        String s[] = str.split(" ");
        root = new Node(Integer.parseInt(s[0]));
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
        System.out.println(isBalanced(root));  
        sc.close();     
    }  
    
    public static boolean isBalanced(Node root)
    {
        if(root==null) return true;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public static int height(Node root)
    {
        if(root==null) return 0;
        return 1+Math.max(height(root.left), height(root.right));
    }
}
