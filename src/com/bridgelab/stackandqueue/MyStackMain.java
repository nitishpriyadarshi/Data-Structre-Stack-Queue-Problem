package com.bridgelab.stackandqueue;

public class MyStackMain {
    public static void main(String[] args) {

        MyStack mystack = new MyStack();
        mystack.Push(56);
        mystack.Push(30);
        mystack.Push(70);

        mystack.PrintStack();

        mystack.peek();
        mystack.pop();

        mystack.PrintStack();
    }
}
