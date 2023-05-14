/* Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Input Format:
First line contains the value of size of your array
Line consists of 'n' space seperated integers representing the values present in the Array
Third line having the K value, how much you want to rotate

Constraints:
1 <= nums.length <= 10^5
-231 <= nums[i] <= 231 - 1
0 <= k <= 10^5

Output Format:
Rotated Array */

//CODE:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ; i++)
        {
            arr[i] = myObj.nextInt();
        }
        int r = myObj.nextInt();
        r = r%n;
        
        int rn = r+n;
        int[] arr2 = new int[rn];
        for(int j=r; j<rn;j++)
        {
            arr2[j] = arr [j-r]; 
        }
        for(int i=0;i<r;i++)
        {
            arr2[i] = arr[n-r+i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d ",arr2[i]);
        }
    }
}
