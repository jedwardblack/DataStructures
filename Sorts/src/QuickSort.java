
public class QuickSort {
	private String[] arrayCopy;
	private int countCompares = 0;
	private int countAssigns = 0;
	
	public void quickSort(String[] data) {
		arrayCopy = data;
		quickSort(0, arrayCopy.length-1);
	}
	  
	  private void quickSort(int low, int high) {
		  int i = low;
		  int j = high;
		  String pivot = arrayCopy[low + (high-low)/2];
		  while (i <= j) {
			  countCompares++;
		      while (arrayCopy[i].compareToIgnoreCase(pivot) < 0) {
		          i++;
		      }
		      countCompares++;
		      while (arrayCopy[j].compareToIgnoreCase(pivot) > 0) {
		          j--;
		      }
		      if (i <= j) {
		          swap(i, j);
		          i++;
		          j--;
		      }
		  }
		  if (low < j) {
			  quickSort(low, j);
		  }
		  if (i < high){
		      quickSort(i, high);
		  }
	  }
	
	private void swap(int i, int j) {
		countAssigns = countAssigns+3;
		String temp = arrayCopy[i];
		arrayCopy[i] = arrayCopy[j];
		arrayCopy[j] = temp;
	}
	
	public int getNumComparisons() {
		return countCompares;
	}
	
	public int getNumAssignments(){
		return countAssigns;
	}
}
