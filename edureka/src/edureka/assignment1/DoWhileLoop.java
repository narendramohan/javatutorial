package edureka.assignment1;

public class DoWhileLoop {

	public static void main(String[] args) {
		//Write a program to print 10 even numbers and 10 odd numbers.
		int i=1;
		do{
			if(i%2==0)
				System.out.println(i +" is an odd number");
			i++;
		} while(i<20); 
		
		i=1;
		do {
			if(i%2!=0)
				System.out.println(i +" is an even number");
			i++;
		} while(i<20);
		System.out.println("--------------------------------");
		
		//Write a program to find factorial of a number.
		System.out.println("Factorial for 5 is "+factorial(5));
		System.out.println("Factorial for 3 is "+factorial(3));
		System.out.println("Factorial for 1 is "+factorial(1));
		System.out.println("Factorial for 0 is "+factorial(0));
		
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
		int i =1;
		do {
			System.out.println(num*i);
			 i++;
		}while(i<10);
	}
	
	public static void addDigitsOfNumber(int num) {
		int n=0, sum=0, m=num;
		
		do
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        } while(m > 0);
		
		System.out.println("Sum of Digits "+num+": "+sum);
	}
	
	public static void reverseDigitsOfNumber(int num) {
		int n=0, sum=0, m=num;
		
		do
        {
            n = m % 10;
            sum = sum*10 + n;
            m = m / 10;
        } while(m > 0);
		
		System.out.println("Sum of Digits "+num+": "+sum);
	}
	
	public static void Fibonacci(int numbeOfFib) {
		int first =0;
		int second=1;
		System.out.print("0, 1, ");
		int i = 3;
		do {
			second = second+first;
			System.out.print(second + ", ");
			first = second-first;
			 i++;
		}while (i<=numbeOfFib);
		
		System.out.println();
	}
	

}
