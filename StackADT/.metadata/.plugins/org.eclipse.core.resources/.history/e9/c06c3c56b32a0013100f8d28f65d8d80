
public class SLStack implements StackADT {

	private Node myTop;
	
	public SLStack() {
		myTop = null;
	}
	
	public boolean isFull() {
		return false;
	}
	
	public boolean isEmpty() {
		return (myTop == null);
	}
	
	public boolean push(Item t) {
		Node n = new Node(t);
		boolean result = false;
		if(!isFull()) {
			n.setNext(myTop);
			myTop = n;
			result = true;
		}
		return result;
	}
	
	public Item pop() {
		Item result = null;
		if(!isEmpty()) {
			result = myTop.getItem();
			myTop = myTop.getNext();
		}
		return result;
	}
	
	public Item peek() {
		return myTop.getItem();
	}
}
