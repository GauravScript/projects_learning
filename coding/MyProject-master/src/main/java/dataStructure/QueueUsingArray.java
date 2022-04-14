package dataStructure;

public class QueueUsingArray {
    int queue[];
    int front, capacity;
    int rear;

    public QueueUsingArray(int c) {
        front = 0;
        rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    public void enqeueue(int data) {
        if (capacity == rear) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear] = data;
        rear++;
    }

    public int deqeueue() {
        if (front == rear) {
            return 0;
        }
        int data = queue[front];
        front++;
        return data;
    }
    public void display() {
        System.out.print("FRONT -->");
        for(int i=front;i<rear;i++){
            System.out.print(queue[i]+"--");
        }
        System.out.print("REAR");
    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(50);
        queue.enqeueue(10);
        queue.enqeueue(20);
        queue.enqeueue(40);
        queue.enqeueue(15);
        queue.enqeueue(14);
        queue.enqeueue(15);
        queue.enqeueue(13);
        queue.deqeueue();
        queue.deqeueue();
        queue.display();


    }
}
