/*Problem Statement:
You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:0 <= j <= nums[i] and i + j < n
Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].
Example 1:
Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
Constraints:
1 <= nums.length <= 10^4
0 <= nums[i] <= 1000
It's guaranteed that you can reach nums[n - 1].*/

//Solution:
class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;

        int jumps = 0, currentEnd = 0, maxReach = 0;

        for (int i = 0; i < n - 1; i++) {
            maxReach = Math.max(maxReach, i + nums[i]); 

            if (i == currentEnd) { 
                jumps++;
                currentEnd = maxReach; 
                
                if (currentEnd >= n - 1) break; 
            }
        }

        return jumps;
    }
}

/*Explanation:
Edge case: If nums.length == 1, return 0 (already at last index).
Initialize variables:
  jumps = 0 → Tracks the number of jumps.
  currentEnd = 0 → Marks the farthest index reachable in the current jump.
  maxReach = 0 → Tracks the farthest index reachable at any point.
Iterate through the array (except the last index):
  Update maxReach with the farthest index that can be reached.
  If i == currentEnd (we've used all steps in the current jump):
  Increment jumps.
  Update currentEnd to maxReach.*/
If currentEnd >= n - 1, break (last index is reachable).
Return total jumps needed.

