public class Sorter {

    public void selectionSort(String[] data) {
    	SelectionSort selectionSorter = new SelectionSort();
    	selectionSorter.selectionSort(data);
    	System.out.println("Number of comparisons: "+selectionSorter.getNumComparisons());
		System.out.println("Number of assignments: "+selectionSorter.getNumAssignments());
    }
    
    public void bubbleSort(String[] data) {
    	BubbleSort bubbleSorter = new BubbleSort();
    	bubbleSorter.bubbleSort(data);
    	System.out.println("Number of comparisons: "+bubbleSorter.getNumComparisons());
		System.out.println("Number of assignments: "+bubbleSorter.getNumAssignments());
    }
    
    public void quickSort(String[] data) {
    	QuickSort quickSorter = new QuickSort();
    	quickSorter.quickSort(data);
    	System.out.println("Number of comparisons: "+quickSorter.getNumComparisons());
		System.out.println("Number of assignments: "+quickSorter.getNumAssignments());
    	
    }
    
    public void mergeSort(String[] data) {
    	MergeSort mergeSorter = new MergeSort();
    	mergeSorter.mergeSort(data);
    	System.out.println("Number of comparisons: "+mergeSorter.getNumComparisons());
		System.out.println("Number of assignments: "+mergeSorter.getNumAssignments());
    }
    
    public void insertionSort(String[] data) {
    	System.out.println("Only mergeSort, bubbleSort, quickSort and selectionSort were implemented.");
    }
    
    public void heapSort(String[] data) {
    	System.out.println("Only mergeSort, bubbleSort, quickSort and selectionSort were implemented.");
    }
    
    
    public void printArray(String[] data) {
    	for (int i = 0; i<data.length; i++){
    		System.out.print(data[i]);
    	}
    }
}
