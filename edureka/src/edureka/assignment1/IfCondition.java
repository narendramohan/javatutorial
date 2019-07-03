package edureka.assignment1;

/*
 * --> Write a program to check if a candidate is eligible for voting or not. (Hint: Check age)
 * --> Write a program to check if the number is positive or negative.
 * --> Extend the previous program to check whether the given number is positive, zero or negative. (Hint: use if-else conditions)
 * --> Write a program to find largest of two numbers.
 * --> Write a program to check given number is even or odd. (Hint: use % operator)
 */

public class IfCondition {

	public static void main(String[] args) {
		// --> Write a program to check if a candidate is eligible for voting or not. (Hint: Check age)
		Candidate candidate1 = new Candidate("Ram", 17);
		Candidate candidate2 = new Candidate("Shyam", 23);
		
		isEligibleForVoting(candidate1);

		isEligibleForVoting(candidate2);
		System.out.println();
		//--> Write a program to check if the number is positive or negative.
		
		int i1= 20, i2 =-20;
		isPositiveNumber(i1);
		isPositiveNumber(i2);
		System.out.println();
		//--> Extend the previous program to check whether the given number is positive, zero or negative. (Hint: use if-else conditions)
		checkNumber(i1);
		checkNumber(i2);
		checkNumber(0);
		System.out.println();
		
		//--> Write a program to find largest of two numbers.
		System.out.println();
		System.out.println("In 12, 24, largest is: "+ max(12, 13));
		System.out.println();
		//--> Write a program to check given number is even or odd. (Hint: use % operator)
		checkEvenOrOdd(12);
		checkEvenOrOdd(13);
		
	}

	private static void isPositiveNumber(int i1) {
		if(i1>=0)
			System.out.printf("\n%d is a positive number ", i1);
		else 
			System.out.printf("\n%d is a positive number ", i1);
	}

	private static void checkNumber(int i1) {
		if(i1>0)
			System.out.printf("\n%d is a positive number ", i1);
		else if (i1==0)
			System.out.printf("\n%d is a zero number ", i1);
		else 
			System.out.printf("\n%d is a positive number ", i1);
	}

	
	private static void isEligibleForVoting(Candidate candidate) {
		if(candidate.getAge()>=18) {
			System.out.println(candidate +" is eligible for voting.");
		} else {
			System.out.println(candidate +" is not eligible for voting.");
		}
	}
	
	public static int max(int num1, int num2) {
		if(num1>num2)
			return num1;
		else 
			return num2;
	}
	
	public static void checkEvenOrOdd(int num) {
		if(num%2==0) System.out.println(num +" is even number");
		else System.out.println(num +" is odd number");
		
	}
	

}

class Candidate {
	public Candidate(String name, int age) {
		this.name= name;
		this.age=age;		
	}
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Candidate [name=" + name + ", age=" + age + "]";
	}
	
	
}
