package week1.day2;

public class Mobile {
	
	public void sendSms() {
		System.out.println("From OPPO");
	}
		
		public long makeCall(long phoneNumber)
		{
			return phoneNumber;
		}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
     Mobile call = new Mobile();
     call.sendSms();
     long makeCall = call.makeCall(9629747842l);
    System.out.println(makeCall);
     
     	}
	

}
