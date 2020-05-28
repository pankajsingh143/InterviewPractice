package com.capgemini;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		int ar[] = {0, 0, 0};
		System.out.println("Intial array " + Arrays.toString(ar));
		ar[0] = 0;
		ar[1] = 0;
		ar[2] = 1;
		System.out.println("Incremented array " + Arrays.toString(ar));

	}

}
