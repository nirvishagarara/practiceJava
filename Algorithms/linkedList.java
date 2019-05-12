import java.io.*;

public class Node {

	Node(int value){
		val = value;
		next = Null;
	}
	public int val;
	public Node next;

	public void print() {
		System.out.print(" "+val+" ");
	}
}

public class LinkedList {
	public static void main() {

		Node a = new Node(5);
		
		Node b = new Node(6);

		Node c = new Node(7);

		printLinkedList(a);

	}

	void printLinkedList(Node root) {

		while(root != Null) {
			System.out.print(root.val+" ");
			root = root.next;
		}
	}
}