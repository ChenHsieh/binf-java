
//Student

public class Student extends Person {

	protected String status;

	public Student(String name, String address, String phoneNumber, String email, String status) {
		super(name, address, phoneNumber, email);
		this.status = status;
	}

	public String toString() {
		return "Name: " + getName() + " address: " + getAddress() + " Phone Number: " + getPhoneNumber() + " email: "
				+ getEmail() + "  Status " + status;
	}

}
