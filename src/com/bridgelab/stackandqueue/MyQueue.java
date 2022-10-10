package com.bridgelab.stackandqueue;
import java.util.LinkedList;
public class MyQueue {
    LinkedList<Integer> newlist = new LinkedList<Integer>();

    public void enQueue(Integer Data) {
        newlist.addLast(Data);
    }

    public void PrintQueue() {
        System.out.println(newlist);
    }

    //Adding Main method in same class
    public static void main(String[] args) {
        //Queue Program
        MyQueue myQueue = new MyQueue();

        myQueue.enQueue(56);
        myQueue.enQueue(30);
        myQueue.enQueue(70);

        myQueue.PrintQueue();
    }
}
