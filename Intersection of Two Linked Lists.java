/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

//TC = O(n)
//SC = O(1)
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int count1 = 0, count2 = 0;;
        ListNode temp1 = headA;
        while(temp1 != null)
        {
            count1++;
            temp1 = temp1.next;
        }
        temp1 = headA;
        ListNode temp2 = headB;
        while(temp2 != null)
        {
            count2++;
            temp2 = temp2.next;
        }
        
        temp2 = headB;
        int diff = Math.abs(count1 - count2);
        if(count1 > count2)
        {
            while(diff != 0)
            {
                temp1 = temp1.next;
                diff--;
            }
        }
        else
        {
            while(diff != 0)
            {
                temp2 = temp2.next;
                diff--;
            }
        }

        while(temp1 != null && temp2 != null)
        {
            //if(temp1 == temp2) return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
            
            
        }
        return null;
    }
}
