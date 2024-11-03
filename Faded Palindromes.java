// Problem Statement: Faded Palindromes
//"Link" ----> https://www.codechef.com/problems/LEXOPAL
// Chef found an old string `s` in his garage, containing faded characters represented by '.'.
// Chef wants to turn `s` into a lexicographically smallest palindrome.
// To achieve this, Chef can replace each '.' in `s` with any lowercase Latin letter ('a' - 'z').

// Input:
// - The first line contains an integer `T`, the number of test cases.
// - For each test case, there is one string `s`, which may contain lowercase Latin letters and '.' characters.

// Output:
// - For each test case, print the lexicographically smallest palindrome possible by replacing each '.'.
// - If it is not possible to create a palindrome, output `-1`.

// Constraints:
// - 1 ≤ T ≤ 50
// - 1 ≤ |s| ≤ 12345
// - String `s` consists of lowercase Latin letters ('a'-'z') and '.' only.

// Example:
// Input:
// 3
// a.ba
// cb.bc
// a.b

// Output:
// abba
// cbabc
// -1

// Explanation:
// - In the first test case, replacing '.' with 'b' makes "abba", a palindrome.
// - In the second test case, replacing '.' with 'a' makes "cbabc", a palindrome.
// - In the third test case, it's not possible to make `s` a palindrome, so the output is -1.





import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int no_test = sc.nextInt();
		sc.nextLine(); 

		while(no_test-- > 0){
		    String res = sc.nextLine();
		    int n = res.length();
		    
		    int left = 0, right = n - 1;
		    char[] arr = res.toCharArray();
		    boolean isPalindromePossible = true;

		    while (left <= right) {
		        if (arr[left] == arr[right]) {
		            if (arr[left] == '.') {
		                arr[left] = arr[right] = 'a'; 
		            }
		        } 
		        else if (arr[left] == '.') {
		            arr[left] = arr[right]; 
		        } 
		        else if (arr[right] == '.') {
		            arr[right] = arr[left]; 
		        } 
		        else {
		            isPalindromePossible = false;
		            break;
		        }
		        
		        left++;
		        right--;
		    }
		    
		    if (isPalindromePossible) 
		        System.out.println(new String(arr));
		    else 
		        System.out.println(-1);
		}
		sc.close();
	}
}
