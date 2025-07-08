package com.sumantakumar.dev;

public class Stack {
    Node head;
    int stackSize;
    int size;


    public Stack(int size){
        this.stackSize = size;
    }


    public boolean isEmpty(){
        return head == null;
    }

    public boolean isFull(){
        return size == stackSize;
    }

    public void push(int value){
        if(!isFull()){
            insertNode(value);
        }else{
            System.out.println("MAX size");
        }
    }


    private void insertNode(int value){
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }else {
            Node tempNode = head;
            head = head.next;
            size--;
            return tempNode.data;
        }
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }else {
            return head.data;
        }
    }

    public void delete(){
        head = null;
    }

    public int size(){
        return size;
    }




}

class Node{
    int data;
    Node next;

}
