package LL.Linked_List_Medium;

public class SortLinkedList {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    ListNode merge(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(temp1 != null && temp2 != null ){
            if(temp1.val < temp2.val){
                temp.next = temp1;
                temp = temp.next;
                temp1 = temp1.next;
            }else{
                temp.next = temp2;
                temp = temp.next;
                temp2 = temp2.next;
            }
        }

        if(temp1 == null){
            temp.next = temp2;
        }else{
            temp.next = temp1;
        }

        return dummy.next;
    }

    ListNode findMiddle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        //In order to split evenly for even size arrays.
        //Just like the same concept in DeleteMiddle and Palindrome LinkedList
        fast = fast.next.next;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        if(fast == null){
            return slow;
        }
        else{
            return slow.next;
        }
    }

    //see the pointers carefully
    //why are we setting middle.next as null.(Very Important)
    //You got very confused with the last return statment and it's function.
    ListNode mergeSort(ListNode head){

        if(head == null || head.next == null) return head;

        ListNode middle = findMiddle(head);
        ListNode rightHalf = middle.next;
        middle.next = null;

        ListNode leftHead = mergeSort(head);
        ListNode rightHead = mergeSort(rightHalf);

        return merge(leftHead,rightHead);
    }

    //Brute force is taking each element and putting it into array.
    //and then sorting it and inserting back again.
    public ListNode sortList(ListNode head) {

        //most optimal solution is using merge sort.
        return mergeSort(head);

    }
}
