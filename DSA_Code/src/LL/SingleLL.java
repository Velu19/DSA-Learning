package LL;

public class SingleLL
{

    static class Node{
        int data;
        Node front;

        public Node(int data){
            this.data = data;
            this.front = null;
        }

        public Node(int data, Node front){
            this.data = data;
            this.front = front;
        }
    }

    static Node createLLFromArr(int[] arr){

        //create head
        Node head = new Node(arr[0]);

        Node prev = head;
        for(int i =1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            //create front link.
            prev.front = temp;
            prev = temp;
        }

        return head;
    }

    static void printLL(Node head){
        //never tamper head.
        //store it in temp.
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + "  ");
            temp = temp.front;
        }
        System.out.println("");

    }

    static Node deleteHead(Node head){
        if(head == null || head.front == null){
            return null;
        }
        //never tamper head.
        //store it in temp.

        Node newHead = head.front;
        head.front = null;
        return newHead;
    }

    private static Node deleteTail(Node head) {
        if(head == null || head.front == null){
            return null;
        }
        //never tamper head.
        //store it in temp.
        Node temp = head;
        while (temp.front.front != null){
            temp = temp.front;
        }

        temp.front = null;

        return head;
    }

    private static Node deleteKthElement(Node head, int i) {
        if(head == null){
            return null;
        }

        if(i==1){
            Node newHead = deleteHead(head);
            return newHead;
        }
        int count = 0;
        Node temp = head;
        Node prev = null;

        while (temp != null){
            count++;

            if(count == i){
                prev.front = temp.front;
                temp.front = null;
                break;
            }

            prev = temp;
            temp = temp.front;

        }

        return head;
    }

    private static Node insertHead(Node head , int element) {
        if(head == null){
            return new Node(element);
        }

        return new Node(element,head);
    }

    private static Node insertTail(Node head , int element) {
        if(head == null){
            return new Node(element);
        }
        Node temp = head;
        while (temp.front != null){
            temp = temp.front;
        }

        Node tail = new Node(element);
        temp.front = tail;

        return head;
    }

    private static Node insertKthPosition(Node head, int element, int pos) {
        if(pos == 1){
            return insertHead(head , element);
        }

        int count = 0;
        Node temp = head;
        while (temp != null){
            count++;
            if(pos-1 == count){
                Node kthNode = new Node(element,temp.front);
                temp.front = kthNode;
                break;
            }
            temp = temp.front;
        }

        return head;
    }



    public static void main(String[] args){

        int[] arr = {1,2,3,9,5};
        Node head = createLLFromArr(arr);
//        printLL(head);
//        head = deleteHead(head);
//        printLL(head);
//        head = deleteTail(head);
//        printLL(head);
//         head = deleteKthElement(head , 5 );
//         printLL(head);
         head = insertHead(head,10);
         printLL(head);
//         head = insertTail(head,100);
//         printLL(head);
         head = insertKthPosition(head,100 , 7);
         printLL(head);

    }



}
