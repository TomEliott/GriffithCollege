/*
 ASSIGNMENT 2
 Question 2
 Algorithm 2 : Power
 - Author : @find3r
 */

public class Power
{
	public static long _Power(int a, int b)
	{
		long pow = 1;
		for (int k = 1; k <= b; k++)
			pow = pow * a;
		return pow;
	}
}