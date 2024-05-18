package RecursionPackage;

import java.util.Scanner;

//recursive method
public class Addition {

	public static int sumMethod(int[] numbersArray, int count) {
		
		//base case
		 if (count == 0) {
	         return numbersArray[0];
		 }
	          return numbersArray[count] + sumMethod(numbersArray, count - 1);
	   
	}
	
	public static void main(String[] args) {
		int numbersSum; //variable to hold the sum
		int[] numbers = new int[5]; //array to hold user input
		Scanner scnr = new Scanner(System.in);
		
		//prompt user to enter 5 numbers
		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			numbers[i] = scnr.nextInt();
		}
		//recursive method call
		numbersSum = sumMethod(numbers, (5-1));
		
		//print sum to console
		System.out.print("Sum is: " + numbersSum);
		
		scnr.close();
	}

}
