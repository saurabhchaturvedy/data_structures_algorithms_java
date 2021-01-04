package main.java.Stack;

public class Stack {

    private ListNode top;
    int length;

    private static class ListNode
    {
        private int data;
        private ListNode next;

        ListNode(int data)
        {
            this.data = data;
        }
    }

    Stack()
    {
        top = null;
        length = 0;
    }


    private void push(int data)
    {
     ListNode temp = new ListNode(data);
     temp.next = top;
     top = temp;
     length++;
    }

    private int pop()
    {
        int result = top.data;
        top = top.next;
        length--;
        return result;

    }

    private void print()
    {

        ListNode current = top;
        while(top!=null)
        {
            System.out.print(top.data+"-->");
            top = top.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(3);
        stack.push(7);

        stack.print();
    }
}
