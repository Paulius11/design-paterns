public class SinglTest {

    public static void main(String[] args) {
        Singleton singleObject = Singleton.getInstance();
        Singleton.demoMethod();
        Singleton tmp2 = Singleton.getInstance();
        System.out.println(singleObject == tmp2);

    }
}
