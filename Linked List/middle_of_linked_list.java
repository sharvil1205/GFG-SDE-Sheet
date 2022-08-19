/* Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node. */

import java.util.*;
public class middle_of_linked_list 
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
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter space seperated integers of linked list: ");
        String s = sc.nextLine();

        head = insert(s);
        // printData(head);
        
        System.out.println("Middle of linked list: " + middleNodeOptimized(head));
    }

    static int middleNode(Node head)                       // Method 1 (naive method)
    {
        if(head==null) return -1;
        Node temp = head;
        int cnt=0;
        while(temp!=null)
        {
            temp = temp.next;
            cnt++;
        }
        cnt>>=1;          // Divide cnt by 2
        temp = head;
        
        while(cnt-->0)
        {
            temp=temp.next;
        }
        return temp.data;
    }

    static int middleNodeOptimized(Node head)            // 2-pointer algorithm (optimized method)
    {
        if(head==null) return -1;
        
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }

    static Node insert(String s)                               // function to insert elements in the linked list
    {
        if(s.length()==0) return null;
        String[] str = s.split(" ");
        head = new Node(Integer.parseInt(str[0]));
        Node temp = head;
        int i=1;
        while(i<str.length)
        {
            Node new_node = new Node(Integer.parseInt(str[i]));
            i++;
            temp.next = new_node;
            temp = temp.next;
        }
        return head;
    }

    static void printData(Node head)                           // function to print data from linked list
    {
        Node temp = head;
        System.out.print("Data inside linked list: ");
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
}