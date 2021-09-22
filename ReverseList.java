/*Reversed 
You will be given the linked list and you are asked to reverse the given linked list.
Indexing of linked list starts at 1.*/

import java.util.*;
public class Main
{
    static Node head;
    static int size;
    static class Node {
        Node next;
        int data;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void create(int data) {
        Node temp = head;
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            size++;
            return;
        }
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }
    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
    }
    public void reverse() {
        Node temp = head;
        Node prev = null, curr = null;
        while(temp != null) {
            curr = temp;
            temp = temp.next;
            
            curr.next = prev;
            prev = curr;
            head = curr;
        }
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
		mn.reverse();
		System.out.println();
		mn.display();
		
		
		
	}
}
