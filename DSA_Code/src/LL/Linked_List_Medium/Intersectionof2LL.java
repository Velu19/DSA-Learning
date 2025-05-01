package LL.Linked_List_Medium;

public class Intersectionof2LL {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }



    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {


        ListNode temp1 = headA;
        ListNode temp2 = headB;

        //What if the nodes are not intersected.
        //The nodes will be colliding at null actually.
        //T1 will end at null. T2 will also end at null.
        //what if one list is null and other is of 7 elements.
        //Then we will switch headA to headB in the first step itself.
        while(temp1 != temp2 ){
            if(temp1 == null){
                temp1 = headB;
            }else{
                temp1 = temp1.next;
            }
            if(temp2 == null){
                temp2 = headA;
            }else{
                temp2 = temp2.next;

            }
        }

        return temp1;


    }
}
