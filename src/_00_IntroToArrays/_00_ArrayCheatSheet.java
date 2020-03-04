package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] strings = new String[5];
		//2. print the third element in the array
		System.out.println(strings[2]);
		//3. set the third element to a different value
		strings[2] = "ahhhh";
		//4. print the third element again
		System.out.println(strings[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i < 5; i++) {
			strings[i] = "haha";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		//7. make an array of 50 integers
		int[] ints = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		Random randy = new Random();
		for(int i = 0; i < ints.length; i++) {
			int holder = randy.nextInt(1000)+1;
			ints[i] = holder;
		}
		int highestValue = 0;
		int lowestValue = 1000;
		//9. without printing the entire array, print only the smallest number on the array
		for(int i = 0; i < ints.length; i++) {
			if(ints[i] > highestValue) {
				highestValue = ints[i];
			}
			if(ints[i] < lowestValue) {
				lowestValue = ints[i];
			}
		}
		System.out.println(lowestValue);
		System.out.println(highestValue);
		System.out.println(ints[49]);
		for(int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}
		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		
	}
}
