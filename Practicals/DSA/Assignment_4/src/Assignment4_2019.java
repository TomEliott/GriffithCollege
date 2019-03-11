/**
 * ASSIGNMENT 4 (DSA / Griffith College)
 * Author : Find3r
 For Assignment 4 please complete the methods listed below for class LinkedListHT. In each case the comment 
 inserted in the method describes its purpose. 
 */
import java.util.*;

public class Assignment4_2019
{
  public static void main(String[] args)
  {
    // My code =============================================
	System.out.println("###################### \n" 
	+ "#### TESTING AREA #### \n" + "###################### \n" + "by Find3r \n");
	
	/* Creates the list */
    LinkedListHT test = new LinkedListHT();
    
    /* Adds/Deletes to the head and the tail */ System.out.print("ADDITIONS AND DELETIONS \n");
    test.addTail(41); System.out.println("Adding 41 (tail)");
    test.addTail(42); System.out.println("Adding 42 (tail)");
    test.addTail(42); System.out.println("Adding 42 (tail)");
    test.addTail(1); System.out.println("Adding 1 (tail)");
    test.addTail(10); System.out.println("Adding 10 (tail)");
    test.addHead(43); System.out.println("Adding 43 (head)");
    test.addHead(1); System.out.println("Adding 1 (head)");
    test.addTail(10); System.out.println("Adding 10 (tail)");
    test.addHead(1); System.out.println("Adding 1 (head)");
    test.addHead(0); System.out.println("Adding 0 (head)");
    test.delHead(); System.out.println("Deleting 0 (head)");
    test.addTail(9); System.out.println("Adding 9 (tail)");
    test.delTail(); System.out.println("Deleting 9 (tail)");
    test.delAll(42); System.out.println("Deleting all 42 values");
    System.out.println("Current list : " + test.toString() + "\n");
    
    /* Search 1000 */ System.out.print("PRESENCE OF A VALUE \n");
    System.out.println("Is 1000 in the list? : " + test.contains(1000));
    System.out.println("Is 10 in the list? : " + test.contains(10) + "\n");
    
    /* Counts the number of values */ System.out.print("NUMBER OF OCCURRENCES \n");
    System.out.println("Number of 1 : " + test.count(1));
    System.out.println("Number of 10 : " + test.count(10) + "\n");
    
    /* Adds 'new_test' to tail of 'test' */ System.out.print("CREATION OF A NEW LIST \n");
    LinkedListHT new_test = new LinkedListHT();
    new_test.addTail(100); System.out.println("Adding 100 (tail)");
    new_test.addHead(142); System.out.println("Adding 142 (head)");
    new_test.addTail(666); System.out.println("Adding 666 (tail)");
    System.out.println("New list : " + new_test.toString());
    test.addTail(new_test);
    System.out.println("Original list (with new list inside): " + test.toString() + "\n");
    
    /* Returns an Array from 'test' */ System.out.println("CREATION OF AN ARRAY");
    int test_arr[] = test.toArray();
    System.out.print("New Array from the list : [");
    for (int i = 0; i < test_arr.length - 1; i++)
    	System.out.print(test_arr[i] + ", ");
    System.out.println(test_arr[test_arr.length-1] + "] \n");
    
    /* Tests the equality between 'test' and a new lists 'test_true' and 'test_false' */
    System.out.print("TESTING EQUALITY BETWEEN SEVERAL LISTS \n");
    LinkedListHT test1 = new LinkedListHT();
    LinkedListHT test2 = new LinkedListHT();
    LinkedListHT test3 = new LinkedListHT();
    // Adds values to 'test1'
    test1.addTail(1);
    test1.addTail(2);
    test1.addTail(3);
    test1.addHead(0);
    // Adds values to 'test2'
    test2.addTail(1);
    test2.addTail(2);
    test2.addTail(3);
    test2.addHead(0);
    // Adds values to 'test1'
    test3.addTail(1);
    test3.addTail(2);
    test3.addTail(4);
    test3.addHead(0);

    System.out.print("List test 1 : " + test1.toString() + "\n");
    System.out.print("List test 2 : " + test2.toString() + "\n");
    System.out.print("List test 3 : " + test3.toString() + "\n");
    System.out.print("Is list 1 equal to list 2? : " + test1.equals(test2) + "\n");
    System.out.print("Is list 1 equal to list 3? : " + test1.equals(test3) + "\n");
    System.out.println("Is list 3 equal to list 2? : " + test3.equals(test2) + "\n");
    
    /* Returns the sum of all values, then sum of even values */ System.out.println("SUM OF ALL VALUES");
    System.out.println("Sum of all values : " + test.sum());
    System.out.println("Sum of even values : " + test.sumEven() + "\n");
    
    /* Returns the size */ System.out.print("SIZE OF THE LIST \n");
    System.out.println("Size of the list : " + test.size() + "\n");
    
    /* Prints the list */
    System.out.println("FINAL LIST    : " + test.toString());
    test.reverse();
    System.out.println("LIST REVERSED : " + test.toString() + "\n");
    // =====================================================
  }
}
class LinkedListHT
{
	private Node head = null;
	private Node tail = null; 
	// empty list
	public void addTail(int x)
	{
		// add at head
		Node nw = new Node(x);
		if(head == null)
		{
			head = nw;
			tail = nw;
		}
		else
		{
			tail.setNext(nw);
			tail = nw;
		}
	}

