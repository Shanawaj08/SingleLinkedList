/*Swap tail with head 
You will be given the linked list and you are asked to swap the head of the linked list with the tail.*/

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
	
	public void swapHeadTail() {
	        
	    Node temp = head;
	    while(temp.next != null) {
	        temp = temp.next;
	    }
	    int tempVal = head.data;
	    head.data = temp.data;
	    temp.data = tempVal;
	    
	    
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
		mn.swapHeadTail();
		System.out.println();
		mn.display();
	}
}
