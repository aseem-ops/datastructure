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
        Node node = new Node();
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

}
