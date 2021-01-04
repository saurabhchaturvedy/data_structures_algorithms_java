package main.java.Stack;

import java.util.Stack;

public class PostFixStack {




    private static int evaluatePostFix(String str)
    {
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<str.length(); i++)
        {
           char c = str.charAt(i);

           if(!Character.isDigit(c))
           {
               Integer x = stack.pop();
               Integer y = stack.pop();

               switch(c)
               {
                   case '+' : stack.push(y+x); break;
                   case '-' : stack.push(y-x); break;
                   case '*' : stack.push(y*x); break;
                   case '/' : stack.push(y/x); break;
               }
           }
           else
           {
               stack.push(Character.getNumericValue(c));
           }

        }
        return stack.pop();
    }

    public static void main(String[] args) {

        String str = "946*+4-";
        System.out.println(evaluatePostFix(str));
    }
}
