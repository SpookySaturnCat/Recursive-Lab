/**
 * File: Lab11ONealMorrison.java 
 * Class: CSCI 1302 
 * Author: Taylor O'Neal, Seraphina Morrison 
 * Created on: April 19th, 2024 Last Modified: April 19th,
 * 2024 Description:
 */

public class Lab12Prob03 {
	public static void main(String[] args) {
		String string = "hello";
		System.out.println(reverseString(string));
				
	}
	public static int function(int index) {
		if (index == 0) {
			return 1;
		} else if (index == 1) {
			return 3;
		} else if (index == 2) {
			return 4;
		} else {
			return function(index - 1) * (function(index - 1) - function(index - 2));
		}
	}
	
	public static String reverseString(String string) {
		String newString = "";
		int length = string.length();
		newString = reverseString(string, length);
		return newString;
	}
	
	public static String reverseString(String string, int index) {
		if (index == 1) {
			return string;
		} else {
			return string.charAt(string.length() - 1) + reverseString(string.substring(0, index - 1));
		}
	}
}