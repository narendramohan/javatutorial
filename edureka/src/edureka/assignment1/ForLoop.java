package edureka.assignment1;

/*
 * --> Write a program to print 10 even numbers and 10 odd numbers.
 * --> Write a program to find factorial of a number.
 * --> Write a program to generate tables of 10.
 * --> Write a program to add the digits of a number.
 * --> Write a program to reverse the digits of a number.
 * --> Write a program to generate 10 Fibonacci numbers.
 */
public class ForLoop {
	public static void main(String[] args) {
		//Write a program to print 10 even numbers and 10 odd numbers.
		for(int i = 1; i<=20; i++) {
			if(i%2==0)
				System.out.println(i +" is an odd number");
		}
		for(int i = 1; i<=20; i++) {
			if(i%2!=0)
				System.out.println(i +" is an even number");
		}
		System.out.println("--------------------------------");
		
		//Write a program to find factorial of a number.
		System.out.println("Factorial for 5 is "+factorial(5));
		System.out.println("Factorial for 3 is "+factorial(3));
		System.out.println("Factorial for 1 is "+factorial(1));
		System.out.println("Factorial for  is "+factorial(0));
		
		System.out.println("--------------------------------");
		//Write a program to generate tables of 10.
		genTable(10);
		
		System.out.println("--------------------------------");
		//Write a program to add the digits of a number.
		addDigitsOfNumber(23);
		addDigitsOfNumber(245);
		
		System.out.println("--------------------------------");
		reverseDigitsOfNumber(23);
		reverseDigitsOfNumber(245);
		System.out.println("--------------------------------");
		Fibonacci(10);
		
	}
	
	public static long factorial(long number) {
		if(number<2) return 1;
		
		return number*factorial(number-1);
	}
	
	public static void genTable(int num) {
		for(int i=1; i<=10; i++) {
			System.out.println(num*i);
		}
	}
	
	public static void addDigitsOfNumber(int num) {
		int n=0, sum=0;
		
		for (int m=sum; m > 0;  m = m / 10)
        {
            n = m % 10;
            sum = sum + n;
           
        }
		
		System.out.println("Sum of Digits "+num+": "+sum);
	}
	
	public static void reverseDigitsOfNumber(int num) {
		int n=0, sum=0;
		
		for (int m=sum; m > 0;  m = m / 10)
        {
            n = m % 10;
            sum = sum*10 + n;
  
        }
		
		System.out.println("Sum of Digits "+num+": "+sum);
	}
	
	public static void Fibonacci(int numbeOfFib) {
//		if(numbeOfFib<=1) {
//			//System.out.print(1 + " ");
//			return 1;
//		}
//		//System.out.println((Fibonacci(numbeOfFib-1)+Fibonacci(numbeOfFib-2)) + " ");
//		return Fibonacci(numbeOfFib-1)+Fibonacci(numbeOfFib-2);
		int first =0;
		int second=1;
		System.out.print("0, 1, ");
		for (int i=3; i<=numbeOfFib; i++) {
			second = second+first;
			System.out.print(second + ", ");
			first = second-first;
		}
		
		System.out.println();
	}


}
