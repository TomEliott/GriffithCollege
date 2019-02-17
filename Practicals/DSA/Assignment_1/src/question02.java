/*
 ASSIGNMENT 1
 Question 02
 @author : Find3r
 */

public class question02 
{
	public static void main(String[] args)
	{
		int arraySize = 8; // My example
		int[] array = new int[arraySize];
		array[0] = 1;
		array[1] = 42;
		array[2] = 0;
		array[3] = 118;
		array[4] = 0;
		array[5] = 0;
		array[6] = 99;
		array[7] = 1;
		// Correct result for this example : 3 zero and 5 non-zero
		int[] result = frequencyArray(array, arraySize, 0, 0);
		System.out.print("In this list, there are :\n"+result[0]+" Zero\n"+result[1]+" non-Zero");
	}
	
	static int process = 0; // To find out where we are in the list
	public static int[] frequencyArray(int[] array, int arraySize, int sum_zero, int sum_nozero)
	{
		if (process == arraySize)
			return new int[] {sum_zero, sum_nozero};
		else
		{
			if (array[process] == 0)
				sum_zero += 1;
			else
				sum_nozero += 1;
			process += 1;
			return frequencyArray(array, arraySize, sum_zero, sum_nozero);
		}
	}
}