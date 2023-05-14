/*You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
Return true if you can reach the last index, or false otherwise.

Input Format:
First line of each test case or query contains an integer 'N' representing the size of the first array/list.
Second line contains 'N' single space separated integers representing the elements in the array/list.

Constraints:
1 <= nums.length <= 10^4
0 <= nums[i] <= 10^5

Output Format:
Print true or false */

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        boolean canReachEnd = canJump(nums);
        System.out.println(canReachEnd);
    }

    public static boolean canJump(int[] nums) {
        int maxPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxPos) {
                return false;
            }
            maxPos = Math.max(maxPos, i + nums[i]);
            if (maxPos >= nums.length - 1) {
                return true;
            }
        }
        return true;
    }
}
