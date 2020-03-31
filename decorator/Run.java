

public class Run {
	public static void main(String[] args) {
		Greeter greet = new GreeterImpl();
		System.out.println(greet.greet("Albertas", "Ensteinas"));
		
		Greeter greet1 = new GreeterUpperCaseDecorator(new GreeterImpl());
		System.out.println(greet1.greet("Izoakas", "Niutonas"));
		
		Greeter greet3 = new GreetExclamationMarkDecorator(new GreeterImpl());
		System.out.println(greet3.greet("Galilėjas", "Galilėjus"));
		

		
	}
}
