package LinkedList;

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // This creates the first node in the list
    public Node createSingleLinkedlist(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // This inserts a new node into the list at a given location
    public void insertLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;

        if (head == null) {
            createSingleLinkedlist(nodeValue);
            return;
        }

        if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
            node.next = null;
        } else {
            Node temp = head;
            int index = 0;
            while (index < location - 1) {
                temp = temp.next;
                index++;
            }
            node.next = temp.next;
            temp.next = node;
        }

        size++;
    }

    // This deletes a node at a specific position in the list
    public void delete(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            head = head.next;
            if (size == 1) {
                tail = null;
            }
        } else {
            Node temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }

            Node nodeToDelete = temp.next;
            temp.next = nodeToDelete.next;

            if (position == size - 1) {
                tail = temp;
            }
        }

        size--;
    }

    // Just a method to see what's in the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
