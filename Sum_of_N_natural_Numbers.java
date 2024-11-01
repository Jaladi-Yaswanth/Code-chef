// Problem Statement: Sum of N Natural Numbers
// Given an integer N, calculate the sum of the first N natural numbers using recursion.
// Example: Sum(5) = 5 + 4 + 3 + 2 + 1 = 15

//Link --->   https://www.codechef.com/learn/course/recursion/LRECUR01/problems/RECUR02

// Approach:
// - Define a function Sum(N) that recursively calculates the sum of the first N natural numbers.
// - Use the base case Sum(1) = 1 to terminate the recursion.
// - Use the recursive formula Sum(N) = N + Sum(N - 1) to break down the problem.

public class Main {
    public static void main(String[] args) {
        System.out.println("Sum of first 5 natural numbers is " + sum(5));
    }

    static int sum(int n) {
        System.out.println("Sum(" + n + ") is called");
        if (n == 1) {
            System.out.println("Base Condition reached");
            return 1;
        }
        int sumN1 = sum(n - 1);
        System.out.println("Sum(" + n + ") = " + n + " + Sum(" + (n - 1) + ")");
        int sumN = n + sumN1;
        System.out.println("Sum(" + n + ") = " + n + " + " + sumN1);
        System.out.println("Sum(" + n + ") is returning " + sumN);
        return sumN;
    }
}
