package edu.cpp.cs240;

public class NodeTest {

	public static void main(String[] args) {

		// build linked list 1 with 3 nodes
		Node n1 = new Node(5);
		System.out.println(n1.getValue());

		Node n2 = new Node(6);
		n1.setNext(n2);
		System.out.println(n1.getValue() + " -> " + n1.getNext().getValue());

		Node n0 = new Node(2, n1);  // n0 is the head of the linked list
		System.out.println(n0.getValue() + " -> " + n0.getNext().getValue() + " -> " + n0.getNext().getNext().getValue());

		// build linked list 2 with 5 nodes
		// headNode is the head of the linked list
		Node headNode = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null)))));
		System.out.println(headNode.getValue() + " -> " + headNode.getNext().getValue() + " -> " + headNode.getNext().getNext().getValue()
				+ " -> " + headNode.getNext().getNext().getNext().getValue() + " -> " + headNode.getNext().getNext().getNext().getNext().getValue());

		// traverse the whole linked list
		Node cursor = headNode;
		while(cursor != null) {
			System.out.print(cursor.getValue() + " ");
			cursor = cursor.getNext();
		}

		// get the 1st node in the linked list
		System.out.println("The 1st node of the list is: " + headNode.getValue());

		// get the 3rd node in the linked list
		cursor = headNode;
		for(int i = 0; i < 2; i++) {
			cursor = cursor.getNext();
		}
		System.out.println("The 3rd node of the list is: " + cursor.getValue());


		// add a node at first
		System.out.println("Before adding the new node at first: ");
		traverseLinkedList(headNode);

		Node newNode1 = new Node(8);
		newNode1.setNext(headNode);
		headNode = newNode1;

		System.out.println("After adding the new node at first: ");
		traverseLinkedList(headNode);

		// add a node at certain index
		System.out.println("Before adding the new node at index 3: ");
		traverseLinkedList(headNode);

		Node newNode2 = new Node(9);
		cursor = headNode;
		for(int i = 0; i < 2; i++) {
			cursor = cursor.getNext();
		}
		newNode2.setNext(cursor.getNext());
		cursor.setNext(newNode2);

		System.out.println("After adding the new node at index 3: ");
		traverseLinkedList(headNode);

		// add a new node at the end
		System.out.println("Before adding the new node at the end: ");
		traverseLinkedList(headNode);

		Node newNode3 = new Node(13);
		cursor = headNode;
		while(cursor.getNext() != null) {
			cursor = cursor.getNext();
		}
		cursor.setNext(newNode3);

		System.out.println("After adding the new node at the end: ");
		traverseLinkedList(headNode);


		// remove the 1st node in the list
		System.out.println("Before removing the new node at the end: ");
		traverseLinkedList(headNode);

		headNode = headNode.getNext();

		System.out.println("After removing the new node at the end: ");
		traverseLinkedList(headNode);

		// remove the node at certain index
		System.out.println("Before removing the node at index 4: ");
		traverseLinkedList(headNode);

		cursor = headNode;
		for(int i = 0; i < 3; i++) {
			cursor = cursor.getNext();
		}
		cursor.setNext(cursor.getNext().getNext());

		System.out.println("After removing the new node at index 4: ");
		traverseLinkedList(headNode);

		// remove the node at the end
		System.out.println("Before removing the node at the end: ");
		traverseLinkedList(headNode);

		cursor = headNode;
		while (cursor.getNext().getNext() != null) {
			cursor = cursor.getNext();
		}
		cursor.setNext(cursor.getNext().getNext());

		System.out.println("After removing the new node at the end: ");
		traverseLinkedList(headNode);
	}

	public static void traverseLinkedList(Node headNode) {
		Node cursor = headNode;
		while(cursor != null) {
			System.out.print(cursor.getValue() + " ");
			cursor = cursor.getNext();
		}
		System.out.println();
	}

}
