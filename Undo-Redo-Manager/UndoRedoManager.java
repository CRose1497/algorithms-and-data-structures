public class UndoRedoManager<T> {
    private StateNode<T> current;

    public void addState(T newState) {
        StateNode<T> newNode = new StateNode<>(newState);
        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }
        current = newNode;
    }

    public T undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            return current.data;
        }
        System.out.println("Cannot undo.");
        return null;
    }

    public T redo() {
        if (current != null && current.next != null) {
            current = current.next;
            return current.data;
        }
        System.out.println("Cannot redo.");
        return null;
    }

    public T getCurrentState() {
        return current != null ? current.data : null;
    }
}
