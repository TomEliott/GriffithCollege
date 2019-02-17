/*
 ASSIGNMENT 1
 Question 04
 @author : Find3r
 */

public class question04
{
	public static void main(String[] args)
	{
		int number_of_val = 10; // My example
		// Correct result for 10 : 1 1 2 3 5 8 13 21 34 55 89
		
		int size = number_of_val + 1;
		int final_array[] = new int[size];
		fibSequence(number_of_val, size, final_array);
		printArray(size, final_array);
	}

	public static void printArray(int size, int f[]) // Displays the array
	{
		System.out.print("The Fibonacci sequence up to "+(size-1)+" is : ");
		for (int i = 0; i < size; i++)
			System.out.print(f[i] + " ");
	}

	public static void fibSequence(int i, int n, int f[])
	{
		if (n >= 1) // Initial values of the table if correct size
		{
			f[0] = 1;
			f[1] = 1;
		}
		int temp_val = _fibSequence(i, f);
		if (temp_val < 0)
			System.out.print("Impossible");
	}
	
	public static int _fibSequence(int i, int f[])
	{
		// Calculates and stores in the array
		// Returns last value to check (internal test)
		int last_value = 0;
		if (i == 0 || i == 1) // Initial case
			return 1;
		else if (f[i] != 0) // Secure case
			return f[i];
		else // General case
		{
			last_value = (_fibSequence((i-1), f) + _fibSequence((i-2), f));
			f[i] = last_value;
			return last_value;
		}
	}
}