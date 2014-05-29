import java.util.Scanner;

public class Prog8 {
	
	public static void main(String[] args) {
		boolean run = true;
	
		while(run) {
			System.out.println("Sorter");
			System.out.println("______\n");
			System.out.println("1. Selection Sort");
			System.out.println("2. Bubble Sort");
			System.out.println("3. Quick Sort");
			System.out.println("4. Merge Sort");
			System.out.println("5. Exit");
			System.out.println();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please make a selection:");
			int a = scanner.nextInt();
			switch (a) {
				case 1: System.out.println("Enter the name of the file you would like to sort:");
						String b2 = scanner.next();
						String[] array2 = Reader.read(b2);
						Sorter sorter2 = new Sorter();
						System.out.print("\nArray before sorting: ");
						sorter2.printArray(array2);
						System.out.println("\nSize of list: "+array2.length);
						sorter2.selectionSort(array2);
						System.out.print("Array after sorting: ");
						sorter2.printArray(array2);
						System.out.println("\n");
						break;
				case 2: System.out.println("Enter the name of the file you would like to sort:");
						String b3 = scanner.next();
						String[] array3 = Reader.read(b3);
						Sorter sorter3 = new Sorter();
						System.out.print("\nArray before sorting: ");
						sorter3.printArray(array3);
						System.out.println("\nSize of list: "+array3.length);
						sorter3.bubbleSort(array3);
						System.out.print("Array after sorting: ");
						sorter3.printArray(array3);
						System.out.println("\n");
						break;
				case 3: System.out.println("Enter the name of the file you would like to sort:");
						String b4 = scanner.next();
						String[] array4 = Reader.read(b4);
						Sorter sorter4 = new Sorter();
						System.out.print("\nArray before sorting: ");
						sorter4.printArray(array4);
						System.out.println("\nSize of list: "+array4.length);
						sorter4.quickSort(array4);
						System.out.print("Array after sorting: ");
						sorter4.printArray(array4);
						System.out.println("\n");
						break;
				case 4: System.out.println("Enter the name of the file you would like to sort:");
						String b5= scanner.next();
						String[] array5 = Reader.read(b5);
						Sorter sorter5 = new Sorter();
						System.out.print("\nArray before sorting: ");
						sorter5.printArray(array5);
						System.out.println("\nSize of list: "+array5.length);
						sorter5.mergeSort(array5);
						System.out.print("Array after sorting: ");
						sorter5.printArray(array5);
						System.out.println("\n");
						break;
				case 5: run = false;
						System.out.println("Thank you for using 'Sorter'!");
						break;
			}
			
		}
		
	}
}
