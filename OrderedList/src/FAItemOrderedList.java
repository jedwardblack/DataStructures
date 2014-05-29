
public class FAItemOrderedList {
	
	int MAX_SIZE = 50;;
	Item[] itemArray;
	int myCount;
	
	//Constuctor
	public FAItemOrderedList() {
		
		myCount = 0;
		itemArray = new Item[MAX_SIZE];
		
	}
	
	//Inserts the product into the list if 
	//its key is unique (case insensitive) and the list is not full. 
	//Returns true if successful; otherwise, false.
	//Sorts after a successful add.
	public boolean add(Item input) {
		
		System.out.println("check 1");
		boolean result = false;
		String inputName = input.getName();
		
		if (isEmpty()) {
			itemArray[0] = input;
			result = true;
			myCount++;
		}
		else if (isFull()) {
			result = false;
		}
		else if (retrieve(inputName) != null) {
			result = false;
		}
		else {
			for(int i=0; i<=myCount; i++) {
				if(i==myCount) {
					itemArray[myCount] = input;
					
					break;
				}
				int check = inputName.compareToIgnoreCase(itemArray[i].getName());
				if(check < 0){
					for(int j = myCount-1; j>=i; j--) {
						itemArray[j+1] = itemArray[j];
						itemArray[j] = input;
					}
					break;
				}
				else if(check > 0) continue;
			}
			myCount++;
			result = true;
		}
		return result;
	}

	//Returns the Item having the specified key value (case insensitive)
	//Otherwise, return null if not found.
	public Item retrieve(String find) {
		Item result = null;
		int high = myCount-1;
		int low = 0;
		int mid = (int)Math.round(high/2.0);
		int checkTimesMax = (int)Math.sqrt(myCount);
		int checkTimes = 0;
		
		while(result == null && (checkTimes<=checkTimesMax) ) {
			if(itemArray[mid].getName().compareToIgnoreCase(find) < 0) {
				high = mid-1;
				mid = (int)Math.round((high-low)/2.0);
				checkTimes++;
			}
			if(itemArray[mid].getName().compareToIgnoreCase(find) == 0)
				result = itemArray[mid];
			else if (itemArray[mid].getName().compareTo(find) > 0) {
				low = mid + 1;
				mid = (int)Math.round((high-low)/2.0);
				checkTimes++;
			}
		}
		return result;
	}

	//Deletes the Item with the given key (case insensitive). 
	//Returns true if an Item was found and deleted; else, false.
	//Decrements myCount, and sorts after successful delete.
	public boolean delete(String find) {
		boolean result = false;
		for (int i=0; i<myCount; i++) {
			if (find.compareToIgnoreCase(itemArray[i].getName()) == 0) {
				itemArray[i] = null;
				for(int j = i; j<myCount; j++) {
					itemArray[j] = itemArray[j+1];
				}
				result = true;
				myCount--;
				break;
			}
			else continue;	
		}
		return result;
	}
	
	//Resets the list to the empty state and myCount to 0.
	public void clear() {
		for (int i=0; i<50; i++) {
			itemArray[i] = null;
		}
		myCount=0;
	}

	//Returns true if and only if the list is empty.
	public boolean isEmpty() {
		boolean result;
		if (myCount != 0)
			result = false;
		else result = true;
		return result;
	}
	
	//Returns true if and only if the list is full.
	public boolean isFull() {
		boolean result = true;
		if (myCount != 49)
			result = false;
		return result;
	}
	
	//Prints all of the Items in the list 
	//in ascending order by the key field.
	public void print() {
		if(isEmpty())
			System.out.println("Your list is empty.");
		else
			for (int i=0; i<myCount; i++) {
				System.out.println("Name: "+itemArray[i].getName()+"   Price: "+itemArray[i].getPrice()+"   Qty.: "+itemArray[i].getQuantity());
			}
	}
	
	//Bubble sorts by comparing each items name.
	public void sort() {
		int length = myCount;
		for (int i = 0; i < length; i++) {
			for (int j =length-1; j > i; j--) {
				if (itemArray[j].getName().compareToIgnoreCase(itemArray[j-1].getName()) < 0) {
					Item t = itemArray[j];
					itemArray[j] = itemArray[j-1];
					itemArray[j-1] = t;
				}
			}
		}
	}
	 

}