	public void addHead(int x)
	{
  		// insert x at head of list
		Node h = new Node(x);
		h.setNext(head);
		head = h;
  	}

	public void delTail()
	{
		// remove element at tail of list
		Node k = head;
		while (k != null)
		{
			if (k.next() == null)
				remove(k.data());
			k = k.next();
		}
	}
	
	public int size()
	{
		// return number of nodes in the list
		Node s = head;
		int len = 0;
		while (s != null)
		{
			len += 1;
			s = s.next();
		}
		return len;
	}

	public void delHead()
	{
    	// remove element at head of list
		Node k = head;
		Node k_ = head;
		if (k == head)
			head = k.next();
		else
			k_.setNext(k.next());
	}

	public void delAll(int x)
	{
		// delete all occurrences of x from the list
		Node k = head;
		Node bk = head;
		boolean found = false;
		
		while (k != null && !found)
		{
			if (k.data() == x)
				found = true;
			else
			{
				bk = k;
				k = k.next();
			}
		}
		
		if (found)
		{
			if (k == head)
				head = k.next();
			else
				bk.setNext(k.next());
			delAll(x);
		}
	}

	public int sum()
	{
		// calculate sum of values in the list
		Node s = head;
		int totalSum = 0;
		
		while (s != null)
		{
			totalSum += s.data();
			s = s.next();
		}
		return totalSum;
	}

	public int sumEven()
	{
		// calculate sum of even values in the list
		Node s = head;
		int evenSum = 0;
		
		while (s != null)
		{
			if ((s.data() % 2) == 0)
				evenSum += s.data();
			s = s.next();
		}
		return evenSum;
	}

	public int count(int x)
	{
		// count number of occurrences of x in list
		Node k = head;
		int occ = 0;
		while (k != null)
		{
			if (k.data() == x)
				occ += 1;
			k = k.next();
		}
		return occ;
	}

	public void addTail(LinkedListHT lst)
	{
    	// add given list to tail of existing list
		Node listNew = lst.head;
		while (listNew != null)
		{
			addTail(listNew.data());
			listNew = listNew.next();
		}
	}
	
	public int[] toArray()
	{
		// return int array of list values
		int f[] = new int[this.size()];
		Node k = head;
		int j = 0;
		
		while(k != null)
		{
			f[j] = k.data();
			k = k.next();
			j += 1;
		}
		return f;
	}
	
	public void reverse()
	{
		// reverse the order of the elements in the list
		LinkedListHT reverse_test = new LinkedListHT();
		int listArr[] = toArray();
		// add table values in reverse order
		for (int i = listArr.length - 1; i >= 0; i--)
			reverse_test.addTail(listArr[i]);
		// replace the list with the reversed list
		head = reverse_test.head;
		tail = reverse_test.tail;
	}

	public boolean equals(Object ob)
	{
		// method to test this list with another list for equality
		// Two lists equal if they have the same size and corresponding 
		// values are equal
		LinkedListHT lst = (LinkedListHT)ob;
		Node listNew = lst.head;
		Node listOld = head;
		if (lst.size() != size())
			// Checks the size
			return false;
		else
		{
			// Checks every values
			boolean sameVal = true;
			while (listNew != null && sameVal)
			{
				if (listNew.data() != listOld.data())
					sameVal = false; // Value is different
				else
				{
					listNew = listNew.next();
					listOld = listOld.next();
				}
			}
			return sameVal;
		}
	}

	public boolean contains(int x)
	{
		Node k = head;
		boolean found = false;
		while(k != null && !found)
		{
			if(k.data() == x)
				found = true;
			else
				k = k.next();
		}
		return found;
	}
	
	public void remove(int x)
	{
		Node k = head; Node bk = head;
		boolean found = false;
		while(k != null && !found)
		{
			if(k.data() == x)
				found = true;
			else
			{
				bk = k;
				k = k.next();
			}
		}
		if(found)
		{
			if(k == head)
				head = k.next();
			else if(k == tail)
			{
			   bk.setNext(null);
			   tail = bk;
			}
			else
				bk.setNext(k.next());
		}
	}
	
	public String toString()
	{
		if(head == null)
			return "[]";
		String s = "[";
		Node k = head;
		while(k.next() != null)
		{
			s = s + k.data()+", ";
			k = k.next();
		}
		s = s + k.data()+"]";
		return s;
	}
	
	private class Node
	{
		int data;
		Node next;
		public Node(int x)
		{
			data = x;
			next = null;
		}
		public Node next()
		{
			return next;
		}
		public void setNext(Node p)
		{
			next = p;
		}
		public void set(int x)
		{
			data = x;
		}
		public int data()
		{
			return data;
		}
	}
}