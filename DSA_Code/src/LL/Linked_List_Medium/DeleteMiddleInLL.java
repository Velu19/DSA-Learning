package LL.Linked_List_Medium;

//2095. Delete the Middle Node of a Linked List
public class DeleteMiddleInLL {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode deleteMiddle(ListNode head) {

        if(head == null || head.next == null ){
            return null;
        }

        //slow and fast pointers solution.
        ListNode fast = head;
        ListNode slow = head;

        //Go one step to find the mid-1.
        //so that you can remove it easily.
        fast = fast.next.next;

        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}
