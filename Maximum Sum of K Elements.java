// Maximum Sum of K Elements
// "Link" ------> https://www.codechef.com/practice/course/two
pointers/SLIDINGWINDO/problems/SLDW0102
// You are given an array A containing N elements and an integer K. 
// Your task is to find the maximum sum of any subarray of length K and output this maximum sum.

// This problem can be efficiently solved using the sliding window technique.
// With this approach, we calculate the sum of the first K elements as the starting window sum.
// Then, to find the next window's sum, we simply subtract the first element of the current window 
// and add the next element from the array. This allows us to move the window forward with O(1) operations.

// Input Format:
// The first line of input contains two integers, N (length of the array A) and K (length of the subarray).
// The second line contains N space-separated integers representing the array A.

// Output Format:
// Output a single integer, the maximum sum of any K-length subarray.

// Constraints:
// 2 ≤ N ≤ 10^5
// 1 ≤ A[i] ≤ 10^9

// Example:
// Input:
// 10 3
// 9 8 2 4 1 9 9 5 1 8
// Output:
// 23

// Explanation:
// The subarray {9, 9, 5} has the maximum sum, which is 23.


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc = new Scanner(System.in);
	   int size=sc.nextInt();
	   int k=sc.nextInt();
	   int[] nums= new int[size];
	   sc.nextLine();
	   for(int i=0;i<size;i++) nums[i]=sc.nextInt();
	   int sum=0;
	   for(int i=0;i<k;i++) sum+=nums[i];
	   int max=sum;
	   
	   for(int i=k;i<size;i++){
	       sum-=nums[i-k];
	       sum+=nums[i];
	       max=Math.max(max,sum);
	   }
	   System.out.println(max);

	}
}

