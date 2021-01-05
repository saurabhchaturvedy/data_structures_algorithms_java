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

    private boolean findNode(int data)
    {
        if(head==null) return false;

        ListNode current = head;
        while (current!=null)
        {
            if(current.data==data) return true;
            current = current.next;
        }
        return false;
    }

    private ListNode reverse()
    {
        if(head==null) return null;

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current!=null)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }

        return previous;
    }

    private ListNode getMiddleNode()
    {
        ListNode firstPtr = head;
        ListNode secondPtr = head;

        while (firstPtr!=null && firstPtr.next!=null)
        {
            secondPtr = secondPtr.next;
            firstPtr = firstPtr.next.next;
        }

        return secondPtr;
    }

    private ListNode findNthFromEnd(int n)
    {
        if(head==null) return null;

        if(n<0)
            throw new IllegalArgumentException("Value of n can't be -ve");

        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;

        while(count<n)
        {

            refPtr = refPtr.next;
            count++;
        }

        while (refPtr!=null)
        {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }

        return mainPtr;
    }

    private void removeDuplicateFromSorted()
    {

        ListNode current = head;

        while(current!=null && current.next!=null)
        {
            if(current.data==current.next.data)
            {
                current.next = current.next.next;
            }
           current = current.next;
        }
    }

    private void insertInSortedList(int data)
    {
        ListNode newNode = new ListNode(data);
        ListNode current = head;

        while (current!=null && current.next!=null)
        {
            if(data<current.data && data>current.next.data)
            {
                ListNode currentNext = current.next;
                current.next = newNode;
                newNode.next = currentNext;
            }
            current = current.next;
        }
    }

    private void removeNode(int data)
    {
        ListNode current = head;
        if(head.data==data)
        {
            head = head.next;
            return;
        }

        while (current!=null && current.next!=null)
        {
            if(current.next.data==data)
            {
                current.next = current.next.next;
            }
            current = current.next;
        }
    }

    private boolean hasLoop()
    {
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while(fastPtr!=null && fastPtr.next!=null)
        {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr==fastPtr) return true;
        }
        return false;
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

        singlyLinkedList.insertFirst(5);
        singlyLinkedList.insertLast(50);

       // singlyLinkedList.insertAtNth(4,30);
        //singlyLinkedList.deleteFirst();
       // singlyLinkedList.deleteLast();
      //  singlyLinkedList.deleteAtPosition(4);
        singlyLinkedList.display();

        System.out.println("Length of linked list is : "+singlyLinkedList.length());
        System.out.println("is node found ? "+singlyLinkedList.findNode(86));

        ListNode reverse = singlyLinkedList.reverse();
        singlyLinkedList.head = reverse;
        singlyLinkedList.display();
        System.out.println("Looking for any duplicates in the list...");
        singlyLinkedList.removeDuplicateFromSorted();
        singlyLinkedList.display();
        singlyLinkedList.insertInSortedList(25);
        singlyLinkedList.removeNode(50);
        singlyLinkedList.display();

        System.out.println("Middle element is : "+singlyLinkedList.getMiddleNode().data);
        System.out.println("4th node from the end is : "+singlyLinkedList.findNthFromEnd(4).data);
        System.out.println("Linked list has loop: "+singlyLinkedList.hasLoop());
    }
}
