import itaphones.phone.MobilePhone;
import itaphones.phone.Phone;

public class MobilePhoneAdapter implements Phone {

	MobilePhone phone;
	String response;

	public MobilePhoneAdapter(MobilePhone phone) {
		super();
		this.phone = phone;
	}

	@Override
	public void dial(String number) {
		response = phone.dial(number);
	}

	@Override
	public String getReponse() {
		return response;
	}

}
