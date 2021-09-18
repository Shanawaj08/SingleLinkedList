/*Slicing odd places 
You will be given the linked list and you are asked to remove nodes which are positioned at odd places*/

import java.io.*;
import java.util.*;
public class SliceOdd
{
    Node head, tail;
    static int size;
	
	static class Node {
	    int data;
	    Node next;
	    
	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	public void create(int data) {
	    Node tempNode = head;
	    Node newNode = new Node(data);
	    if(head == null) {
	        head = newNode;
	        size++;
	        return;
	        
	    }
	    while(tempNode.next != null) {
	        tempNode = tempNode.next;
	    }
	    tempNode.next = newNode;
	    size++;
	    
	}
    void deleteAlt()
    {
        
        Node temp = head;
        head = null;
        head = temp.next;
       if (head == null)
          return;
 
       Node prev = head;
       Node now = head.next;
 
       while (prev != null && now != null)
       {          
           /* Change next link of previous node */
           prev.next = now.next;
 
           /* Free node */
           now = null;
 
           /*Update prev and now */
           prev = prev.next;
           if (prev != null)
              now = prev.next;
       }
    }                
    public void display() {
	    Node tempNode = head;
	    while(tempNode != null) {
	        System.out.println(tempNode.data);
	        tempNode = tempNode.next;
	    }
	    
	}
    public static void main(String[] args) {
	    SliceOdd mn = new SliceOdd();
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i=0; i<n; i++) {
	        int val = sc.nextInt();
	        mn.create(val);
	    }
	    //mn.display();
	    //.out.println();
	    //System.out.println("Size of LinkedList = " + size);
	    mn.deleteAlt();
	    mn.display();
	    
	    
	    
	    
	}
}
