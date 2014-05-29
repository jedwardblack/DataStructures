public class RubberDuckBST
{
	
	private Node root;
	
	//default constructor initializes to empty tree.
	public RubberDuckBST() {
		root = null;
	}
	
	//if not full, inserts given duckCoord into binary search tree position; else, return false.
	public boolean insert(int duckCoord) {
		root = insert(duckCoord, root);
		return true;
	}

	//IF root is null, returns Node for root; else, builds a binary tree recursively
    public Node insert(int duckCoord, Node node) {
	if (node == null) {
	    return new Node(duckCoord);
	} 
	else {
	    if (duckCoord-node.getData() < 0) {
	    	node.setLeft(insert(duckCoord, node.getLeft()));
	    } 
	    else if(duckCoord-node.getData() > 0) {
	    	node.setRight(insert(duckCoord, node.getRight()));
	    }
	    else if(duckCoord-node.getData() == 0) {
	    	node.setData(duckCoord);
	    }
	}
	return node;
    }
	
	//Given coordinate of the center of a toss and the radius of splash,
	//return the duck coordinate of the FIRST duck found to have been splashed by this toss;
	//else, return a negative integer that signifies a miss.		
	public int checkToss(int tossCoord, int splashRadius) {
		Node node1 = get(tossCoord, splashRadius);
		if(node1 == null) return -1;
		else return node1.getData();
		
	}
	
	//Checks a binary tree to see if any node is within range of a toss
	public Node get(int Coord, int radius) {
		Node node2 = root;
		int lowRange = Coord-radius;
		int highRange = Coord+radius;
		while (node2 != null) {
			int nodeVal = node2.getData();
			System.out.println(nodeVal+" "+lowRange+" "+highRange);
		    if (nodeVal>=lowRange && nodeVal<=highRange) {
		    	return node2;
		    }
		    if (nodeVal>lowRange) {
		    	node2 = node2.getLeft();
		    } 
		    else {
		    	node2 = node2.getRight();
		    }
		}
		return null;
	    }
}
