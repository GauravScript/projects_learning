package dataStructure;

import java.util.EmptyStackException;

public class StackImplementationUsingLinkedList {
    Node top;
    int length;

    public StackImplementationUsingLinkedList() {
        top = null;
        length = 0;
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) {
        Node newnode = new Node(data);
        newnode.next = top;
        top = newnode;
        length++;
    }

    public int pop(){
        int popped;
        if(isEmpty()){
            throw new EmptyStackException();
        }else{
            popped=top.data;
            top=top.next;
            length--;
        }
        return popped;
    }

    public int peek() {
        return top.data;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        if (length == 0) {
            return true;
        } else
            return false;
    }

    public void displayStack() {
       Node temp=top;
        System.out.print(" TOP -> ");
       while(temp!=null){
           System.out.print(temp.data +"-> ");
           temp=temp.next;
        }
        System.out.print("null ");
    }

    public static void main(String[] args) {
        StackImplementationUsingLinkedList ob = new StackImplementationUsingLinkedList();
        ob.push(10);
        ob.push(20);
        ob.push(30);
        ob.push(40);
        System.out.println("Top Element now???");
        System.out.println(ob.peek());
        System.out.println("Popped One element");
        System.out.println(ob.pop());
        System.out.println("Top After pop>>");
        System.out.println(ob.peek());
        System.out.println("length>>");
        System.out.println(ob.length());

        ob.displayStack();
    }


}

