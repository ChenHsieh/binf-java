
// Date: April 17 2021
// Name: Chen Hsieh
// Student number: ch29576, 811744663
// Class: BINF 8006
// HW 6-2
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DNAsequences {

	public static void main(String[] args) {
		// the sequence from the problem
		String seq = "ACAAGATGCCATTGTCCCCCGGCCTCCTGCTGCTGCTGCTCTCCGGGGCCACGGCCACCGCTGCCCTGCC";
		// define the matcher with CAA|CTG to find both kind of them
		Matcher m = Pattern.compile("CAA|CTG").matcher(seq);
		// go through the whole sequence and print them out
		while(m.find()) {
			// m.group to print the finding, and also print out the coordinate
			System.out.printf("%s [%d:%d] %n", m.group(), m.start(), m.end());	
		}
		

	}

}
