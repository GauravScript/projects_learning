package dataStructure;

import java.util.NoSuchElementException;

public class QueueUsingLinkedList {
    Node front;
    Node rear;
    int length;

    public QueueUsingLinkedList() {
        front = rear = null;
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

    public void enqueue(int data) {

        Node node = new Node(data);
        if (isEmpty())
            front = node;
        else
            rear.next = node;
        rear = node;
        length++;
    }

    public boolean isEmpty() {
        if (length == 0)
            return true;
        else
            return false;
    }

    public int length(){
        return length;
    }

    public int dequeue() {
        if(isEmpty()){
            throw new NoSuchElementException("Queue is already Empty");
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        length--;
        return data;
    }

    public void displayQueue() {
        Node temp = front;
        System.out.print("Front--");
        while (temp != null) {
            System.out.print(temp.data + "--");
            temp = temp.next;
        }
        System.out.println("Rear");
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(6);
        queue.displayQueue();
        System.out.print("length of queue now >>"+queue.length());


    }
}
