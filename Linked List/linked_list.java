import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class linked_list
{
    static Node head;                                                               // Defining head
    static class Node                                                               // Defining class with variables data and next
    {
        int data;
        Node next;

        public Node(int data)                                                       // Constructor
        {
            this.data=data;
            next=null;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter linked list: ");
        String str = sc.nextLine();                                                  // Take string as an input to linked list
        head = insert(str);                                                         // function insert to insert data in linked list
        printData(head);                                                            // Function to print data of linked list
    }

    static Node insert(String str)
    {
        if(str.length()==0) return head=null;                                       // Return null if string is empty
        String[] s = str.split(" ");                                                // Convert string to a string array
        head = new Node(Integer.parseInt(s[0]));                                    // Enter first element s[0] as head
        int i=1;
        Node temp = head;
        while(i<s.length)
        {
            Node new_node = new Node(Integer.parseInt(s[i]));                       // Keep creating new nodes and keep doing temp=temp.next
            i++;
            temp.next = new_node;
            temp = temp.next;
        }
        return head;
    }

    static void printData(Node head)
    {
        Node temp = head;
        System.out.print("Data in linked list: ");
        while(temp!=null)
        {
            System.out.print(temp.data + " ");                                      // Print data in the list
            temp=temp.next;
        }
    }
}