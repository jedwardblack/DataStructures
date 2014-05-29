public interface IntQueue
{
	//return true if queue is full; else, false.
	public boolean isFull();
	
	//return true if empty; else, false.
	public boolean isEmpty();
	
	//if not full, appends N to rear and returns true; 
	//else,leaves queue unchanged and returns false.
	public boolean insert(int N);
	
	//if not empty, remove and returns first element, else, return -1
	public int remove();
	

}