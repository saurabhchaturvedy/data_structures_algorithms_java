package main.java.DoublyLinkedList;

public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;

    private static class ListNode
    {
        private int data;
        private ListNode next;
        private ListNode previous;

        ListNode(int data)
        {
            this.data = data;
        }
    }

    DoublyLinkedList()
    {
        this.head = null;
        this.tail = null;
        length = 0;
    }

    public int getLength()
    {
        return length;
    }

    public boolean isEmpty()
    {
        return length==0;
    }

    private void printForward()
    {

        ListNode current = head;
        while(current!=null)
        {

            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.print("null");

    }

    private void printBackward()
    {
        ListNode current = tail;
        while(current!=null)
        {

            System.out.print(current.data+" -> ");
            current = current.previous;
        }
        System.out.print("null");
    }

    private void insertFirst(int data)
    {

        ListNode newNode = new ListNode(data);

        if(isEmpty())
        {
            tail = newNode;
        }
        else
        {
            head.previous = newNode;
        }

        newNode.next = head;
        head = newNode;
        length++;
    }

    private void insertAtEnd(int data)
    {

        ListNode newNode = new ListNode(data);

        if(isEmpty())
        {

            head = newNode;
        }
        else
        {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    private ListNode deleteFirstNode()
    {

        ListNode temp = head;
        if(head==tail)
        {
            tail = null;
        }
        else
        {
            head.next.previous = null;
        }

        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }


    private void insertNodeAtIndex(int index,int data)
    {
        //3 -> 2
        ListNode current = head;
        ListNode newNode = new ListNode(data);
        int count=0;
        while(count<index-1)
        {

            count++;
            current = current.next;

        }
        // 800
        ListNode current_previous_next = current.next;
        current.next = newNode;
        newNode.previous = current;
        newNode.next = current_previous_next;
        length++;
    }



    public static void main(String[] args) {

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertFirst(10);
        doublyLinkedList.insertFirst(20);
        doublyLinkedList.insertFirst(30);
        doublyLinkedList.insertFirst(40);
        doublyLinkedList.insertFirst(50);
        doublyLinkedList.insertAtEnd(80);
        doublyLinkedList.insertNodeAtIndex(3,800);
        ListNode listNode = doublyLinkedList.deleteFirstNode();
       // doublyLinkedList.head = listNode;
        doublyLinkedList.printForward();
        System.out.println();
        doublyLinkedList.printBackward();

    }
}
