package LinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedListTest sll = new SingleLinkedListTest();

        // Insert some nodes into the list
        sll.insertLinkedList(1, 0);
        sll.insertLinkedList(2, 1);
        sll.insertLinkedList(3, 2);
        sll.insertLinkedList(4, 3);

        System.out.println("List before deleting:");
        sll.traverseLinkedList();

        // Try deleting a node in the middle
        sll.delete(2); 

        System.out.println("List after deleting at position 2:");
        sll.traverseLinkedList();

        // Try searching for a value
        sll.searchNode(4);
    }
}
