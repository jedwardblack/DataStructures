
public interface ItemOrderedList {

	//Resets the list to the empty state.
	public void clear();
	
	//Inserts the product into the list if 
	//its key is unique (case insensitive) and the list is not full. 
	//Returns true if successful; otherwise, false.
	public boolean add(Item product);
	
	//Deletes the Item with the given key (case insensitive). 
	//Returns true if an Item was found and deleted; else, false.
	public boolean delete(String keyValue);
	
	//Returns the Item having the specified key value (case insensitive)
	//Otherwise, return null if not found.
	public Item retrieve(String keyValue);
	
	//Returns true if and only if the list is empty.
	public boolean isEmpty();
	
	//Returns true if the list is full.
	public boolean isFull();
	
	//Prints all of the Items in the list 
	//in ascending order by the key field.
	public void print();
}
