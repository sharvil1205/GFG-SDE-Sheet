import java.util.*;
public class bTree_Height 
{
    static Node root;
    static class Node
    {
        int data;
        Node left, right;
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
        root = insert(str);
        System.out.println("Max height:" + maxHeight(root));
        System.out.println("Min height:" + minHeight(root));
        sc.close();
    }

    public static Node insert(String str)
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

    public static int maxHeight(Node root)
    {
        if(root==null) return 0;
        int left_height = maxHeight(root.left);
        int right_height = maxHeight(root.right);
        return 1+Math.max(left_height, right_height);
    }    
    static int minHeight(Node root)
    {
        if(root==null) return 0;
        int left_height = minHeight(root.left);
        int right_height = minHeight(root.right);
        if (root.left == null)	return 1 + right_height;
	    if (root.right == null) return 1 + left_height;
	    return 1+Math.min(left_height,right_height);
    }
}