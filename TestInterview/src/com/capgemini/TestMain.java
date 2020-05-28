package com.capgemini;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		// int n = 87;
		List<Integer> intList = null;
		for (int i = 0; i < 999; i++) {
			// System.out.println("i in main " + i);
			intList = new ArrayList<Integer>();
			fillArray(i, collectDigits(i, intList));
			intList = null;
		}

		// List<Integer> digits = collectDigits(n, intList);
		// fillArray(n, digits);
		// System.out.println("digits " + Arrays.toString(digits.toArray()));

		// System.out.println("digits " + Arrays.toString(digits.toArray()));

	}

	static List<Integer> collectDigits(int n, List<Integer> intList) {
		// System.out.println("n in collectDigits " + n);

		if (n / 10 > 0) {
			collectDigits(n / 10, intList);
		}
		intList.add(n % 10);
		// System.out.println(n + " " + Arrays.toString(intList.toArray()));
		return intList;
	}
	static List<Integer> fillArray(int n, List<Integer> list) {
		// System.out.println(n + " size " + String.valueOf(n).length());

		if (String.valueOf(n).length() == 1) {
			// System.out.println("Number is single digit" + list);
			list.add(0, 0);
			list.add(1, 0);
			System.out.println(n + " " + list);

		} else if (String.valueOf(n).length() == 2) {
			// System.out.println("Number is double digit" + list);
			list.add(0, 0);
			System.out.println(n + " " + list);

		} else {
			System.out.println(n + " " + list);

		}
		return list;
	}

}
