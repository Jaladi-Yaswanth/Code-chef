// Problem Statement: Fibonacci Series
// Given an integer N, output the N-th term in the Fibonacci Series.
// The Fibonacci Series is defined as: 0, 1, 1, 2, 3, 5, 8, ..., where each term is the sum of the two preceding ones, starting from 0 and 1.
// Link to problem: [CodeChef - Fibonacci Series Problem](https://www.codechef.com/learn/course/recursion/LRECUR01/problems/RECUR05)

// Input Format: A single integer N
// Output Format: Output the N-th term in the Fibonacci Series
// Constraints: 1 <= N <= 100

// Approach:
// - Use dynamic programming instead of recursion for efficient computation.
// - We maintain an array to store computed Fibonacci terms up to N.
// - This avoids repeated calculations, making the solution efficient even for larger values of N.

import java.util.Scanner;

public class Main {
    
    // Function to compute the N-th Fibonacci number using dynamic programming
    static int fib(int n) {
        if (n == 1) return 0;  // First Fibonacci term is 0
        
        // Initialize array to store Fibonacci terms up to N
        int[] dp = new int[n];
        dp[0] = 0; 
        dp[1] = 1; 
        
        
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[n - 1]; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input and read N
        System.out.print("Enter the position N in Fibonacci Series: ");
        int n = scanner.nextInt();
        
        // Output the N-th term in Fibonacci Series
        System.out.println("The " + n + "-th term in the Fibonacci Series is: " + fib(n));
        
        scanner.close();
    }
}
