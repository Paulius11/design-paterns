package strategy;

public class StrategyTest {
	public static void main(String[] args) {
		Greeter grlt = new Greeter();
		
		grlt.setLanguage(new LithuanianGreetingStrategy());
		// alternative with lambda grlt.setLanguage(() -> "Labas");
		
		// another strategy
		// grlt.setLanguage(new EnglishGreetingStrategy());
		grlt.greet("Paulius", "Gaizauskas");
	}
}
