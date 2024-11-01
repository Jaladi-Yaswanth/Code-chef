// Given an integer NN, output the NthNth term in the Fibonacci Series.
// The Fibonacci Series is : 0 1 1 2 3 5 8...


// "LINK --->"   https://www.codechef.com/learn/course/recursion/LRECUR01/problems/RECUR05


/*  Problem Statement: Fibonacci Series
Given an integer 
𝑁
N, output the 
𝑁
N-th term in the Fibonacci Series.

The Fibonacci Series is defined as: 0, 1, 1, 2, 3, 5, 8, ..., where each term is the sum of the two preceding ones, starting from 0 and 1.

Input Format
A single line containing a single integer 
𝑁
N.
Output Format
Output the N-th term in the Fibonacci Series.
Constraints
1≤𝑁≤100*/

//Rather than recursion we will be using dynamic programming

//Code :-
import java.util.Scanner;

public class Main {
    static int fib(int n) {
       if(n==1) return 0;
       int[] dp=new int[n];
       dp[0]=0;
       dp[1]=1;
       for(int i=2;i<n;i++){
           dp[i]=dp[i-1]+dp[i-2];
       }
    return dp[n-1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
        scanner.close();
    }
}


