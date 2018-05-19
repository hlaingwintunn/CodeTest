package org.java.test;

import java.util.Arrays;

public class Solution2 {

	public static void main(String[] args) {
		int[] a = new int[] {4, 9, 1, 32, 13};
		int [] b = new int[] { 7, 21, 3, 42, 3, 7 };
		Arrays.sort(b);
		int minDiff = b[1]-b[0];
		for (int i = 2 ; i != b.length ; i++) {
		    minDiff = Math.min(minDiff, b[i]-b[i-1]);
		}
		System.out.println(minDiff);
	}

}
