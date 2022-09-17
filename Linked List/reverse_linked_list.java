import java.util.*;

public class reverse_linked_list 
{
    static Node head;
    static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter space seperated integers of linked list: ");
        String s = sc.nextLine();
        head = insert(s);
        
        head = reverseLinkedList(head);
        
        System.out.print("Linked List after reversing nodes: ");
        printData(head);  
    }

    static Node reverseLinkedList(Node head)
    {
        if(head == null) return null;
        Node prev = null, curr = head, nxt = null;

        while(curr != null)
        {
            nxt = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nxt;
        }
        head = prev;
        return head;
    }

    static Node insert(String s)                                    // function to insert data in linked list
    {
        if(s.isEmpty()) return null;

        String[] str = s.split(" ");
        Node head = new Node(Integer.parseInt(str[0]));
        Node temp = head;
        int i=1;
        while(i<str.length)
        {
            Node new_node = new Node(Integer.parseInt(str[i]));
            temp.next = new_node;
            temp = new_node;
            i++;
        }
        return head;
    }
    
    static void printData(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data + " ");
            head=head.next;
        }
    }
}
