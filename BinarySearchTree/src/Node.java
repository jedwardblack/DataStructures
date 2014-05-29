public class Node {
	private Node parent;
	private Node leftChild;
	private Node rightChild;
	private int myData;
	
	//Default constructor. Accepts an int as a parameter and initializes myData to
	//that value. Initializes leftNode and rightNode.
	public Node(int N){
		parent = null;
		rightChild = null;
		leftChild = null;
		myData = N;
	}
	
	//Changes the reference to the parent for this Node
	public void setParent(Node n){
		parent = n;
	}
	
	//Changes the reference to leftChild for this Node
	public void setLeft(Node n){
		leftChild = n;
		
	}
	
	//Changes the reference to the rightChild for this Node
	public void setRight(Node n){
		rightChild = n;
	}
	
	//Changes the reference to the rightChild for this Node
	public void setData(int N){
		myData = N;
	}
	
	//Returns the leftChild of this node.
	public Node getLeft(){
		return leftChild;
	}
	
	//Returns the rightChild this node.
	public Node getRight(){
		return rightChild;	
	}
	
	//Returns the parent of this node.
	public Node getParent(){
		return parent;
	}
	
	//Returns the item for this node.
	public int getData(){
		return myData;
		
	}
}
