
public class SelectionSort {
	private int countCompares = 0;
    private int countAssigns = 0;
	
	public void selectionSort(String[] data) {
    	int indexOfSmallest;
    	for (int i = 0; i <data.length-1; i++) {
    		indexOfSmallest = i;
    		for (int j = i+1; j<data.length; j++) {
    			countCompares++;
    			if (data[j].compareToIgnoreCase(data[indexOfSmallest])<0) {
    				indexOfSmallest = j;
    			}
    		}
    		swap(data, i, indexOfSmallest);
    	}
    }
	
	private void swap(String[] data, int i, int j) {
	    countAssigns = countAssigns+3;
	    String temp = data[i];
	    data[i] = data[j];
	    data[j] = temp;
	}
	
    public int getNumComparisons() {
    	return countCompares;
    }
    
    public int getNumAssignments(){
    	return countAssigns;
    }
}
