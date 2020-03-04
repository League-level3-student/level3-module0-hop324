package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String [] args) {
		String[] booga = new String[9];
		booga[0] = "h";
		booga[1] = "a";
		booga[2] = "m";
		booga[3] = "b";
		booga[4] = "u";
		booga[5] = "r";
		booga[6] = "g";
		booga[7] = "e";
		booga[8] = "r";
		printStringArray(booga);
		reverseStringArray(booga);
		randomStringArray(booga);
		
	}
	
	
	static //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void printStringArray(String[] strings) {
		for(int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}
	
	static void reverseStringArray(String[] strings) {
		for(int i = strings.length; i > 0; i--) {
			System.out.println(strings[i-1]);
		}
	}
	
	static void randomStringArray(String[] strings) {
		Random randy = new Random();
		for(int i = strings.length; i > 0; i--) {
			int decider = randy.nextInt(strings.length);
			System.out.println(strings[decider]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	
}
