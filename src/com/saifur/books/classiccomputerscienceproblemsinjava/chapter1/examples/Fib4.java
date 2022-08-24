package com.saifur.books.classiccomputerscienceproblemsinjava.chapter1.examples;

/**
 * Determining Fibonacci number using loop
 * @author 
 * @version 19th August 2022
 */
public class Fib4
{
	private static int fib4(int n)
	{
		int last = 0;
		int next = 1;
		for(int i = 0; i < n; i++)
		{
			int oldLast = last;
			last = next;
			next = next + oldLast;			
		}
		return last;
	}

	public static void main(String[] args)
	{
		System.out.println(fib4(1)); // 55
		System.out.println(fib4(10)); // 102334155

	}

}
