
/**
 * File: Lab11ONealMorrison.java Class: CSCI 1302 Author: Taylor O'Neal,
 * Seraphina Morrison Created on: April 19th, 2024 Last Modified: April 19th,
 * 2024 Description:
 */
public class Lab12Prob03 {

	public static void main(String[] args) {
		String string = "hello";
		System.out.println(reverseString(string));
	}

	public static String reverseString(String string) {
		return reverseString(string, string.length() - 1);
	}
	
	public static String reverseString(String s, int n) {
		if (n <= 0) {
			return "" + s.charAt(0);
		} else {
			return (s.charAt(n) + reverseString(s, n - 1));
		}
	}

}
