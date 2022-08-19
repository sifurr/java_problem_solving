package com.saifur.books.classiccomputerscienceproblemsinjava.chapter1.examples;

import java.util.HashMap;
import java.util.Map;

/**
 * To increase the performance, Meoization is used.
 * In this technique calculated result has been stored 
 * first using an HashMap so that same thing doesn't need to do again.
 * 
 * @version 19th August 2022
 */
public class Fib3
{
	private static Map<Integer, Integer> memo = new HashMap<>(Map.of(0, 0, 1, 1)); // map 0 to 0 and 1 to 1
	
	private static int fib3(int n)
	{
		if(!memo.containsKey(n)) // if the fibonacci number is not in the memo
		{
			memo.put(n, fib3(n - 1) + fib3(n - 2)); // calculate and put the result in the memo
		}
		
		return memo.get(n);
	}
	

	public static void main(String[] args)
	{
		System.out.println(fib3(10)); // 55
		System.out.println(fib3(40)); // 102334155

	}

}
