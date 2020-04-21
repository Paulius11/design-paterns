
public class EmployeeCSVAdapter implements Employee {

	private EmployeeCSV employeeCsv;

	public EmployeeCSVAdapter(EmployeeCSV employeeCsv) {
		super();
		this.employeeCsv = employeeCsv;
	}

	@Override
	public String getId() {
		return "" + employeeCsv.getId();
	}

	@Override
	public String getFirstName() {
		return employeeCsv.getFirstname();
	}

	@Override
	public String getLastName() {
		return employeeCsv.getLastname();
	}

	@Override
	public String getEmail() {
		return employeeCsv.getEmailAddress();
	}

	@Override
	public String toString() {
		return "EmploeyeeCSVAdapter [ID: " + getId() + ", First name: " + getFirstName() + ", Last name: "
				+ getLastName() + ", Email: " + getEmail() + "]";
	}

}
