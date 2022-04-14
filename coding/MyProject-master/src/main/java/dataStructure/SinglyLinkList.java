package dataStructure;

public class SinglyLinkList {

    //Creating List Node
    ListNode head; //for head node null

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Displaying Linkedlist
    public void displayLinkedList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " - - > ");
            current = current.next;
        }
        System.out.println("null");
    }

    //add node at start
    public void AddNodeAtStart(int data) {
        ListNode new_node = new ListNode(data);
        new_node.next = head;
        head = new_node;
    }

    //Add node at last
    public void AddNodeAtLast(int data) {
        ListNode last_node = new ListNode(data);
        //if head is null
        if (head == null) {
            head = last_node;
        }
        //traverse till last
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        //add at last
        current.next = last_node;

    }

    //Add node at Middle
    public void AddNodeAtMiddle(ListNode prev, int data) {
        if (prev == null) {
            System.out.println("Wrong input");
            return;
        }
        ListNode middle_node = new ListNode(data);
        middle_node.next = prev.next;
        prev.next = middle_node;
    }

    //delete head Node
    public ListNode deleteFirst(ListNode head){
        if(head==null){
            return null;
        }
        ListNode temp=head;
        head=head.next;
        temp.next=null;
        return head;
    }

    public static void main(String[] args) {
        SinglyLinkList singlyLinkList = new SinglyLinkList();
        //Creating individual nodes
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(9);
        ListNode third = new ListNode(6);
        ListNode fourth = new ListNode(1);

        //connecting nodes
        singlyLinkList.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;

        //printing Singly linkedlist
        System.out.println("Display First Setup of List >> ");
        singlyLinkList.displayLinkedList();
        //Add at beginning
        System.out.println("Add a node at beggining >> ");
        singlyLinkList.AddNodeAtStart(5);
        singlyLinkList.displayLinkedList();
        //Add at Middle
        System.out.println("Add a node at middle >> ");
        singlyLinkList.AddNodeAtMiddle(second, 2);
        singlyLinkList.displayLinkedList();
        //Add at last
        System.out.println("Add a node at Last >> ");
        singlyLinkList.AddNodeAtLast(50);
        singlyLinkList.displayLinkedList();

        //Delete first
        System.out.println("Delete First Node >> ");
        ListNode deletedNode=singlyLinkList.deleteFirst(singlyLinkList.head);
        System.out.println(deletedNode.data);



    }
}
