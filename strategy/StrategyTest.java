package strategy;

public class StrategyTest {
	public static void main(String[] args) {
		Greeter grlt = new Greeter();
		grlt.setLanguage(new LithuanianGreetingStrategy());
//		grlt.setLanguage(new EnglishGreetingStrategy());
		grlt.greet("Paulius", "Gaizauskas");
	}
}
