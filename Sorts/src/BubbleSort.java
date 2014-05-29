
public class BubbleSort {
	private int countCompares = 0;
    private int countAssigns = 0;

    public void bubbleSort(String[] data) {
    	for (int i=0; i<data.length; i++){
    		for (int j=data.length-1; j>i; j--){
    			countCompares++;
    			if(data[j-1].compareToIgnoreCase(data[j]) > 0) {
    				swap(data, j-1, j);
    			}
    		}
    	}
    }
    public void swap(String[] data, int index1, int index2) {
    	countAssigns = countAssigns+3;
    	String temp = data[index1];
    	data[index1] = data[index2];
    	data[index2] = temp;
    }
    
    /* Returns the number of key comparisons made by the most
     * recent invocation of one of the above sort methods. */
    public int getNumComparisons() {
    	return countCompares;
    }
    
    /* Returns the number of assignments made by the most
     * recent invocation of one of the above sort methods. */
    public int getNumAssignments(){
    	return countAssigns;
    }
}
