package singlylinkedlist;

public class SinglyLinkedList {
    Node first; //Head of the linked list as null(Engine of train)

    public SinglyLinkedList() {
    }

    public boolean isEmpty() {
        if (first == null)
            return true;
        return false;
    }

    public void insertFirst(int data) {
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = first;
        first = new_node;
    }

    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void printLinkedList() {
        System.out.println("Printing List from First to Last: ");
        Node current = first;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void insertLast(int data) {
        if (isEmpty()) {
            return;
        } else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            //This is the last node as current will be null here
            Node last_node = new Node();
            last_node.data = data;
            current.next = last_node;
        }
    }

    private int getLength() {
        int length = 0;
        Node currentNode = first;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }

    public void insertAtMiddle(int data) {
        int length = getLength();
        int middleElement = length / 2;

        insertAtAnyPosition(data, middleElement);
    }

    public void insertAtAnyPosition(int data, int position) {
        int counter = 0;
       Node currentNode = first;
        //Traverse to immediate previous node where we need to insert element
        for (int i = 0; i < (position - 1); i++) {
//            System.out.println(i);
            currentNode = currentNode.next; //This is the previous node
        }
        //Create the new node initialized with data and next as null
        Node newNode = new Node();
        newNode.data = data;

        //Start Linking the new node with next and previous node
        newNode.next = currentNode.next; //New node next is assigned with current node next

        currentNode.next = newNode; //Current Node next is assigned with new node
    }

}
