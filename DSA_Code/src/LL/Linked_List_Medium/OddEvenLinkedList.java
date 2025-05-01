package LL.Linked_List_Medium;

public class OddEvenLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        //The most brute for way is using a seperate arraylist.
        //but it is not allowed here. Causing time complexity errors.
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;

        //you get confused with this part be careful.
        //why are taking even and not odd think if it's the same??
        while(even != null && even.next != null){
            //odd.next.next is only possible
            //because we check even.next != null
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
}
