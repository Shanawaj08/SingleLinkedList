/* Keep Duplicates 
You will be given the linked list and you are asked to keep only duplicates from the given linked list. */

import java.util.*;
public class Main
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
	public void display() {
	    Node tempNode = head;
	    while(tempNode != null) {
	        System.out.print(tempNode.data + "->");
	        tempNode = tempNode.next;
	    }
	    
	}
	
	public void duplicate() {
	    while(head.data != head.next.data) {
	         
	        Node curr = head;
	        head = curr.next;
	        curr = null;
	        //System.out.println(head.data);
	        
	    }
	        
	    
	    Node temp = head;
	    Node temp2 = head.next;
	    Node dup = null;
	    
	    while(temp!=null && temp2 != null) {
	        if(temp.data == temp2.data) {
	            dup = temp2;
	            temp = temp.next;
	            temp2 = temp2.next;
	            //System.out.println(dup.data);
	        }
	        else if(temp.data == dup.data) {
	            temp = temp.next;
	            temp2 = temp2.next;
	        }
	        else {
	            temp.next=temp2.next;
	            temp=temp.next;
	            temp2=temp.next;
	            dup.next=temp;
	            
	        }
	    }
	    temp=null;
	    
	    dup.next=temp;
	}
	public static void main(String[] args) {
		Main mn = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
		    int val = sc.nextInt();
		    mn.create(val);
		}
		
		mn.display();
		mn.duplicate();
		System.out.println();
		mn.display();
	}
}
