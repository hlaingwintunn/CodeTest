package org.java.test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution1 {
	
	static int evenCount = 0;
	static int oddCount = 0;

	public static void main(String[] args) {
		int [] number = {2, 1, 5, -6, 9};
		
		final int  result = numEvenSumPairs(number);
		
		System.out.println(result);
	}
	
	public static int numEvenSumPairs(int[] numbers) {
		
		IntStream stream1 = Arrays.stream(numbers);
		stream1.forEach(num -> {
			if ((num & 1) == 0) {
				evenCount++;
			}
		});

//		for (int number : numbers) {
//			if ((number & 1) == 0) {
//				evenCount++;
//			}
//		}

		oddCount = numbers.length - evenCount;
		long temp = (evenCount * (evenCount - 1) / 2)
				+ (oddCount * (oddCount - 1) / 2);

		if (temp >= 1000000000) {
			return -1;
		}

		return (int) temp;
	}

}
