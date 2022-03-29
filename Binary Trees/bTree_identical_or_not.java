import java.util.*;
public class bTree_identical_or_not
{
    static Node root1;
    static Node root2;
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
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        root1 = insert(str1);
        root2 = insert(str2);
        System.out.println(identicalTrees(root1, root2));  
        sc.close();  
    }
    

    public static boolean identicalTrees(Node root1, Node root2)
    {
        if(root1==null || root2==null) return root1==null && root2==null;
        if(root1.data!=root2.data) return false;
        return identicalTrees(root1.left, root2.left) && identicalTrees(root1.right, root2.right);
    }
    public static Node insert(String str)
    {
        if(str.length()==0 || str.equals("N")) return null;
        String[] s = str.split(" ");
        Node root = new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
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
        return root;
    }
}