package edureka.assignment1;

/*
 * --> Write programs to use all the data types and given arithmetic operations.
 * --> Write program to perform all the arithmetic operations given in the table.
 */
public class DataTypeAssignment1 {
	
	public static void main(String[] args) {
		//short
		short sh1 = 8;
		int sh2 = sh1*sh1; //it gets promoted to int
		int sh3 = sh1+sh1;
		int sh4 = sh1/sh1;
		
		System.out.printf("short: sh1: %d, sh2: %d, sh3: %d, sh4: %d ", sh1, sh2, sh3, sh4 );
		//long
		long l1 = 101;
		long l2 = 102;
		long l3 = l1+l2;
		long l4 = l2-l1;
		long l5 = l2*l1;
		long l6 = l2/l1;
		long l7 = l1++;
		long l8 = l1--;
		
		System.out.printf("\n long: l1: %d, l2: %d, l3: %d, l4: %d, l5: %d, l6: %d, l7: %d, l8: %d ", l1, l2, l3, l4, l5,l6,l7,l8 );
		
		//byte
		byte b1 = 23;
		byte b2 = 22;
		byte b3 = (byte) (b1+b2);
		byte b4 = (byte) (b2-b1);
		int b5 =  b2*b1;
		byte b6 = (byte) (b2/b1);
		byte b7 = b1++;
		byte b8 = b1--;
		System.out.printf("\n byte: b1: %d, b2: %d, b3: %d, b4: %d, b5: %d, b6: %d, b7: %d, b8: %d ", b1, b2, b3, b4, b5,b6,b7,b8 );
		
		//int
		int i1 = 18;
		int i2 = 24;
		int i3 =  (i1+i2);
		int i4 = (i2-i1);
		int i5 =  i2*i1;
		int i6 = (i2/i1);
		int i7 = i1++;
		int i8 = i1--;
		System.out.printf("\n int: i1: %d, i2: %d, i3: %d, i4: %d, i5: %d, i6: %d, i7: %d, i8: %d ", i1, i2, i3, i4, i5,i6,i7,i8 );

		
		//double
		double d1 = 20.5;
		double d2 = 25.6;
		double d3 =  (d1+d2);
		double d4 =  (d2-d1);
		double d5 =  d2*d1;
		double d6 = (d2/d1);
		double d7 = d1++;
		double d8 = d1--;
		System.out.printf("\n double: d1: %f, d2: %f, d3: %f, d4: %f, d5: %f, d6: %f, d7: %f, d8: %f ", d1, d2, d3, d4, d5,d6,d7,d8 );

		//float
		float f1 = 18;
		float f2 = 24;
		float f3 =  (f1+f2);
		float f4 =  (f2-f1);
		float f5 =  f2*f1;
		float f6 =  (f2/f1);
		float f7 = f1++;
		float f8 = f1--;
		System.out.printf("\n float: f1: %f, f2: %f, f3: %f, f4: %f, f5: %f, f6: %f, f7: %f, f8: %f ", f1, f2, f3, f4, f5,f6,f7,f8 );

		//char
		char c1 = 51;
		char c2 = 70;
		char c3 = (char)(c1+c2);
		char c4 = (char)(c2-c1);
		char c5 =  (char) (c2*c1);
		char c6 = (char)(c2/c1);
		char c7 = c1++;
		char c8 = c1--;
		System.out.printf("\n char: c1: %c, c2: %c, c3: %c, c4: %c, c5: %c, c6: %c, c7: %c, c8: %c ", c1, c2, c3, c4, c5,c6,c7,c8 );


	}

}
