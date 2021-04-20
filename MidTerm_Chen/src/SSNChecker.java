import java.util.*;

// Date: Mar 18 2021
// Name: Chen Hsieh
// Student number: ch29576, 811744663
// Class: BINF 8006
// Midterm question 1

public class SSNChecker {
//	Enter a SSN: 222-23-3333
//
//	222-23-3333 is a valid social security number
//
//	Enter a SSN: 22-23-3333
//
//	22-23-3333 is an invalid social security number

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// get SSN input
		System.out.print("Enter a SSN: ");
		String ssnInput = input.next();

		// split the string into three part by "-"
		String[] ssnArray = ssnInput.split("-");

		// check if there are three section
		if (ssnArray.length != 3) {
			System.out.println(ssnInput + " is an invalid social security number");
			System.exit(0);
		}

		// check if each section composed of digits and correct length using method
		int ssnSection = 0;
		// use switch to step through each section
		switch (ssnSection) {
		case 0:
			// section 1 have 3 digits
			if (sectionExamine(ssnArray[ssnSection], 3) == true) {
				// if correct then go to next section
				ssnSection += 1;
			} else {
				System.out.println(ssnInput + " is an invalid social security number");
				break;
			}
		case 1:
			// section 2 have 2 digits
			if (sectionExamine(ssnArray[ssnSection], 2) == true) {
				// if correct then go to next section
				ssnSection += 1;
			} else {
				System.out.println(ssnInput + " is an invalid social security number");
				break;
			}
		case 2:
			// section 3 have 4 digits
			if (sectionExamine(ssnArray[ssnSection], 4) == true) {
				// if correct then print correct result
				System.out.println(ssnInput + " is an valid social security number");
			} else {
				System.out.println(ssnInput + " is an invalid social security number");
			}
		}
		input.close();
	}

	public static boolean sectionExamine(String currentSsnSection, int expectedLength) {
		// this function should check if the string have the length of the expected
		// length
		// then check if all of the content are digits

		// first check the length
		if (currentSsnSection.length() != expectedLength) {
			return false;
		} else {
			// declare a counter to count how many digits
			int digitCounter = 0;
			for (int i = 0; i < expectedLength; i++) {
				// check if the character within the range of digit ASCII number
				if (currentSsnSection.charAt(i) >= 48 && currentSsnSection.charAt(i) <= 57) {
					digitCounter += 1;
				}
			}
			// all characters should be digit so the counter should equal to the expected
			// length
			if (digitCounter == expectedLength) {
				return true;
			} else {
				return false;
			}
		}

	}

}
