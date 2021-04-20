
// Date: Mar 23 2021
// Name: Chen Hsieh
// Student number: ch29576, 811744663
// Class: BINF 8006
// bonus practice

public class SchoolSystemTesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student student1 = new Student("Jack", "123 Lex Rd", "706-111-1111", "jack@uga.edu", "good");
		System.out.println(student1.toString());
		
		Staff staff1 = new Staff("Jack", "123 Lex Rd", "706-111-1111", "jack@uga.edu", 70000.0, "davison 1000", "May 23 2021", "assistant");
		System.out.println(staff1.toString());
		
		Faculty faculty1 = new Faculty("Jack", "123 Lex Rd", "706-111-1111",  "jack@uga.edu", 70000.0, "davison 1000", "May 23 2021", "Wednesday 13:00", "Professor");
		System.out.println(faculty1.toString());

	}

}
