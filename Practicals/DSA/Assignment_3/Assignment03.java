import java.util.Arrays;

/**
 * @(#)Assignment03.java
 *
 *
 * @Find3r
 * @version 1.00
 */

public class Assignment03 {

	public static void main(String[]args)
	{
		Assignment03 a3 = new Assignment03();

	    //System.out.print("Before: ");		printArray(arr);
     	a3.testSpeed(10);
	    //System.out.print("After: ");		printArray(arr);

		//printArray(arr);
     	a3.testSpeed(64);
		//System.out.print("After: ");		printArray(arr);

		//printArray(arr);
     	a3.testSpeed(65);
		//System.out.print("After: ");		printArray(arr);

		//printArray(arr);
     	a3.testSpeed(100);
		//System.out.print("After: ");		printArray(arr);

		//printArray(arr);
     	a3.testSpeed(5000);
		//System.out.print("After: ");		printArray(arr);
	}

	void testSpeed(int size)
	{
		double[] arr = createArray(size);
		//printArray(arr); //my test
		long start = System.nanoTime();
		mergeInsertSort(arr,0,arr.length);
		long end = System.nanoTime();
		long timeToRun = end-start;
		System.out.println("Time in nanseconds for array size "+size+": "+timeToRun);
		//printArray(arr); //my test

		checkSort(arr); // If array is not sorted it will print an error
		//if (arr.length<102)	printArray(arr);
	}

	public double[] createArray(int numElements)
	{
		double[] myArray = new double[numElements];
	    for(int i=0;i<numElements;i++){
		    myArray[i] = Math.random()*100;
		}
		return myArray;
	}

	public double[] checkSort(double[] arr)
	{
	    for(int i=0; i<arr.length-1; i++){
		    if (arr[i] > arr[i+1])
		    {
		    	/*for(int j=0; j<arr.length; j++){
		    		if (j==i)System.out.print("###");
		    		if (j==i+2)System.out.print("###");
		    		System.out.print(arr[j] + " ");
		    	}*/
		    	System.out.println();
		    	System.out.println();
		    	System.out.printf("!!!!! Array is not sorted, value at index %d is bigger than the next value\n", i);
		    	System.out.println();
		    	break;
		    }
		}
		return arr;
	}

	public void printArray(double[] myArray)
	{
		for(int j=0;j<myArray.length;j++){
			System.out.print(myArray[j]+" ");
		}
		System.out.println();
	}
	
	public void mergeInsertSort(double[] arr, int lb, int ub)
	{
		
		if ((ub - lb) <= 100)
			// Size where we use insertion sort
			insertSort(arr, lb, ub);
		else
		{
			// Size where we use merge sort
			int mid = (lb + ub)/2;
			
			mergeInsertSort(arr, lb, mid);
			mergeInsertSort(arr, mid, ub);
			
			// Final merge
			merge(arr, lb, mid, ub);
		}
	}

	public void merge(double[] arr, int lo, int mid, int hi)
	{
		int i = lo;
		int j = mid;
		// Use 'temp_arr' array to store merged sub-sequence
		double temp_arr[] = new double[hi - lo];
		int t = 0;
		while ((i < mid) && (j < hi))
		{
			if (arr[i] <= arr[j])
			{
				temp_arr[t] = arr[i];
				i++;
				t++;
			}
			else
			{
				temp_arr[t] = arr[j];
				j++;
				t++;
			}
		}
		// Tag on remaining sequence
		while (i < mid)
		{
			temp_arr[t] = arr[i];
			i++;
			t++;
		}
		while (j < hi)
		{
			temp_arr[t] = arr[j];
			j++;
			t++;
		}
		// Copy 'temp_arr' back to 'arr'
		i = lo;
		t = 0;
		while (t < temp_arr.length)
		{
			arr[i] = temp_arr[t];
			i++;
			t++;
		}
	}

	public void insertSort(double[] arr, int start, int end)
	{
		int j = 1;
		// Set the maximum limit
		while (j < end)
		{
			int i = j;
			// Set the minimum limit
			while (i > start && arr[i] < arr[i - 1])
			{
				double temp = arr[i];
				arr[i] = arr[i - 1];
				arr[i - 1] = temp;
				i -= 1;
			}
			j += 1;
		}
	}
}