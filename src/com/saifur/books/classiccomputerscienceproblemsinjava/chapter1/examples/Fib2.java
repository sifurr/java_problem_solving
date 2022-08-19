package com.saifur.books.classiccomputerscienceproblemsinjava.chapter1.examples;

public class Fib2
{
	/**
	 * This static method uses recursion, this version
	 * will not throw any error because the usage of base cases.
	 * @param n it requires an integer as the i-th position
	 * of a fibonacci number.
	 * @return It returns the value of a fibonacci number based on the position
	 */
	private static int fib2(int n)
	{
		if(n < 2) // when n is less than 2 the method will stop here 
		{
			return n; 
		}

		return fib2(n - 1) + fib2(n - 2);
	}

	public static void main(String[] args)
	{
		System.out.println(fib2(8)); // this will cause an error

	}

}
