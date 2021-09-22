/*Duplicates There Or Not 
You will be given the linked list and you are asked to find whether there is duplicate node present in the linked list or not.*/

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
    public int isDuplicate() {
        //int count = 0;
        Node temp = head;
        while(temp != null) {
            Node curr = temp.next;
            while(curr != null) {
                if(curr.data == temp.data) return 1;
                else curr = curr.next;
            }
            temp = temp.next;
        }
        return 0;
    }
	public static void main(String[] args) {
		Main mn = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
		    int val = sc.nextInt();
		    mn.create(val);
		}
		//int num = sc.nextInt();
		mn.display();
		System.out.println();
		System.out.println(mn.isDuplicate());
		
		
		
		
		
	}
}
