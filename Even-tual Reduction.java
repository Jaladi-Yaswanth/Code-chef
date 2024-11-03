// Problem: Even-tual Reduction

// You are given a string S of length N. The task is to determine if it's possible
// to erase the entire string by performing a specific operation multiple times.

// Operation: Choose a non-empty substring of S (or the entire string) in which
// each character occurs an even number of times, and erase this substring from S.

// The string segments before and after the erased substring will concatenate, and
// the operation continues on the shorter string until no characters remain.

// Example: For the string "acabbad", we can erase "abba" (each character appears an
// even number of times in this substring), resulting in "acd".

// Goal: Check if the whole string can be erased using this operation repeatedly.

// Input Format:
// - The first line contains an integer T (1 ≤ T ≤ 200) — the number of test cases.
// - For each test case:
//   - The first line contains an integer N (1 ≤ N ≤ 1,000) — the length of the string.
//   - The second line contains the string S with only lowercase English letters.

// Output Format:
// - For each test case, output "YES" if it's possible to erase the entire string,
//   otherwise output "NO".

// Sample Input:
// 4
// 6
// cabbac
// 7
// acabbad
// 18
// fbedfcbdaebaaceeba
// 21
// yourcrushlovesyouback

// Sample Output:
// YES
// NO
// YES
// NO

// Explanation:
// In case 1, erasing "abba" leaves "cc", which can then also be erased.



import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int no_test=sc.nextInt();
		while(no_test-->0){
		    int size=sc.nextInt();
		    sc.nextLine();
		    String res=sc.nextLine();
		    Map<Character,Integer> mapp= new HashMap<Character,Integer>();
		    for(char c: res.toCharArray()){
		        mapp.put(c,mapp.getOrDefault(c,0)+1);
		    }
		    
		    boolean b=true;
		    for(Map.Entry<Character,Integer> mapp2:mapp.entrySet()){
		        if((mapp2.getValue()%2!=0)) {
		            b=false;
		            break;
		        }
		    }
		    System.out.println(b?"YES":"NO");
		    
		}

	}
}
