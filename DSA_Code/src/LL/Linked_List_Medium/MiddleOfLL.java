package LL.Linked_List_Medium;

public class MiddleOfLL {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    //Brute force.
    // int getCount(ListNode head){
    //     //never tamper head.
    //     //store it in temp.
    //     ListNode temp = head;

    //     int count = 0;

    //     while (temp != null){
    //         temp = temp.next;
    //         count++;
    //     }

    //     return count;
    // }

    // ListNode getMiddle(ListNode head, int pos){
    //     ListNode temp = head;

    //     int count = 0;

    //     while (temp != null){
    //         count++;
    //         if(count == pos){
    //             return temp;
    //         }
    //         temp = temp.next;

    //     }

    //     return null;
    // }


    //Fast pointers
    ListNode getMiddle(ListNode head){
        ListNode middle = head;
        ListNode hare = head;

//        when size = odd fast is at last element
//        when size == even is at null.
        while (hare != null && hare.next != null){
            middle = middle.next;
            hare = hare.next.next;
        }

        return middle;
    }

    public ListNode middleNode(ListNode head) {
        // int count = getCount(head);

        // ListNode middle = getMiddle(head,(count/2) + 1);

        return getMiddle(head);
    }
}
