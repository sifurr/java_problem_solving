package com.saifur.books.classiccomputerscienceproblemsinjava.chapter1.examples;

import java.util.BitSet;

public class CompressedGene
{
	private BitSet bitSet;
	private int length;
	
	public CompressedGene(String gene)
	{
		compress(gene);
	}
	
	private void compress(String gene)
	{
		length = gene.length(); // find out the string's length
		bitSet = new BitSet(length * 2); // allocate enough memories
		
		// convert the string to upper case for main
		final String upperGene = gene.toUpperCase(); 
		// convert string to bit representation
		for(int i = 0; i < length; i++)
		{
			final int firstLocation = 2 * i;
			final int secondLocation = 2 * i + 1;
			switch(upperGene.charAt(i))
			{
			case 'A': // binary 00 for A
				bitSet.set(firstLocation, false);
				bitSet.set(secondLocation, false);
				break;
			case 'C': // binary 01 for C
				bitSet.set(firstLocation, false);
				bitSet.set(secondLocation, true);
				break;
			case 'G': // binary 10 for G
				bitSet.set(firstLocation, true);
				bitSet.set(secondLocation, true);
				break;
			case 'T': // binary 11 for T
				bitSet.set(firstLocation, true);
				bitSet.set(secondLocation, true);
				break;
			default:
				throw new IllegalArgumentException("The provided gene "
						+ "string contains characters other than ACGT");
			}
		}		
	}
	
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
