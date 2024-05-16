package singlylinkedlist;

public class App {
    public static void main(String[] args) {
        //Individual Node Object without linking
        Node nodeA = new Node();
        nodeA.data = 4;

        Node nodeB = new Node();
        nodeB.data = 3;

        Node nodeC = new Node();
        nodeC.data = 8;

        Node nodeD = new Node();
        nodeD.data = 7;

        //Linking Done here
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

//        System.out.println(getLength(nodeA));
//        System.out.println(getLength(nodeB));

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(5);
        singlyLinkedList.insertFirst(7);
        singlyLinkedList.insertFirst(15);
        singlyLinkedList.insertFirst(25);
        singlyLinkedList.insertFirst(52);

        singlyLinkedList.printLinkedList();

        //singlyLinkedList.deleteFirst();
        singlyLinkedList.insertLast(332);

        singlyLinkedList.printLinkedList();

        singlyLinkedList.insertAtAnyPosition(12, 3);

        singlyLinkedList.insertAtAnyPosition(9999, 5);

        System.out.println("--------------------");

        singlyLinkedList.printLinkedList();

        System.out.println("--------------------");
        singlyLinkedList.insertAtMiddle(111111);

        singlyLinkedList.printLinkedList();

    }

    public static int getLength(Node node) {
        int length = 1;

        Node currentNode = node;

        while (currentNode.next != null) {
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }
}
