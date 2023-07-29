package week1.day2;

public class Tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile m1=new Mobile();
  long makeCall = m1.makeCall(9629747842l);
  System.out.println("My mobile number is" +makeCall);
  m1.sendSms();
	}

}
