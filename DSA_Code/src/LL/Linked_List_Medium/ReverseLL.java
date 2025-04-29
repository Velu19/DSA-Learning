package LL.Linked_List_Medium;

public class ReverseLL {


      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


     public ListNode reverseListIterative(ListNode head) {

         //The most brute force is using a stack and then filling it out and popping.

         //Iterative method.
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

    //Recursive method.
    public ListNode reverseList(ListNode head) {

        //The most brute force is using a stack and then filling it out and popping.

        //Recursive method.
        //base condition to end program.
        if(head == null || head.next == null){
            return head;
        }
        //travel recusively to get to the last element and rach base condition.
        ListNode newHead = reverseList(head.next);

        //At each iteration head is the current element.
        ListNode front = head.next;

        //Solve for 2 elements to get this.
        front.next = head;
        head.next = null;

        //return the same head.start of reverse
        return newHead;

    }

}

