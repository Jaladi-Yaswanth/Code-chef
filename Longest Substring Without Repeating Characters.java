// Longest Substring Without Repeating Characters
//"Link" ----> https://www.codechef.com/practice/course/two-
pointers/SLIDINGWINDO/problems/SLDW0103
// Given a string S of length N, find the length of the longest substring of S with non-repeating characters.
// A substring is defined as a sequence where no character appears more than once.

// To solve this problem, we can use the sliding window technique:
// - Use a hash array to keep track of the frequency of characters in the current window.
// - Expand the window by adding characters until a character's frequency becomes 2 (indicating a duplicate).
// - Once a duplicate is found, start shrinking the window from the left 
//   until each character within the window has a frequency of 1 again.

// Input Format:
// - The input consists of a single string S.

// Output Format:
// - Output the length of the longest substring with no repeating characters.

// Constraints:
// - 2 ≤ N ≤ 10^5

// Example 1:
// Input:
// abcabcbb
// Output:
// 3
// Explanation:
// The answer is "abc" with length 3.

// Example 2:
// Input:
// bbbb
// Output:
// 1

// Example 3:
// Input:
// abcccdefg
// Output:
// 5
// Explanation:
// The answer is "cdefg" with length 5.



import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String res= sc.nextLine();
		int max=0,left=0;
		Map<Character,Integer> mapp= new HashMap<Character,Integer>();
		for(int i=0;i<res.length();i++){
		    char c=res.charAt(i);
		    if(mapp.containsKey(c)){
		        left=Math.max(mapp.get(c)+1,left);
		    }
		    mapp.put(c,i);
		    max=Math.max(max,i-left+1);
		}
		System.out.println(max);

	}
}
