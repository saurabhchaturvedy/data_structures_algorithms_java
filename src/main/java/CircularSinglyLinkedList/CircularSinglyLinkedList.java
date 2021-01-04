package main.java.CircularSinglyLinkedList;

public class CircularSinglyLinkedList {


    private ListNode last;
    private int length;

    private static class ListNode
    {
        private int data;
        private ListNode next;

        ListNode(int data)
        {
            this.data = data;
        }

    }


    CircularSinglyLinkedList()
    {
        last = null;
        length = 0;
    }

    private boolean isEmpty()
    {
        return length==0;
    }

    private int length()
    {
        return length;
    }

    private void createCircularLinkedList()
    {
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;
        last = fourth;

    }

    private void print()
    {
        ListNode first = last.next;
        while(first!=last)
        {
            System.out.print(first.data+"-->");
            first = first.next;
        }
        System.out.print(first.data);
    }

    private int lengthCL()
    {
        ListNode first = last.next;
        int count=1;
        while(first!=last)
        {
            count++;
            first = first.next;
        }
        return count;
    }

    private void insertNodeAtBeginning(int data)
    {
        ListNode newNode = new ListNode(data);
        ListNode lastNodePrevNext = last.next;
        last.next = newNode;
        newNode.next = lastNodePrevNext;
    }

    private void insertNodeAtEnd(int data)
    {
        ListNode newNode = new ListNode(data);
        ListNode lastFirst = last.next;
        last.next = newNode;
        newNode.next = lastFirst;
        last = newNode;

    }

    private void removeFirstNode()
    {
         ListNode first = last.next;
         last.next = first.next;
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
        circularSinglyLinkedList.createCircularLinkedList();
        circularSinglyLinkedList.insertNodeAtBeginning(55);
        circularSinglyLinkedList.insertNodeAtEnd(65);
        circularSinglyLinkedList.removeFirstNode();
        circularSinglyLinkedList.print();
        System.out.println("length of CL is "+circularSinglyLinkedList.lengthCL());
    }
}
