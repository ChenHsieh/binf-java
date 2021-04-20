import java.util.*;


//Date: Mar 8 2021
//Name: Chen Hsieh
//Student number: ch29576, 811744663
//Class: BINF 8006
//Lab 5-1

public class BubbleSort {
	// create a random array
	public static void main(String[] args) {
		Random r = new Random();
		int array1[] = new int[10];
		// assign random number
		for (int i =0; i<10; i++) {
			array1[i] = r.nextInt(100);
			
		}
		// check before sort
		System.out.println("Array before sorting: " + Arrays.toString(array1));
		// call the sort function
		Bubblesort(array1);
		// check the sorting result
		System.out.println("Array after sorting: " + Arrays.toString(array1));
	}
	public static void Bubblesort(int[] array1) {
		//set the first index i
		for (int i =0;i<array1.length;i++) {
			// set the second index j that is always pointing to the number later than i
			for (int j =i+1;j<array1.length;j++)
				// check their value, if not right then swap
				if (array1[j] < array1[i]) {
					int tmp = array1[i];
					array1[i] = array1[j];
					array1[j] = tmp;
				}
		}
	}

}


