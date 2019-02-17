import java.util.Scanner;
/*
 ASSIGNMENT 1
 Question 01
 @author : Find3r
 */

public class question01
{
	static int sent = -1;
	static boolean isFirst = false;
	public static void main(String[] args)
	{
		String input = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21"; // My example
		// Correct result for this example : 3 6 9 12 15 18 21
		Scanner in = new Scanner(input+" "+sent);
		System.out.print("Tested list : " + input + "\n");
		multipleThree(in);
		in.close();
	}
	
	public static void multipleThree(Scanner in)
	{
		int next = in.nextInt();
		if (sent != next)
		{
			if (next % 3 == 0)
			{
				System.out.print("\n");
				if (isFirst == false)
					System.out.print("Multiples of 3 in this list are :\n");
					isFirst = true;
				System.out.print(next);
			}
			multipleThree(in);
		}
	}
}