package com.saifur.books.classiccomputerscienceproblemsinjava.chapter1.examples;

public class Fib1
{
	/**
	 * This static method uses recursion, it will cause an error 
	 * because it doesn't have any base case.
	 * @param n it requires an integer as the i-th position
	 * of a fibonacci number.
	 */
	private static int fib1(int n)
	{
		return fib1(n-1) + fib1(n-2);
	}

	public static void main(String[] args)
	{
		System.out.println(fib1(4)); // this will cause an error

	}

}
