package com.saifur.books.classiccomputerscienceproblemsinjava.chapter1.extendedwork;

/**
 * This class is for demonstrating bitwise logical operators
 * @author mat
 *
 */
public class BitwiseOperation
{

	public static void main(String[] args)
	{
		String[] binary = {
				"0001", "0001","0010","0011","0100","0101","0110","0111",
				"1000", "1001","1010","1011","1100","1101","1110","1111"
		};
		
		int a = 3; // 0+2+1 or 0011 in binary
		int b = 6; // 4+2+0 or 0110 in binary
		
		int c = a | b; // 0011 | 0110 = 0111 = 7
		int d = a & b; // 0011 & 0110 = 0010 = 2
		int e = a ^ b; // 0011 | 0110 = 0101 = 5
		
		// (~0011 & 0110) | (0011 & ~0110) = (1100 & 0110) | (0011 & 1001)
		int f = (~a & b) | (a & ~b); // 0100 | 0001 = 0101 = 5
		int g = ~a & 0x0f; // ~0011 & 1111 = 1100 & 1111 = 1100 = 12
		
		System.out.println("                  a = " + binary[a]);
		System.out.println("                  b = " + binary[b]);
		System.out.println("                a|b = " + binary[c]);
		System.out.println("                a&b = " + binary[d]);
		System.out.println("                a^b = " + binary[e]);
		System.out.println("(~a & b) | (a & ~b) = " + binary[f]);
		System.out.println("          ~a & 0x0f = " + binary[g]);	

	}

}
