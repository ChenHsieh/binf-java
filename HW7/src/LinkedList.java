
// Date: April 22 2021
// Name: Chen Hsieh
// Student number: ch29576, 811744663
// Class: BINF 8006
// HW 7

public class LinkedList<E> {

	public static void main(String[] args) {
		LinkedList<String> myLinkedList = new LinkedList<String>();
		// add a bunch of name to start
		System.out.println("the original linked list");
		myLinkedList.addANodeToStart("John");
		myLinkedList.addANodeToStart("Alice");
		myLinkedList.addANodeToStart("Carter");
		myLinkedList.addANodeToStart("Juan");
		myLinkedList.deleteHeadNode();
		// check if it is Carter, Alice, John
		myLinkedList.showList();

		// add two new name to the last node
		System.out.println("the new linked list");
		myLinkedList.addANodeToEnd("Mary");
		myLinkedList.addANodeToEnd("Danny");
		
		// check the result
		myLinkedList.showList();
	}

	private Node head;

	public LinkedList() {
		head = null;
	}

	public void showList() {
		Node position = head;
		while (position != null) {
			System.out.println(position.data);
			position = position.link;
		}
	}

	public int length() {
		int count = 0;
		Node position = head;
		while (position != null) {
			count++;
			position = position.link;
		}
		return count;
	}

	public void addANodeToStart(E addData) {
		head = new Node(addData, head);
	}

	public void addANodeToEnd(E addData)

	{
		// use the position node to track to the last node
		Node position = head;
		// when the link is null, stop the loop and add a node 
		while (position.link != null) {
			// get next node
			position = position.link;
		}
		// add a new node to the end
		position.link = new Node(addData, null);

	}

	public void deleteHeadNode() {
		if (head != null)
			head = head.link;
		else {
			System.out.println("Deleting from an empty list.");
			System.exit(0);
		}
	}

	private class Node {
		private E data;
		private Node link;

		public Node() {
			link = null;
			data = null;
		}

		public Node(E newData, Node linkValue) {
			data = newData;
			link = linkValue;
		}
	}
}
