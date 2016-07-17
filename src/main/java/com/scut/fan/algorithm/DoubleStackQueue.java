package com.scut.fan.algorithm;

import java.util.Stack;

/**
 * Created by FAN on 2016/7/7.
 */
public class DoubleStackQueue {
    Stack<Integer> stack1=new Stack<Integer>();
    Stack<Integer> stack2=new Stack<Integer>();
    public void push(int node){
        stack1.push(node);
    }
    public int pop(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
