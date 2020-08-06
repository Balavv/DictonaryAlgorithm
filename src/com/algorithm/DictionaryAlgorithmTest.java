package com.algorithm;

public class DictionaryAlgorithmTest {

	static Dictionary<Integer, Character> dict = new Dictionary<Integer, Character>();

	public static void main(String[] args) {

		// Test case #1:
		test("insert(1,A)", dict.insert(1, 'A'));

		// Test case #2:
		test("insert(2,B)", dict.insert(2, 'B'));

		// Test case #3:
		test("insert(3,C)", dict.insert(3, 'C'));

		// Test case #4:
		test("find(3))", dict.find(3));

		test("remove(3))", dict.remove(3));

	}

	private static void test(String string, Object result) {
		System.out.print(string + " ");
		System.out.print(result);
		System.out.println(" " + dict);
	}
}