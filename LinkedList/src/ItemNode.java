
public class ItemNode {

	ItemNode next;
	Item item;
	
	//Constructor. Creates empty node, with null next.
	public ItemNode() {
		next = null;
		item = null;
	}
	
	//Constructor. Creates a node with item T, and null next.
	public ItemNode(Item T) {
		next = null;
		item = T;
	}
	
	//Sets next for a given ItemNode.
	public void setNext(ItemNode n) {
		next = n;
	}
	
	//Returns the next ItemNode in the linked list for any given ItemNode.
	public ItemNode getNext() {
		return this.next;
	}
	
	//Returns the Item object associated with a given ItemNode.
	public Item getItem() {
		return this.item;
	}
	
	
}
