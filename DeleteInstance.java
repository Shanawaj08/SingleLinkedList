/*Delete Instance 
You will be given the linked list and you are asked to delete the number of nodes of specific data present in tne linked list.*/

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
    public void revmoveInstance(int num) {
        while(head.data == num) {
            Node temp = head;
            head = head.next;
            temp = null;
        }
         Node temp = head;
         Node temp2 = head.next;
         Node curr = null;
	    while(temp != null && temp2 != null) {
	        if(temp.data != num) {
	            curr = temp;
	            temp = temp.next;
	            temp2 = temp2.next;
	        }
	        else {
	            curr.next = temp.next;
	            temp = curr.next;
	            temp2 = temp.next;
	        }
        }
        if(temp.data == num) {
            //temp.next = null;
            temp = null;
            curr.next = temp;
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
		int num = sc.nextInt();
		mn.display();
		mn.revmoveInstance(num);
		System.out.println();
		mn.display();
		
		
		
	}
}
