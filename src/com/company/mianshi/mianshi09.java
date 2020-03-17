package com.company.mianshi;

import java.util.Stack;

public class mianshi09 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int size;
    mianshi09(){
        stack1 = new Stack();
        stack2 = new Stack();
        size = 0;
    }

    public void appendTail(int value) {
        while (!stack1.empty())
            stack2.push(stack1.pop());
        stack1.push(value);
        while (!stack2.empty())
            stack1.push(stack2.pop());
        size++;
    }

    public int deleteHead() {
        if(stack1.empty())
            return -1;
        else
            return stack1.pop();
    }
}
