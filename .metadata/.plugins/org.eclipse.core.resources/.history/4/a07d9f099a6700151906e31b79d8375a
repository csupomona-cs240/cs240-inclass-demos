package edu.cpp.cs240;

public class NodeTest {

	public static void main(String[] args) {

		Node head = new Node(5, new Node(7, new Node(9, new Node(11, new Node(13, new Node(15, new Node(17, null)))))));

		System.out.println("Before adding the new node: ");
		traverseList(head);

		// add a new node in the end
		Node newNode = new Node(21, null);

		// 1. traverse the linked list and reach to the last node
		Node current = head;
		while( current.getNext() != null ) {
			current = current.getNext();
		}

		// 2. update the next link of the last node to point it out to the new node
		current.setNext(newNode);

		System.out.println("After adding the new node: ");
		traverseList(head);


		// add the node in the beginning
		Node newNode2 = new Node(3, head);
		head = newNode2;

		// add the node after the 3rd position of the list (4th position) (3 - 4)

		// 0. create a new node
		Node newNode3 = new Node(8, null);

		// 1. traverse and get to the 3rd element
		Node current3 = head;
		for(int i = 0; i < 2; i++) {
			current3 = current3.getNext();
		}

		// 2. let the new node point to the 4th element
		newNode3.setNext(current3.getNext());

		// 3. change the original next link of the 3rd element to the new node
		current3.setNext(newNode3);

		System.out.println("After adding the new node: ");
		traverseList(head);

		// 1. remove the first element
		head = head.getNext();
		System.out.println("After removing the  first node: ");
		traverseList(head);

		// 2. remove the 5th (index: 4) element
		Node prev = head;
		// move the cursor to the prev
		for(int i = 0; i < 3; i++) {
			prev = prev.getNext();
		}
		// change the next link
		prev.setNext(prev.getNext().getNext());
		System.out.println("After removing the 5ht node: ");
		traverseList(head);
	}

	public static void traverseList(Node head) {
		Node current = head;
		while(current != null) {
			System.out.print(current.getValue() + " ");
			current = current.getNext();
		}
		System.out.println();
	}

}
