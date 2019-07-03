package edureka.module1;

import java.util.Scanner;
/**
 * 
 * @author Narendra.Prasad
 * John and Paul went to watch a movie in theatre where they need to buy two tickets.
 * There are two types of tickets, one Golden category and other as silver category.
 * If they buy tickets for silver category, then per person a ticket shouls cost Rs.150 and
 * for golden category ticket should cost them Rs.200 each.
 * Considering this scenario, write a program for theatre ticket booking application
 * scenario.
 */
public class casestudy1 {

	public static final double ticketPrice =400;
	public static final int discount= 10;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Booking system!");
		System.out.println("Please enter the category: ");
		
		System.out.println("1. Silver category ");
		System.out.println("2. Golden category ");
		int category = scanner.nextInt();
		System.out.println();
		System.out.println("Enter the number of tickets: ");
		int numberOfTicktes = scanner.nextInt();
		
		System.out.println("Total price for ticket is: "+calculatePrice(category, numberOfTicktes));

	}
	
	public static double calculatePrice(int category, int numberOfTicktes) {
		
		double total = ticketPrice * numberOfTicktes;
		switch (category) {
		case 1: total = 150 * numberOfTicktes;break;
		case 2: total = 200 * numberOfTicktes; break;
		default:
			throw new RuntimeException("Invailid Entry");
		}
		
		return total;
	}

}
