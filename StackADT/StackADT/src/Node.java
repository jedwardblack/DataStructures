
public class Node {

	Node next;
	Item item;
	
	//Constructor. Creates empty node, with null next.
	public Node() {
		next = null;
		item = null;
	}
	
	//Constructor. Creates a node with item T, and null next.
	public Node(Item T) {
		next = null;
		item = T;
	}
	
	//Sets next for a given ItemNode.
	public void setNext(Node n) {
		next = n;
	}
	
	//Returns the next ItemNode in the linked list for any given ItemNode.
	public Node getNext() {
		return this.next;
	}
	
	//Returns the Item object associated with a given ItemNode.
	public Item getItem() {
		return this.item;
	}
	
	
}