/*Problem Statement: 
You are given the heads of two sorted linked lists list1 and list2. Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]*/

//Solution:
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode nn = new ListNode(); //node
        ListNode head=nn;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                head.next=list1;
                list1=list1.next;
            }
            else{
                head.next=list2;
                list2=list2.next;
            }
            head=head.next;
        }
        if(list1!=null){
            head.next=list1;
        }
        if(list2!=null){
            head.next=list2;
        }
        return nn.next; 
    }
}

/*Expalanation:
Initialize a dummy node (nn) to simplify handling the head of the merged list.
Use head as a pointer starting from nn, which helps traverse and build the merged list.
Iterate through both lists (list1 and list2) while neither is null:
  Compare the current nodes' values.
  Append the smaller node to head.next and move the corresponding list forward.
  Move head to the next position.
Attach any remaining nodes from list1 or list2 (whichever is not null).
Return nn.next, as nn itself is just a placeholder.*/
