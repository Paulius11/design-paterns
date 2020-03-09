package signleton;

public class SinglTest {

	public static void main(String[] args) {
		Singleton tmp = Singleton.getInstance();
		tmp.demoMethod();
		Singleton tmp2 = Singleton.getInstance();
		System.out.println(tmp == tmp2);

	}
}
