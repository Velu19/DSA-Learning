package LL.Linked_List_Medium;

public class AddTwoNumbers {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    //easy solution just need to see the while loop for better understanding.
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode dummyHead= dummy;
        ListNode temp1 = l1;
        ListNode temp2 = l2;

        int carry = 0;

        //see this full loop again for better understanding.
        while( temp1 != null || temp2 != null ){
            int sum = carry ;
            if(temp1 != null){
                sum+=temp1.val;
            }
            if(temp2 != null){
                sum+=temp2.val;
            }
            carry = sum / 10;
            ListNode newNode = new ListNode(sum%10);
            dummy.next = newNode;
            dummy = dummy.next;

            if(temp1 != null){
                temp1 = temp1.next;
            }
            if(temp2 != null){
                temp2 = temp2.next;
            }
        }

        if(carry!=0){
            ListNode newNode = new ListNode(carry);
            dummy.next = newNode;
            dummy = dummy.next;
        }

        return dummyHead.next;

    }

}
