/*
 ASSIGNMENT 2
 Question 2
 Algorithm 1 : Factorial
 - Author : @find3r
 */

public class Factorial
{
	public static long _Factorial(long a)
	{
		long fact = 1;
		for (long i = 1; i <= a; i++)
			fact = fact * i;
		return fact;
	}
}