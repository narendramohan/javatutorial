package edureka.module1;

import java.util.Scanner;

public class casestudy2 {

	public static final double ticketPrice =400;
	public static final int discount= 10;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter total number of Person: ");
		int numberOfPerson = scanner.nextInt();
		
		System.out.println("Total price for ticket is: "+calculatePrice(numberOfPerson));

	}
	
	public static double calculatePrice(int numberOfPerson) {
		
		double total = ticketPrice * numberOfPerson;
		if(numberOfPerson>10) {
			total = total-total/10;
		}
		return total;
	}

}
