package com.saifur.books.classiccomputerscienceproblemsinjava.chapter1.extendedwork;

public class ByteShift
{

	public static void main(String[] args)
	{
		// value << num 
		int m = 8; // 1 0 0 0 = 8
		int n = 8 << 2; // 1 0 0 0 0 0 = 32
		
		// value >> num 
		int x = n; // 1 0 0 0 0 0 = 32
		int y = n >> 2; // 1 0 0 0 = 8
		
		System.out.println("Left shift: " + n); // 32
		System.out.println("Right shift: " + y); // 8

	}

}
