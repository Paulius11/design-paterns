

public class GreetExclamationMarkDecorator implements Greeter {

	private Greeter original;

	public GreetExclamationMarkDecorator(Greeter original) {
		super();
		this.original = original;
	}

	@Override
	public String greet(String firstName, String lastName) {
		return String.format("%s %s!", firstName, lastName);
	}
	
	
	
}
