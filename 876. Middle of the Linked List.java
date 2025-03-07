/*Problem statement:
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.*/

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode i=head;
        ListNode j=head;
        while(j!=null && j.next!=null){
            i=i.next;
            j=j.next.next;
        }
        return i;
    }
}
