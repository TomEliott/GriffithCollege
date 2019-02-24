/*
 ASSIGNMENT 2
 Question 2
 Main test Class
 - Author : @find3r
 */

public class Main_test
{
	public static void main(String[] args)
	{
		Factorial fact = new Factorial();
		Power power = new Power();
		LinearSearch linearsearch = new LinearSearch();
		
		/* TESTS FOR PART 2 */
		// TEST FOR FACTORIAL FUNCTION
		System.out.print("Part 2 : Factorial Function \n");
		Fact_test(fact);
		System.out.print("\n");
		
		// TEST FOR POWER FUNCTION
		System.out.print("Part 2 : Power Function \n");
		Power_test(power);
		System.out.print("\n");
		
		// TEST FOR LINEAR SEARCH FUNCTION
		System.out.print("Part 2 : LinearSearch Function \n");
		LinearSearch_test(linearsearch);
		System.out.print("\n");
		
		/* TESTS FOR PART 3 */
		Part3_tests();
	}
	
	public static void Part3_tests()
	{
		long start_time = 0;
		long end_time = 0;
		long final_time = 0;
		
		System.out.println("Part 3: Factorial Tests\n");
		for (int t = 0; t < 5000; t++) // Factorial
		{
			start_time = System.nanoTime();
			Factorial._Factorial(t);
			end_time = System.nanoTime();
			final_time = end_time - start_time;
			System.out.println("Execution time for Factorial : "+final_time+" ns");
		}
		
		System.out.println("Part 3: Power Tests\n");
		for (int p = 0; p < 5000; p++) // Power
		{
			start_time = System.nanoTime();
			Power._Power(2, p);
			end_time = System.nanoTime();
			final_time = end_time - start_time;
			System.out.println("Execution time for Power : "+final_time+" ns");
		}
		
		System.out.println("Part 3: LinearSearch Tests\n");
		for (int ls = 0; ls < 5000; ls++) // LinearSearch
		{
			// Move the value 42 at the end of the array each time to go through the entire array
			// For the tests, I averaged the best and worst case.
			int[] array_part3 = new int[ls+1];
			array_part3[ls] = 42;
			start_time = System.nanoTime();
			LinearSearch._LinearSearch(array_part3, ls, 42);
			end_time = System.nanoTime();
			final_time = end_time - start_time;
			System.out.println("Execution time for LinearSearch : "+final_time+" ns");
		}
	}
	
	public static void Fact_test(Factorial fact)
	{
		int arraySize = 20; // My example
		long[] test_array = new long[arraySize];
		for (int value_test = 0; value_test < arraySize; value_test++)
		{
			test_array[value_test] = value_test;
			System.out.print("Fact("+ value_test +") = "+ Factorial._Factorial(value_test)+"\n");
		}
		
		/*
		The result of my example :
		_Fact(0) = 1
		_Fact(1) = 1
		_Fact(2) = 2
		_Fact(3) = 6
		_Fact(4) = 24
		_Fact(5) = 120
		_Fact(6) = 720
		_Fact(7) = 5040
		_Fact(8) = 40320
		_Fact(9) = 362880
		_Fact(10) = 3628800
		_Fact(11) = 39916800
		_Fact(12) = 479001600
		_Fact(13) = 6227020800
		_Fact(14) = 87178291200
		_Fact(15) = 1307674368000
		_Fact(16) = 20922789888000
		_Fact(17) = 355687428096000
		_Fact(18) = 6402373705728000
		_Fact(19) = 121645100408832000
		*/
	}

	public static void Power_test(Power power)
	{
		// My example
		int a = 42;
		int b = 3;
		System.out.print(a+"^"+b + " = "+ Power._Power(a, b)+"\n");
		// Result of the example : 42^3 = 74088
	}
	
	public static void LinearSearch_test(LinearSearch linearsearch)
	{
		int arraySize = 8; // My example
		int[] array = new int[arraySize];
		array[0] = 1;
		array[1] = 3;
		array[2] = 18;
		array[3] = 118;
		array[4] = 42;
		array[5] = 24;
		array[6] = 99;
		array[7] = 1;
		System.out.print(LinearSearch._LinearSearch(array, arraySize, 42));
		// The result is : 4
	}

}