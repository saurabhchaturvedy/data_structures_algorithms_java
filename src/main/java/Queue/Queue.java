package main.java.Queue;

import java.util.NoSuchElementException;

public class Queue {

    private ListNode front;
    private ListNode rear;
    private int length;

    private static class ListNode
    {
        private ListNode next;
        private int data;

        ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }

    }

    Queue()
    {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }
    private int length()
    {
        return length;
    }

    private boolean isEmpty()
    {
        return length==0;
    }

    private void enqueue(int data)
    {
        ListNode temp = new ListNode(data);
        if(isEmpty())
        {
            front = temp;
        }
        else
        {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

    private int dequeue()
    {
        if(isEmpty()) {
            throw new NoSuchElementException("Queue is already empty");
        }

        int result = front.data;
        front = front.next;
        if(front == null) {
            rear = null;
        }
        length--;
        return result;
    }

    private void print()
    {
        if(isEmpty())
        {
            return;
        }

        ListNode current = front;
        while(front!=null)
        {
            System.out.print(front.data+"--->");
            front = front.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
              Queue queue = new Queue();
              queue.enqueue(2);
              queue.enqueue(5);
              queue.enqueue(7);
              queue.dequeue();
              queue.print();
    }
}
