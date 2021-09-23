/*Swap Good And Bad 
You will be given the linked list and you are asked to swap the positive nodes with the negative nodes (swap positive node with the closest negative node) in the linked list.
Indexing of linked list starts at 1.*/

public class Main
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
        Node newNode = new Node(data);
        Node temp = head;
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
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public void swapNegativePositive() {
        if(head == null) return;
        
        Node temp = head;
        Node temp2 = head.next;
        int dup = 0;
        while(temp != null && temp2 !=null) {
            if((temp.data>0 || temp.data==0) && temp2.data<0 && temp2.next==null) {
                dup = temp.data;
                temp.data = temp2.data;
                temp2.data = dup;
                temp = temp.next;
                temp2 = temp2.next;
            }
            else if((temp.data>0 || temp.data==0) && temp2.data<0) {
                dup = temp.data;
                temp.data = temp2.data;
                temp2.data = dup;
                temp = temp2.next;
                temp2 = temp2.next.next;
            }
            else if(temp.data<0 && (temp2.data>0 || temp2.data==0)) {
                dup = temp.data;
                temp.data = temp2.data;
                temp2.data = dup;
                temp = temp2.next;
                temp2 = temp2.next.next;
            }
            
            else {
            temp = temp.next;
            temp2 = temp2.next;
            }
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
		mn.swapNegativePositive();
		System.out.println();
		mn.display();
	}
}
