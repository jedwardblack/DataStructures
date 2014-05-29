
public class MergeSort {
	private String[] arrayCopy;
	private String[] helperArray;
	private int countCompares = 0;
	private int countAssigns = 0;

	public void mergeSort(String[] data) {
		arrayCopy = data;
		helperArray = new String[data.length];
		mergesort(0, helperArray.length-1);
	}

	private void mergesort(int low, int high) {
	    if (low < high) {
			int mid = low + (high - low) / 2;
			mergesort(low, mid);
			mergesort(mid + 1, high);
			merge(low, mid, high);
	    }
	}

	private void merge(int low, int mid, int high) {
		for (int i = low; i <= high; i++) {
			helperArray[i] = arrayCopy[i];
		}
		
		int i = low;
		int j = mid + 1;
		int k = low;
		while (i <= mid && j <= high) {
			countCompares++;
			if (helperArray[i].compareToIgnoreCase(helperArray[j]) < 0) {
				countAssigns++;
				arrayCopy[k] = helperArray[i];
				i++;
		    }
			else {
				countAssigns++;
		        arrayCopy[k] = helperArray[j];
		        j++;
		    }
		    k++;
		}
		while (i <= mid) {
			countAssigns++;
			arrayCopy[k] = helperArray[i];
			k++;
			i++;
		}
	}

	public int getNumComparisons() {
		return countCompares;
	}
	
	public int getNumAssignments(){
		return countAssigns;
	}
} 