/**
 * File: Lab11ONealMorrison.java 
 * Class: CSCI 1302 
 * Author: Taylor O'Neal, Seraphina Morrison 
 * Created on: April 19th, 2024 Last Modified: April 19th,
 * 2024 Description:
 */

public class Lab12Prob02 {
	public static void main(String[] args) {
		System.out.println(function(3));
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
		if (string.length() == 0) {
			return string;
		} else {
			String newString = string.substring(string.length() - 1, string.length());
			return string.charAt(string.length()) + reverseString(newString);
			
		}
	}
}
