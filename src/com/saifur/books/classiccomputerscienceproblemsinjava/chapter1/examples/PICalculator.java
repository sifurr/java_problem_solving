package com.saifur.books.classiccomputerscienceproblemsinjava.chapter1.examples;

/**
 * This class is used to calculate the PI
 * using Leibniz formula.
 * @version 21th August 2022
 */
public class PICalculator
{
	/**
	 * Method to calculate the pi for the given nterm
	 * @param nTerms requires an integer
	 * @return Returns the pi for the given nterm
	 */
	public static double calculatePi(int nTerms)
	{
		final double numerator = 4.0;
		double denominator = 1.0;
		double operation = 1.0;
		double pi = 0.0;
		for(int i = 0; i < nTerms; i++)
		{
			pi += operation * (numerator / denominator);
			denominator += 2.0;
			operation *= -1.0;
		}
		return pi;
	} // end calculatorPi()	

	public static void main(String[] args)
	{
		System.out.println(calculatePi(1000000));

	}

}
