// Problem Statement: Wordle
//"Link" ---->https://www.codechef.com/problems/WORDLE
// Chef invented a modified wordle game.

// There is a hidden word S and a guess word T, both of length 5.

// Chef defines a string M to determine the correctness of the guess word T.

// For each i-th index in the word:
// - If the guess at the i-th index is correct, the i-th character of M is 'G'.
// - If the guess at the i-th index is incorrect, the i-th character of M is 'B'.

// Given the hidden word S and the guess T, determine the string M.

// Input Format:
// - The first line contains an integer T, the number of test cases.
// - For each test case, there are two lines:
//   * The first line contains the string S - the hidden word.
//   * The second line contains the string T - the guess word.

// Output Format:
// - For each test case, print the value of string M.

// Notes:
// - You may print each character of M in either uppercase or lowercase.
//   For example, outputs "BgBgB", "BGBGB", and "bgbgb" are treated as identical.

// Constraints:
// 1 <= T <= 1000
// |S| = |T| = 5
// S, T consist of uppercase English alphabets only.

// Sample 1:
// Input:
// 3
// ABCDE
// EDCBA
// ROUND
// RINGS
// START
// STUNT

// Output:
// BBGBB
// GBBBB
// GGBBB


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int no_test=sc.nextInt();
		sc.nextLine();
		while(no_test-- > 0){
		    String s1=sc.nextLine();
		    String s2=sc.nextLine();
		    String s3="";
		    int i=0;
		    while(i < s1.length()){
		        if(s1.charAt(i)==s2.charAt(i)) s3+='G';
		        else s3+='B';
		        i++;
		    }
		    System.out.println(s3);
		}

	}
}
