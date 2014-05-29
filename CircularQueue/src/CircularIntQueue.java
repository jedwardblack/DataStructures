public class CircularIntQueue implements IntQueue {

	public int MAX_SIZE = 100;
	public int count;
	public int[] circularArray;
	public int front;
	public int rear;
	public int size;
	
	
	public CircularIntQueue() {
		circularArray = new int[MAX_SIZE];
		front = -1;
		rear = -1;
	}
	
	//return true if queue is full; else, false.
	public boolean isFull() {
		return (count==100);
	}

	//return true if empty; else, false.
	public boolean isEmpty() {
		return (count==0);
	}

	//Inserts integer N into next array slot if not full.
	public boolean insert(int N) {
		boolean result = false;
		if(isEmpty()) {
			circularArray[0] = N;
			front = 0;
			rear = 0;
			count++;
			result = true;
		}
		else if(!isFull()){
			circularArray[count++] = N;
	        rear = (rear+1)%(MAX_SIZE);
	        result = true;
		}
		return result;
		
	}

	//if not empty, remove and returns first element, else, return -1
	public int remove() {
		int result = -1;
		if(!isEmpty()){
			result = circularArray[front];
			count--;
			front = (front+1)%(MAX_SIZE);
		}
		if(isEmpty()){
			front = -1;
			rear = -1;
		}
		return result;
	}

}
