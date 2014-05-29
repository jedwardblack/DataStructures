public class Node {
	private Node nextNode;
	private Node prevNode;
	private int myData;
	
	//Default constructor. Accepts an int as a parameter and initializes myData to
	//that value. Initializes nextNode to null and preNode to null.
	public Node(int N){
		prevNode = null;
		nextNode = null;
		myData = N;
	}
	
	//Changes the reference to the next Node for this Node
	public void setNext(Node n){
		nextNode = n;
		
	}
	
	//Changes the reference to the previous Node for this Node
	public void setPrev(Node N){
		prevNode = N;
	}
	
	//Returns the next node after this node.
	public Node getNext(){
		return nextNode;
		
	}
	
	//Returns the next node after this node.
	public Node getPrev(){
		return prevNode;
		
	}
	
	//Returns the item for this node.
	public int getData(){
		return myData;
		
	}
}