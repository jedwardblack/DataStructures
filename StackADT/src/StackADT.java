
public interface StackADT {

	//Returns true if stack is full; else, false.
	public boolean isFull();
	
	//Returns True if stack is empty; else, false.
	public boolean isEmpty();
	
	//If not isEmpty, removes and return reference to top object; else
	//return null if stack is empty.
	public Object pop();
	
	//Returns Object at top of stack, but doesn't remove 
	//it from the stack.
	public Object peek();
	
	//If not full, insert P at top of stack and 
	//returns true; else, false.
	public boolean push(Object P);
}
