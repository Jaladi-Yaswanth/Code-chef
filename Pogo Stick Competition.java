// Pogo Stick Competition
//"Link---->"  https://www.codechef.com/problems/POGOSTCK
// ### Problem statement is also available in Mandarin, Bengali, Hindi, Russian, and Vietnamese.

// Chef is participating in a pogo stick race. There are N squares (numbered 1 through N) in a row.
// Chef can choose a starting square, enter it, and start jumping on his pogo stick.
// From each square s, Chef can only jump forward by a fixed distance K, landing on square s + K.
// If s + K exceeds N, Chef jumps out of bounds, ending his race. Chef cannot stop jumping earlier.

// Each square has a point value, denoted as A[i] for the i-th square.
// Initially, Chef's score is 0. Each time he lands on a square, he gains or loses points equal to A[i].
// Chef aims to maximize his total score by choosing the best starting square and jumping sequence.

// Input:
// - The first line contains an integer T, the number of test cases.
// - For each test case:
//   - The first line contains two space-separated integers N and K.
//   - The second line contains N space-separated integers, representing the values A[1], A[2], ..., A[N].

// Output:
// - For each test case, output a single integer ― the maximum total score Chef can achieve by starting from any square.

// Constraints:
// 1 ≤ T ≤ 1,000       // Maximum number of test cases
// 1 ≤ N ≤ 10^5        // Number of squares in each test case
// 1 ≤ K ≤ 10^5        // Fixed jump distance
// |A[i]| ≤ 10,000     // Absolute value of points on each square A[i]
// Sum of all N across test cases ≤ 10^6

// Subtasks:
// Subtask #1 (30 points): 
// - N ≤ 1,000
// - Sum of N across test cases ≤ 10,000

// Subtask #2 (70 points): Original constraints

// Sample Input:
// 2
// 5 2
// 3 6 4 7 2
// 5 3
// 3 -5 6 3 10

// Sample Output:
// 13
// 10





import java.util.*;
class Codechef{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 
        while (T-- > 0) {
            int N = scanner.nextInt(); 
            int K = scanner.nextInt(); 
            int[] A = new int[N];
            for (int i = 0; i < N; i++) A[i] = scanner.nextInt(); 
            
            int[] dp = new int[N];
            int maxPoints = Integer.MIN_VALUE;
            for (int i = N - 1; i >= 0; i--) {
                dp[i] = A[i];
                if (i + K < N) {
                    dp[i] += dp[i + K];
                }
                maxPoints = Math.max(maxPoints, dp[i]);
            }
            System.out.println(maxPoints); 
        }
    }
}
