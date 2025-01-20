package Stack;

import java.util.*;

public class ReverseAStack {
    public static void pushbottom(Stack<Integer> s,int k)
    {
        if(s.isEmpty())
        {
            s.push(k);
            return;
        }
        int top=s.pop();
        pushbottom(s, k);
        s.push(top);
    }

    public static void reverse(Stack<Integer>s){
        if(s.isEmpty())
        {
            return;
        }
        int top=s.pop();
        reverse(s);
        pushbottom(s, top);
    }
    public static void main(String[] args)
    {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
