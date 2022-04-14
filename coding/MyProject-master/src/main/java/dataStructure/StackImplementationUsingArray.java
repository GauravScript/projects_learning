package dataStructure;

public class StackImplementationUsingArray {
    int stack[] = new int[20];
    int top = 0;
    int size = 0;

    public void push(int data) {
        stack[top] = data;
        top++;
        size++;
    }

    public int pop() {
        top--;
        int data = stack[top];
        stack[top] = 0;

        size--;
        return data;
    }

    public void peek() {
        int peek = stack[top-1];
        System.out.println(peek);
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0)
            return true;
        else return false;
    }

    public void displayStack() {
        for(int i=0;i<size;i++){
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        StackImplementationUsingArray ob=new StackImplementationUsingArray();
        ob.push(10);
        ob.push(20);
        ob.push(30);
        ob.push(40);
        System.out.println("Top element peek >>>");
        ob.peek();
        System.out.println("Display Full Stack>>>");
        ob.displayStack();
        System.out.println("Pop element ");
        ob.pop();
        System.out.println("Display Full Stack after pop>>>");
        ob.displayStack();

    }


}
