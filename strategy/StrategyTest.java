package strategy;

public class StrategyTest {
	public static void main(String[] args) {
		Greeter grlt = new Greeter();

		// Functional way
		GreeterLanguageStrategy lt = () -> "Labas";
		GreeterLanguageStrategy en = () -> "Hello";
//		grlt.setLanguage(() -> "Labas"); 
		grlt.setLanguage(en);

//		grlt.setLanguage(new LithuanianGreetingStrategy());
//		grlt.setLanguage(new EnglishGreetingStrategy());
		grlt.greet("Paulius", "G");
	}
}
