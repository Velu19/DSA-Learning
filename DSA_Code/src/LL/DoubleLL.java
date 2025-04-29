package LL;

public class DoubleLL {

    static class ListNode{
        int data;
        ListNode back;
        ListNode front;


        public ListNode(int data){
            this.data = data;
            this.back = null;
            this.front = null;
        }

        public ListNode(int data, ListNode back, ListNode front){
            this.data = data;
            this.back = back;
            this.front = front;
        }
    }

    private static ListNode createFromArray(int[] arr){
        ListNode head = new ListNode(arr[0]);
        ListNode prev = head;

        for(int i = 1;i<arr.length;i++){
            ListNode temp = new ListNode(arr[i] , prev , null);
            prev.front = temp;
            prev = temp;
        }

        return head;
    }

    private static void printDLL(ListNode head) {

        if(head == null ){
            return;
        }

        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.front;
        }

        System.out.println();

    }

    private static int elemnetsCount(ListNode head){
        ListNode temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.front;
        }
        return count;
    }

    private static ListNode deleteFirst(ListNode head) {

        if(head == null || head.front == null){
            return  null;
        }

        ListNode newHead = head.front;
        newHead.back = null;
        head.front = null;

        return newHead;
    }

    private static ListNode deleteLast(ListNode head) {
        if(head == null || head.front == null){
            return  null;
        }
        ListNode prev = null;
        ListNode temp = head;
        while (temp.front != null){
            prev = temp;
            temp= temp.front;
        }

        prev.front = null;
        temp.back = null;

        return head;

    }

    //you forget this do revise.
    private static ListNode deleteKthNode(ListNode head, int k) {
        if(head == null){
            return null;
        }
        int count =0;
        ListNode temp = head;

        while (temp!=null){
            count++;
            if(count == k){
                break;
            }
            temp = temp.front;
        }

        ListNode prev = temp.back;
        ListNode next = temp.front;

        if(prev == null && next == null){
            return null;
        }
        if(prev == null){
            return deleteFirst(head);
        }
        if(next == null){
            return deleteLast(head);
        }

        prev.front = next;
        next.back = prev;

        temp.back = null;
        temp.front = null;

        return head;

    }

    private static ListNode insertFirst(ListNode head ,int ele) {
        ListNode temp = head;
        ListNode newHead = new ListNode(ele,null,temp);
        temp.back = newHead;

        return newHead;
    }

    private static ListNode insertLast(ListNode head, int ele) {
        ListNode temp = head;
        while(temp.front != null){
            temp = temp.front;
        }
        temp.front = new ListNode(ele, temp , null);

        return  head;
    }

    //read carefully it is before kth element. BEFORE
    private static ListNode insertBeforeKthElement(ListNode head, int ele, int k) {
        if(head == null){
            return  null;
        }

        if(k==1){
            return insertFirst(head,ele);
        }

        ListNode temp = head;
        int count =0;

        while (temp != null){
            count++;
            if(count == k){
                break;
            }
            temp = temp.front;
        }
        ListNode prev = temp.back;
        ListNode newNode = new ListNode(ele,prev,temp);
        prev.front = newNode;

        return head;

    }




    public static void main(String[] args){
        int[] arr = {1,2,3,19,5,6,7};

        ListNode head= createFromArray(arr);
        printDLL(head);
        System.out.println(elemnetsCount(head));
        head = deleteFirst(head);
        printDLL(head);

        head = deleteLast(head);
        printDLL(head);
        head = deleteKthNode(head , 6);
        printDLL(head);
        head = insertFirst(head,100);
        printDLL(head);
        head = insertLast(head, 100);
        printDLL(head);
        head = insertBeforeKthElement(head,100,9);
        printDLL(head);

    }




}
