package LL.Linked_List_Medium;

//19. Remove Nth Node From End of List
public class RemoveNthNodeFromback {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode fast = head;

        while(fast!=null){
            count++;
            //why n+1 think about it
            if(count == n+1){
                break;
            }
            fast = fast.next;
        }

        if(fast == null){
            return head.next;
        }

        ListNode slow = head;

        while(fast.next !=null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;

    }
}
