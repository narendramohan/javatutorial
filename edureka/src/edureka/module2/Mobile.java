package edureka.module2;

public class Mobile extends Phone {

	
	public void createMessage(String phoneNum) {
		System.out.println("new Messeage sent to "+phoneNum);
	}
	
	public void readMessage(String phoneNumber) {
		System.out.println("reading message from "+phoneNumber);
	}
	
	

}
