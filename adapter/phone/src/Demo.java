import itaphones.phone.AutomaticDialer;
import itaphones.phone.MobilePhone;
import itaphones.phone.Phone;

public class Demo {

	public static void main(String[] args) {
		AutomaticDialer dialer = new AutomaticDialer();
		MobilePhone mobile = new MobilePhone();
		Phone mobileAdaptee = new MobilePhoneAdapter(mobile);

		System.out.println(dialer.dial(mobileAdaptee));

	}
}
