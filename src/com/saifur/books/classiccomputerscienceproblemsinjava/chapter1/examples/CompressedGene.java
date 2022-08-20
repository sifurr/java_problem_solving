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
	
	
	public String decompress()
	{
		if(bitSet == null)
		{
			return "";
		}
		// create a mutable place for characters with the right capacity
		StringBuilder builder = new StringBuilder(length);
		for (int i = 0; i < (length * 2); i += 2) {
			final int firstBit = (bitSet.get(i) ? 1 : 0);
			final int secondBit = (bitSet.get(i + 1) ? 1 : 0);
			final int lastBits = firstBit << 1 | secondBit;
			switch (lastBits) {
			case 0b00: // 00 is 'A'
				builder.append('A');
				break;
			case 0b01: // 01 is 'C'
				builder.append('C');
				break;
			case 0b10: // 10 is 'G'
				builder.append('G');
				break;
			case 0b11: // 11 is 'T'
				builder.append('T');
				break;
			}
		}
		return builder.toString();		
	}
	
	

	public static void main(String[] args)
	{			
		final String original = "TAGGGATTAACCGTTATATATATATAGCCATGGATCGATTATATAGGGATTAACCGTTATATATATATAGCCATGGATCGATTATA";
		CompressedGene compressed = new CompressedGene(original);
		final String decompressed = compressed.decompress();
		System.out.println(decompressed);
		System.out.println("original is the same as decompressed: " + original.equalsIgnoreCase(decompressed));		

	}

}
