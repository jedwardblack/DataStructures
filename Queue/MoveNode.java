/*
 * Names: Joseph Black & Ronald Zielaznicki
 * Program: Program4
 * Date: October 10, 2013
 *
 */
 
//MoveNode is an object that holds a move and a link to the next MoveNode.
public class MoveNode {
	private MoveNode nextNode;
	private Move heldMove;
	
	//Default constructor. Initializes both values to null.
	public MoveNode(){
		nextNode = null;
		heldMove = null;
	}
	
	//Constructor. Accepts a Move as a parameter and initializes heldMove to
	//that value. Initializes nextNode to null.
	public MoveNode(Move M){
		nextNode = null;
		heldMove = M;
		
	}
	
	 //Changes the reference to the next ItemNode for this Node
	public void setNext(MoveNode n){
		nextNode = n;
		
	}
	
	//Returns the next node after this node.
	public MoveNode getNext(){
		return nextNode;
		
	}
	
	
	 //Returns the item for this node.
	public Move getMove(){
		return heldMove;
		
	}
}
