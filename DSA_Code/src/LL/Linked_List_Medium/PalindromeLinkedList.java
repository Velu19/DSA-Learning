package LL.Linked_List_Medium;

public class PalindromeLinkedList {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // ListNode reverse(ListNode head){

    //     //base Condition
    //     if(head == null || head.next == null){
    //         return head;
    //     }

    //     ListNode newHead = reverse(head.next);

    //     ListNode front = head.next;
    //     front.next = head;
    //     head.next = null;

    //     return newHead;
    // }


    ListNode reverse(ListNode head){

        ListNode prev = null;
        ListNode temp = head;

        while(temp != null){
            //Store next element here as temp.
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;

    }


    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast =  head;

        //why fast-> next (odd) and fast->next->next (even)
        //in order to reverse the seconf half
        //To get equal split for mid element.
        while(fast.next != null && fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }

        //You got very confused with this reversal actually.
        ListNode newHead = reverse(slow.next);

        slow = head;
        fast = newHead;

        //It is good preactice to reverse the new head before sending again.
        while(fast != null){
            if(slow.val != fast.val){
                return false;
            }

            slow = slow.next;
            fast = fast.next;
        }


        return true;

    }
}
