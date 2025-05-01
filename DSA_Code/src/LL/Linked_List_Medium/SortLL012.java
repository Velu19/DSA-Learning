package LL.Linked_List_Medium;

public class SortLL012 {

     class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    Node segregate(Node head) {

        if(head == null || head.next == null){
            return head;
        }

        Node dummyZero = new Node(-1);
        Node dummyOne = new Node(-1);
        Node dumyTwo = new Node(-1);

        //To not change the heads.
        Node zero = dummyZero;
        Node one = dummyOne;
        Node two = dumyTwo;

        //To traverse without changing the head.
        Node temp = head;

        while(temp!=null){
            if(temp.data == 0){
                zero.next = temp;
                zero = temp;
            }else if(temp.data == 1){
                one.next = temp;
                one = temp;
            }else{
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }

        //check if 1 or 2 links actually exits and map them.
        if(dummyOne.next == null){
            zero.next = dumyTwo.next;
        }else{
            zero.next = dummyOne.next;
        }

        one.next = dumyTwo.next;
        two.next = null;

        return dummyZero.next;


    }

}
