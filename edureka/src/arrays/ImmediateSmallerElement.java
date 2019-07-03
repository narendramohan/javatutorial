package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ImmediateSmallerElement {
	// 1 ≤ T ≤ 200
	// 1 ≤ N ≤ 107
	// 1 ≤ arr[i] ≤ 1000

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int[] A = {1, 3, 6, 4, 1, 2};
			ArrayList<String> list = new ArrayList();
			//int max = Collections.max(Arrays.asList(A)); 
			//String i = in.nextLine();

			//System.out.println(i);

			int t = in.nextInt();
			if (t >= 1 && t <= 200) {
				while (t > 0) {
					int n = in.nextInt();
					int[] array = new int[n];
					String line = in.nextLine();
					list.add(line);
					
				}

			} else {
				System.out.println("Input should be betwee 1 to 200");
			}

		}

	}

	public int solution(int[] A) {
        // write your code in Java SE 8
		if(A.length==0) return 1;
		int num1=A[0];
		
		for(int i=1; i<A.length; i++) {
			num1 = Math.max(num1, A[i]);
		}
		
        
        if(num1 <0) return 1;
        int i=1;
        for(; i<=num1; i++){
            if(!Arrays.asList(A).contains(i)){
                return i;
            }
        }
        
        return i+1;
    }
}
