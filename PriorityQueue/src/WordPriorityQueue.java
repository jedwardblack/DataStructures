//Implements a priority queue of RankedWords by using a MAX HEAP.
public class WordPriorityQueue {
	
	//Fixed-size array of to hold up to 1023 RankedWord objects.
	private RankedWord[] RankedWordsArray;
	
	//Integer count of number of words currently stored in the priority queue
	int numWords;
	
	//Default constructor initializes to empty and creates fixed size array 
	//to hold up to 1023 RankedWord objects. Count of words stored is 0.
	public WordPriorityQueue() {
		RankedWordsArray = new RankedWord[1022];
		numWords = 0;
	}
	
	//Returns true if capacity has been reached; else, false.
	public boolean isFull() {
		boolean result = false;
		if (numWords==1023)
			result = true;
		return result;
	}
	
	//Returns true if no words are yet stored.
	public boolean isEmpty() {
		boolean result = true;
		if (numWords!=0)
			result = false;
		return result;
	}
	
	//If not full, then insert given word into the MAX HEAP and return true; 
	//else, do nothing and return false. Duplicate words can be inserted.
	public boolean insert(String W, double rank) {
		int startingIndex = numWords;
		int hole = startingIndex;
		boolean result = false;
		if (!isFull()) {
			RankedWord wordToInsert = new RankedWord(W, rank);
			while(hole>0 && wordToInsert.getRank()>RankedWordsArray[(hole-1)/2].getRank()) {
				RankedWordsArray[hole] = RankedWordsArray[(hole-1)/2];
				hole = (hole-1)/2;
			}
			RankedWordsArray[hole] = wordToInsert;
			result = true;
			numWords++;
		}
		return result;
		
	}
	
	//If not empty, remove and return the highest remaining 
	//RankedWord from the priority queue; else, return null if empty.
	public RankedWord remove() {
		RankedWord result = null;
		if(!isEmpty()){
			result = RankedWordsArray[0];
			RankedWordsArray[0] = RankedWordsArray[numWords-1];
			numWords--;
			int hole = 0;
			int child;
			while(hole*2+1 < numWords) {
				child = hole*2+1;
				if( child != numWords && RankedWordsArray[child+1].getRank() > RankedWordsArray[child].getRank())
					child++;
				if( RankedWordsArray[child].getRank() > RankedWordsArray[hole].getRank()) {
					RankedWord temp = RankedWordsArray[hole];
					RankedWordsArray[hole] = RankedWordsArray[child];
					RankedWordsArray[child] = temp;
				}
				else
					break;
			}
		}
		return result;
	}
}
