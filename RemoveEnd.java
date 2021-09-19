/*Cutting Down 
You will be given the linked list and you are asked to remove last node from it.
Indexing of linked list starts at 1.*/

import java.util.*;
public class RemoveEnd
{
    Node head;
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
            System.out.print(tempNode.data + "-->");
            tempNode = tempNode.next;
        }
        
    }
    public void deleteEnd() {
        Node tempNode = head;
        if(head==null || head.next == null) return;
        while(tempNode.next.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = null;
        
    }
	public static void main(String[] args) {
		RemoveEnd mn = new RemoveEnd();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
		    int val = sc.nextInt();
		    mn.create(val);
		}
		mn.display();
		mn.deleteEnd();
		System.out.println();
		mn.display();
	}
}
