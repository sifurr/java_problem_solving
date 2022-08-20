package com.saifur.books.classiccomputerscienceproblemsinjava.chapter1.examples;

import java.util.Random;

public class UnbreakableEncryption
{
	// Generate random bytes
	private static byte[] randomKey(int length)
	{
		byte[] dummy = new byte[length];
		Random random = new Random();
		random.nextBytes(dummy);
		
		return dummy;
	}
}
