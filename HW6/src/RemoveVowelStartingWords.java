
// Date: April 17 2021
// Name: Chen Hsieh
// Student number: ch29576, 811744663
// Class: BINF 8006
// HW 6-1

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


public class RemoveVowelStartingWords {

	public static void main(String[] args) throws FileNotFoundException {
		//define the words for storing reading result
		ArrayList<String> words = new ArrayList<String>();
		// readin the testing text
		File myObj = new File("input.txt");
		Scanner myReader = new Scanner(myObj);
		// read the words into the arraylist
		while (myReader.hasNext()) {
			words.add(myReader.next());
		}
		//close it
		myReader.close();
		//print the original reading result
		System.out.println("original words");
		System.out.println(words);
		
		
		// prepare a new arraylist for the operation
		ArrayList<String> noVowelWords = new ArrayList<String>();
		
		//go through each words
		for (int i = 0; i < words.size(); i++) {
			String word = words.get(i);
			// use the regex to check if the word start with any vowel in an case insensitive fassion
			boolean startWithVowel = word.toLowerCase().matches("^[aeiou].*$");
			if (startWithVowel) {
				// print out those startwith vowel
				System.out.println(word);
			} else {
				// store those without vowel starting to the new arraylist
				noVowelWords.add(word);
			}
		}
		
		// print out the processed result
		System.out.println("processed words");
		System.out.println(noVowelWords);
	}

}
