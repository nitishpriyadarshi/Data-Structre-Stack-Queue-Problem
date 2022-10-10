package com.bridgelab.stackandqueue;
import java.util.LinkedList;
public class MyStack {
    LinkedList<Integer>newlist =new LinkedList<Integer>();
    public void Push(Integer Data) {
        newlist.add(Data);
    }
    public void PrintStack() {
        System.out.println(newlist);
    }
}
