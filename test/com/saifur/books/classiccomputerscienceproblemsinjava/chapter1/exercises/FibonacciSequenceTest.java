package com.saifur.books.classiccomputerscienceproblemsinjava.chapter1.exercises;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class FibonacciSequenceTest
{

	@Test
	public void testFibOnNthNumber()
	{
		Assert.assertEquals(102334155, FibonacciSequence.fibonacci(40));
	}
}
