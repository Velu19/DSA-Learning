package LL.Linked_List_Medium;

public class Add1toLL {


    class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }

    /** //helper for approach one.
     Node reverse(Node head){
     Node curr = head;
     Node prev = null;

     while(curr != null ){
     Node temp = curr.next;
     curr.next = prev;
     prev = curr;
     curr = temp;
     }

     return prev;
     }

     //two approaches one is reverse and iteration and then another one is recursive.
     //approach one:- reversive
     //Tc = O(n) + O(n) + O(n);
     public Node addOne(Node head) {
     if(head == null){
     return null;
     }
     // code here.
     int carry = 1;
     //reverse elements so that we can add from the units place.
     Node newHead = reverse(head);
     Node temp = newHead;

     while(temp != null){
     temp.data = temp.data+carry;
     if(temp.data < 10){
     return reverse(newHead);
     }
     temp.data = 0;
     carry = 1;
     temp=temp.next;
     }

     if(carry == 1){
     Node reverseHead = reverse(newHead);
     Node carryHead = new Node(1);
     carryHead.next =  reverseHead;
     return carryHead;
     }

     return reverse(newHead);
     } */


    //helper function for approach 2
    int helper(Node head){
        //reaches base condition and return 1
        if(head == null){
            return 1;
        }

        int carry = helper(head.next);

        if(carry == 0){
            return 0;
        }

        head.data = head.data+ carry;

        if(head.data < 10){
            return 0;
        }else{
            head.data = 0;
            return 1;
        }
    }


    //Approach 2
    //recursive approach to solve the problem.
    //Go until end recursively and solve the problem easily.
    public Node addOne(Node head) {
        if(head == null){
            return head;
        }
        int carry = helper(head);
        if(carry == 1){
            Node carryHead = new Node(1);
            carryHead.next =  head;
            return carryHead;
        }
        else{
            return head;
        }
    }





}
