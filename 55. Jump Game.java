/*Problem Statement: 
You are given an integer array, nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
Return true if you can reach the last index, or false otherwise.
Example 1:
Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

Constraints:
1 <= nums.length <= 10^4
0 <= nums[i] <= 10^5*/

//Solution:
class Solution {
    public boolean canJump(int[] nums) {
        int maxReach=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxReach) return false;
            maxReach=Math.max(maxReach,i+nums[i]);
            if(i==nums.length-1) return true;

        }
        return false;
    }
    
}

/*Explanation:
This greedy approach works with the complexity of O(N).
Step 1 - Maintain a variable maxReach to calculate the maximum reach of the jump.
Step 2 - Iter over the nums until you reach the end of the array.
Step 3 - If i > maxReach, i.e, we cannot move forward.
Step 4 - Update the farthest reacheable index , Math.max(maxReach,i+nums[i]).*/
