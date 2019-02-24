/*
 ASSIGNMENT 2
 Question 2
 Algorithm 3 : LinearSearch
 - Author : @find3r
 */

public class LinearSearch
{
	public static int _LinearSearch(int[] A, int n, int q)
	{
		int index = 0;
		int result = -1;
		while ((index < n) && (A[index] != q))
		{
			index += 1;
			if (index == n)
				result = -1;
			else
				result = index;
		}
		return result;
	}
}