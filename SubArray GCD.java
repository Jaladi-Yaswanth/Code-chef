 /*
    Problem Statement:
    Given an array A1, A2, ..., AN, print the size of the largest contiguous subarray 
    such that the GCD of all integers in that subarray is 1.

    Formal Requirement:
    A subarray A[i], A[i+1], ..., A[j] (where 1 ≤ i < j ≤ N) is valid if:
      GCD(A[i], A[i+1], ..., A[j]) = 1
    
    Goal:
    Print the size of the largest valid subarray. If no valid subarray exists, output -1.
    
    Note:
    - A single element is NOT considered a subarray in this problem.

    Constraints:
    - 1 ≤ T ≤ 10          — Number of test cases
    - 2 ≤ N ≤ 10^5        — Size of each array
    - 1 ≤ A[i] ≤ 10^5     — Array elements

    Example:
    Input:
    2
    2
    7 2
    3
    2 2 4

    Output:
    2
    -1   */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    public static int gcd(int a,int b){
        while(a!=b){
            if(a>b) a-=b;
            else b-=a;
        }
    return b;
    }
    
    
    static int gcdArray(int[] arr, int n) {
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            result = gcd(result, arr[i]);
            if (result == 1) {
                // If GCD becomes 1 at any point, we can stop
                return 1;
            }
        }
        return result;
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int no_test=sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
	    for(int i=0;i<no_test;i++){
	        int size= sc.nextInt();
	        int[] arr= new int[size];
	        
	        for(int j=0;j<size;j++){
	            arr[j]=sc.nextInt();
	        }
	        
	        //Find gcd of current Array
	        int gcd_arr=gcdArray(arr,size);
	        if(gcd_arr==1) sb.append(size).append("\n");
	        else sb.append(-1).append("\n");
	    }
	    System.out.println(sb.toString());

	}
}
