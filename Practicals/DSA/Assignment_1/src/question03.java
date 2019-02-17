/*
 ASSIGNMENT 1
 Question 03
 @author : Find3r
 */

public class question03
{
	public static void main(String[] args)
	{
		int value_test = 11; // My example
		// Correct result for this example : 1011
		System.out.print("The binary equivalent of "+value_test+" is "+intTobin(value_test));
	}
	
	public static String intTobin(int val)
	{
		// Use the mathematical algorithm for converting a base 10 to a base 2
		String result = "";
		int bit;
		int quo;
		
		while (val > 0)
		{
			bit = val%2;
			quo = val/2;
			result = bit + result;
			val = quo;
		}
		return result;
	}
}