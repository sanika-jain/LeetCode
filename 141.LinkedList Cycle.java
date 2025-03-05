/*Problem Statement:
Given head, the head of a linked list, determine if the linked list has a cycle in it.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
Return true if there is a cycle in the linked list. Otherwise, return false.
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).*/

Solution:
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head,slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
        
    }
}

/*Expalanation:
Initialize two pointers:
  slow starts at head (moves one step at a time).
  fast starts at head (moves two steps at a time).
Traverse the linked list while fast and fast.next are not null:
  Move slow one step forward.
  Move fast two steps forward.
  If slow == fast, a cycle is detected, so return true.
  If the loop exits, return false (no cycle exists).
This uses Floyd’s Cycle Detection Algorithm (Tortoise and Hare Algorithm) with O(n) time complexity and O(1) space complexity.*/ 
