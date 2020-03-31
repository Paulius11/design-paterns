

public class GreeterUpperCaseDecorator  implements Greeter {
	private Greeter original;

	public GreeterUpperCaseDecorator(Greeter original) {
		super();
		this.original = original;
	}

	@Override
	public String greet(String firstName, String lastName) {
		return String.format("%s %s", firstName.toUpperCase(), lastName.toUpperCase());
	}
}
