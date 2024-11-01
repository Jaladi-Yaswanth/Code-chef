//Spoon in matrix
//"Link---->" https://www.codechef.com/problems/SPOON

// give the provided query as top of the code first in java Spoon in Matrix
// Chef recently saw the movie Matrix. He loved the movie overall but he didn't agree with some things in it. Particularly he didn't agree with the bald boy when he declared - There is no spoon. Being a chef, he understands the importance of the spoon and realizes that the universe can't survive without it. Furthermore, he is sure there is a spoon; he saw it in his kitchen this morning. So he has set out to prove the bald boy is wrong and find a spoon in the matrix. He has even obtained a digital map already. Can you help him?

// Formally you're given a matrix of lowercase and uppercase Latin letters. Your job is to find out if the word "Spoon" occurs somewhere in the matrix or not. A word is said to be occurred in the matrix if it is presented in some row from left to right or in some column from top to bottom. Note that match performed has to be case insensitive.

// Input
// The first line of input contains a positive integer T, the number of test cases. After that T test cases follow. The first line of each test case contains two space separated integers R and C, the number of rows and the number of columns of the matrix M respectively. Thereafter R lines follow each containing C characters, the actual digital map itself.
// Output
// For each test case print one line. If a "Spoon" is found in Matrix, output "There is a spoon!" else output "There is indeed no spoon!" (Quotes only for clarity).

// Constraints
// 1 ≤ T ≤ 100

// 1 ≤ R, C ≤ 100

// Sample 1:
// Input
// Output
// 3
// 3 6
// abDefb
// bSpoon
// NIKHil
// 6 6
// aaaaaa
// ssssss
// xuisdP
// oooooo
// ioowoo
// bdylan
// 6 5
// bdfhj
// cacac
// opqrs
// ddddd
// india
// yucky
// There is a spoon!
// There is a spoon!
// There is indeed no spoon!
// Explanation:
// In the first test case, "Spoon" occurs in the second row. In the second test case, "spOon" occurs in the last column.




import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static boolean find_Spoon(String[] arr){
        String req="spoon";
        for(int i=0;i<arr.length;i++){
            if(arr[i].toLowerCase().contains(req)) return true;
        }
        
        for(int i=0;i<arr[0].length();i++){
            String res="";
            for(int j=0;j<arr.length;j++){
                res+=arr[j].charAt(i);
            }
            if(res.toLowerCase().contains(req)) return true;
        }
    return false;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int no_test=sc.nextInt();
		for(int i=0;i<no_test;i++){
		    int row=sc.nextInt();
		    int col=sc.nextInt();
		    sc.nextLine();
		    String[] arr= new String[row];
		    
		    for(int j=0;j<row;j++){
		        arr[j]=sc.nextLine();
		    }
		    
		    if(find_Spoon(arr)){
		        System.out.println("There is a spoon!");
		    }
		    else System.out.println("There is indeed no spoon!");
		}

	}
}
