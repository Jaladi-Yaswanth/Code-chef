// Card Swipe Problem

// "Link ---->" https://www.codechef.com/problems/CARDSWIPE

// Problem Statement:
// In the bustling CodeChef office, the entrance is equipped with a high-tech card swipe system.
// Each employee is assigned a unique ID card that they use to swipe in and out of the building.

// The system records every swipe, capturing the first swipe of an ID as "in," the second as "out,"
// the third as "in," and so on. Given an array `A` consisting of `N` IDs denoting `N` swipes throughout
// the day, find the maximum number of people in the office at any time.

// Note: There is nobody inside the office before the first swipe.

// Input Format:
// - The first line of input will contain a single integer `T`, denoting the number of test cases.
// - Each test case consists of multiple lines of input.
// - The first line of each test case contains an integer `N` — the number of swipes throughout the day.
// - The next line contains `N` space-separated integers denoting the ID of each swipe.

// Output Format:
// - For each test case, output on a new line the maximum number of people in the office at any time.

// Constraints:
// - 1 ≤ T ≤ 2⋅10^5 (Number of test cases)
// - 2 ≤ N ≤ 10^5 (Number of swipes per test case)
// - 1 ≤ A[i] ≤ N (Employee ID in each swipe)
// - The sum of `N` over all test cases will not exceed 10^6.

// Sample Input:
// 4
// 4
// 1 2 2 1
// 4
// 1 1 1 2
// 5
// 3 5 2 4 1
// 5
// 1 2 1 5 4

// Sample Output:
// 2
// 2
// 5
// 3

// Explanation:
// Test case 1: The maximum number of people in the office at any time is 2.
// Test case 2: The maximum number of people in the office at any time is 2.
// Test case 3: All five people swipe and enter, so the maximum is 5.
// Test case 4: The maximum number of people in the office at any time is 3.




import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int people(int[] arr){
    //     List<Integer> list=new ArrayList<Integer>();
    //     int max=0;
    //     for(int num: arr){
            
    //         if(list.contains(num)){
    //             list.remove(Integer.valueOf(num));
    //         }
    //         else list.add(num);
    //         max=Math.max(max,list.size());
    //     }
    // return max;
    
     Set<Integer> set = new HashSet<>();
        int max = 0;

        for (int num : arr) {
            if (set.contains(num)) {
                set.remove(num); 
            } else {
                set.add(num);  
            }
            max = Math.max(max, set.size());  
        }
        return max;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int no_test=sc.nextInt();
		
		for(int i=0;i<no_test;i++){
		    int size=sc.nextInt();
		    int[] arr= new int[size];
		    for(int j=0;j<size;j++){
		        arr[j]=sc.nextInt();
		    }
		    
		    int res=people(arr);
		    System.out.println(res);
		}
	}
}
