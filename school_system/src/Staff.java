
public class Staff extends Employee {
	protected String title;

	public Staff(String name, String address, String phoneNumber, String email, double salary, String office,
			String dateHired, String title) {

		super(name, address, phoneNumber, email, salary, office, dateHired);

		this.title = title;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return "Name: " + getName() + " address: " + getAddress() + " Phone Number: " + getPhoneNumber() + " email: "
				+ getEmail() + " Salary " + getSalary() + " Office" + getOffice() + "Date Hired:" + getDateHired()
				+ " Title: " + title;
	}
}