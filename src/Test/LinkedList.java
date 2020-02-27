package Test;

public class LinkedList {

	static class Node{
		int data;
		Node next;
	}
	static Node head;
	static void insert(int position,int data) {
		Node temp2 = new Node();
		temp2.data = data;
		temp2.next = null;
		if(position == 1) {
			head = temp2;
			return;}
		Node temp = head;
		for(int i = 1;i<position-1;i++)
			temp = temp.next;
		temp2.next = temp.next;
		temp.next = temp2;
	}
	static void insertAtEnd(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		if(head == null) {
			head = temp;
			return;
		}
		Node temp1 = head;
		while(temp1.next != null) {
			temp1 = temp1.next;
		}
		temp1.next = temp; 
	}
	static void delete(int position) {
		Node temp = head;
		if(position == 1) {
			head = temp.next;
			return;
		}
		for(int i = 1;i<position-1;i++) {
			temp = temp.next;
			if(temp.next == null) {
				System.out.println("range out of context for deletion");
				return;
			}
		}
		temp.next = temp.next.next;
	}
	static void insertAtBegin(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.next = head;
		head = temp;
	}
	static void print() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		insertAtEnd(1);
		insertAtEnd(2);
		insertAtEnd(3);
		insertAtEnd(4);
		insertAtEnd(3);
		insertAtBegin(1);
		insertAtBegin(2);
		insertAtBegin(3);
		insertAtBegin(4);
		insertAtBegin(3);
		print();
		delete(11);
		print();
	}

}
