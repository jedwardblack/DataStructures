
public class LinkedIntQueue implements IntQueue {
	
	public Node myFront;
	public Node myRear;
	
	public LinkedIntQueue() {
		myFront = null;
		myRear = null;
	}

	//return true if queue is full; else, false.
	public boolean isFull() {
		return false;
	}

	//return true if empty; else, false.
	public boolean isEmpty() {
		return (myFront==null);
	}

	//if not full, creates node containing N and appends to rear and returns true; 
	//else, leaves queue unchanged and returns false.
	public boolean insert(int N) {
		boolean result = false;
		if(isEmpty()){
			Node newNode = new Node(N);
			myFront = newNode;
			myRear = newNode;
		}
		else if(!isFull()) {
			Node newNode = new Node(N);
			newNode.setPrev(myRear);
			myRear.setNext(newNode);
			myRear = newNode;
			result = true;
		}
		return result;
	}

	//if not empty, remove and returns first element, else, return -1
	public int remove() {
		int result = -1;
		if(!isEmpty()) {
			result = myFront.getData();
			myFront = myFront.getNext();
			myFront.setPrev(null);
		}
		return result;
	}

}
