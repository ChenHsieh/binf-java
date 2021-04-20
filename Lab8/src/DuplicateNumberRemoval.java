import java.util.ArrayList;

//Date: April 12 2021
//Name: Chen Hsieh
//Student number: ch29576, 811744663
//Class: BINF 8006
//Lab 8

public class DuplicateNumberRemoval {

	public static void main(String[] args) {
		// declare an array list
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		// add 10 numbers, some are duplicated (2 and 3 duplicated)
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(2);
		numbers.add(2);
		numbers.add(3);
		numbers.add(9);
		numbers.add(10);
		// print original array list
		System.out.println(numbers);
		// send the array list to the method
		ArrayList<Integer> noDupNumbers = removeDuplicates(numbers);
		// check the result
		
		System.out.println(noDupNumbers);

	}

	public static <Integer> ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
		// prepare an empty list
		ArrayList<Integer> neoList = new ArrayList<Integer>();
		// loop through the original list
		for (int i = 0; i < list.size(); i++) {
			// reset a checker to false every time
			Boolean dup = false;
			for (int j = 0; j < i; j++) {
				// if there is a duplication then set the checker to true
				if (list.get(i) == list.get(j)) {
					dup = true;
				}
			}
			// if no duplication then this number can get in the new list
			if (dup != true) {
				neoList.add(list.get(i));
			}
		}
		// return the new list
		return neoList;
	}

}
