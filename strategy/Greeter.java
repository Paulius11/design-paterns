package strategy;

public class Greeter {

	private GreeterLanguageStrategy greeterLanguageStrategy;

	public void greet(String firstName, String lastname) {
		System.out.println(String.format("%s %s %s", greeterLanguageStrategy.getGreetingString(), firstName, lastname));
	}

	public void setLanguage(GreeterLanguageStrategy greeter) {
		greeterLanguageStrategy = greeter;
	}

}
