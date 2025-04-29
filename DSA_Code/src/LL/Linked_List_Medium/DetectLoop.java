package LL.Linked_List_Medium;

public class DetectLoop {

    class ListNode {
      int val;
        ListNode next;
        ListNode(int x) {
          val = x;
          next = null;
      }
    }

    //Brute for method has hashmap solution
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null &&  fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }
}
