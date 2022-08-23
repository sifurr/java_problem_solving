package com.saifur.books.classiccomputerscienceproblemsinjava.chapter1.exercises;

import java.util.Scanner;

/**
 * The value of the first Fibonacci number in the sequence is 0.
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
 * @author Saifur Rahman
 * @version 23rd August 2022
 */
public class FibonacciSequence
{
	
	/**
	 * This method defines the nth Fibonacci number.
	 * Precondition: N has to be a positive integer
	 * @param n It requires an integer
	 * @return  Returns an integer of the Fibonacci number
	 */
	public static int fibonacci(int n)
	{
		int prev = 0;
		int next = 1;
		int nthFibNumber = 0;
		if(n == 0 || n == 1)
		{
			return 1;
		}
		else
		{
			for(int i = 2; i <= n; i++)
			{
				nthFibNumber = prev + next;
				prev = next; 
				next = nthFibNumber; 
			}
		}		
		
		return nthFibNumber;
	} // end fibonacci()
	

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		System.out.println("Fibonacci number of "+ n + " is: " + fibonacci(n));
	}

}
