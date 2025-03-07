/*Problem Statement:
Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
Return the decimal value of the number in the linked list.
The most significant bit is at the head of the linked list.*/

class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder str =new StringBuilder();
        while(head!=null){
            str.append(head.val);
            head=head.next;
        }
        int dec_num = 0;
        int power = 0;
        int n = str.length();

        for (int i = n - 1; i >= 0; i--) {
            if (str.charAt(i) == '1') {
                dec_num += (int) Math.pow(2, power);
            }
            power++;
        }
        return dec_num;
    }
}
