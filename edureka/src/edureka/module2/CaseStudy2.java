package edureka.module2;

/*class test{
	static {
		System.out.println("super");
	}
}*/
public class CaseStudy2{ /*extends test{
	static {
		System.out.println("super1");
	}*/
	public static void main(String[] args) {
		/*
		 * Phone phone = new Phone(); Mobile mobile = new Mobile();
		 * 
		 * phone.makeCall("18923912"); phone.recieveCall("12832681");
		 * 
		 * mobile.makeCall("18923912"); mobile.recieveCall("12832681");
		 * mobile.createMessage("1234123"); mobile.readMessage("2312312");
		 */
		//System.out.println(Math.sqrt(100)+" "+Math.floor(10.9));
		System.out.println("----------------------"+solution(10, 20));
		System.out.println("----------------------"+solution(6000, 7000));
	}
	public static int solution(int A, int B) {
		int maxsqrt =0;
		
		for(int i=A; i<=B;i++) {
			int temp= i;
			int msqrt=0;
			//System.out.println(temp);
			while((int)Math.sqrt(temp)*(int)Math.sqrt(temp)==temp) {
				temp = (int)Math.sqrt(temp);
				msqrt++;
			}
			if(maxsqrt<msqrt) {
				maxsqrt=msqrt;
			}
		}
		
		return maxsqrt;
        // write your code in Java SE 8
    }
}
