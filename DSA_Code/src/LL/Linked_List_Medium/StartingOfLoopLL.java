package LL.Linked_List_Medium;

public class StartingOfLoopLL {

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }

    //read mathematical intuition in tablet.
    public ListNode detectCycle(ListNode head) {

        //you forgot this condition.
        if(head ==null || head.next == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        boolean loop = false;

        //You made a mistake here idiot. in the and condition.
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                loop = true;
                break;
            }
        }

        if(loop){
            slow = head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }

            return slow;
        }



        return null;
    }
}


