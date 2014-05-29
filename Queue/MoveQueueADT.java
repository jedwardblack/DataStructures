/*
 * Names: Joseph Black & Ronald Zielaznicki
 * Program: Program4
 * Date: October 10, 2013
 *
 */

//An interface to describe how a MoveQueue ADT must be used.
public interface MoveQueueADT {

	//Returns true if queue is full.
	public boolean isFull();
	
	//Returns true if queue is empty.
	public boolean isEmpty();
	
	//Removes front and returns data.
	public Move remove();
	
	//Adds Move P to the end of the queue.
	public boolean insert(Move P);
	
	
}
