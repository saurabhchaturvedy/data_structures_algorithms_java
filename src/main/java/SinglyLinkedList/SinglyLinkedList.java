package main.java.SinglyLinkedList;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode
    {
        private int data;
        private ListNode next;

        ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    private void display()
    {
        ListNode current = head;
        while(current!=null)
        {
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    private int length()
    {
        if(head==null) return 0;
        ListNode current = head;
        int count=0;
        while (current!=null)
        {
            count++;
            current=current.next;
        }

        return count;
    }

    private void insertFirst(int val)
    {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    private void insertLast(int val)
    {
        ListNode newNode = new ListNode(val);
        if(head==null)
        {
            head=newNode;
            return;
        }
        ListNode current = head;
        while(current.next!=null)
        {
            current = current.next;
        }

        current.next = newNode;
    }

    private void insertAtNth(int n,int data)
    {
        ListNode newNode = new ListNode(data);
        int count=1;
        ListNode current = head;
        while(count<n-1)
        {
            count++;
         current = current.next;

        }
        newNode.next = current.next;
        current.next = newNode;
    }

    private ListNode deleteFirst()
    {

        if(head==null)
        {
            return null;
        }

        ListNode temp = head;
        head = temp.next;
        temp.next = null;
        return temp;
    }

    private ListNode deleteLast()
    {

        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;

        while(current.next!=null)
        {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;

    }

    private void deleteAtPosition(int n)
    {

        ListNode current = head;
        ListNode previous = null;

        int count=0;

        while(count<=n-2)
        {
            previous = current;
            current = current.next;
            count++;
        }

        ListNode newConn = current.next;
        previous.next = newConn;

    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        singlyLinkedList.head.next = second;
        second.next = third;
        third.next = fourth;

        singlyLinkedList.insertFirst(50);
        singlyLinkedList.insertLast(85);
        singlyLinkedList.insertAtNth(3,77);
        //singlyLinkedList.deleteFirst();
       // singlyLinkedList.deleteLast();
        singlyLinkedList.deleteAtPosition(4);
        singlyLinkedList.display();

        System.out.println("Length of linked list is : "+singlyLinkedList.length());
    }
}
