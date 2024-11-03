// Finding the Subarray with Minimum Sum of Size K
//"Link" ------------> https://www.codechef.com/practice/course/two-
pointers/SLIDINGWINDO/problems/SLDW0105
// You are given an array of integers and you need to find a subarray of size K that has the minimum sum in all the subarrays of size K.

// Input Format
// The first line contains two integers N and K, representing the size of the array and the size of the subarray, respectively.
// The second line contains N space-separated integers representing the elements of the array.

// Output Format
// Output a single integer representing the minimum sum of a subarray of size K.

// Constraints
// 1 ≤ N ≤ 10^5
// 1 ≤ K ≤ N
// 0 ≤ |A[i]| ≤ 10^9

// Sample 1:
// Input
// 10 3
// 1 2 3 4 5 6 7 8 9 10
// Output
// 6
// Explanation:
// The subarray with the minimum sum of size 3 is [1, 2, 3], and the sum is 6.

// Sample 2:
// Input
// 5 2
// 4 3 2 1 5
// Output
// 3
// Explanation:
// The subarray with the minimum sum of size 2 is [1, 2], and the sum is 3.



import java.util.Scanner;

public class Main {
    public static long findMinSumSubarray(int n, int k, int[] nums) {
        long sum=0;
        for(int i=0;i<k;i++) sum+=nums[i];
        long min=sum;
        for(int i=k;i<n;i++){
            sum-=nums[i-k];
            sum+=nums[i];
            min=Math.min(min,sum);
        }
    return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(findMinSumSubarray(n, k, arr));
    }
}
