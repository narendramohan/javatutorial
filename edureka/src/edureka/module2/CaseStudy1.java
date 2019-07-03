package edureka.module2;

import java.util.Scanner;

public class CaseStudy1 {
	public double subTotal;
	public static double runningTotal;
	private static double itemPrice;
	static boolean ordering = true;
	static Scanner input = new Scanner(System.in);
	static double j = 0.0;

	public static void main(String[] args) {
		int menuOption;
		int foodItem = 0;
		input = new Scanner(System.in);
		double runningTotal = 0;
		while (ordering) {
			menu();
			menuOption = input.nextInt();
			switch (menuOption) {
			case 1:
				foodItem = 1;
				runningTotal += ItemPrice(foodItem);
				break;
			case 2:
				foodItem = 2;
				runningTotal += ItemPrice(foodItem);
				break;
			case 3:
				foodItem = 3;
				runningTotal += ItemPrice(foodItem);
				break;
			case 4:
				done(runningTotal);
				break;
			default:
				System.out.println("Invalid option.");
			}
		}
		System.out.println("Total amount: " + runningTotal +" rs");
	}

	public static void menu() {
		System.out.println("Welcome! Follow are menu\n1. Aloo Paratha (50.00 rs) \n2. Mooli Paratha (45 rs)\n3. Gobhi Paratha (55.00 rs) \n4. Done");
	}

	public static double ItemPrice(int foodItem) {
		if (foodItem == 1) {
			// Aloo Paratha= 50.00 rs.
			System.out.println("You've ordered a Aloo Paratha");
			itemPrice = 50.00;
		}
		if (foodItem == 2) {
			// Mooli Paratha = 40 rs
			System.out.println("You've ordered Mooli Paratha");
			itemPrice = 45;
		}
		if (foodItem == 3) {
			// Gobhi Paratha = 55.00 rs
			System.out.println("You've ordered a Gobhi Paratha");
			itemPrice = 55.00;
		}
		quantity();
		return j;
	}

	public static double quantity() {
		System.out.println("Enter quantity");
		double quantity = input.nextDouble();
		subTotal(quantity, itemPrice);
		return quantity;
	}

	public static double subTotal(double quantity, double itemPrice) {
		double subTotal = quantity * itemPrice;
		System.out.println("Subtotal: " + subTotal + " rs");
		j = subTotal;
		return subTotal;
	}

	public static void done(double runningTotal) {
		ordering = false;
		System.out.println("Enjoy your meal");
	}
}
