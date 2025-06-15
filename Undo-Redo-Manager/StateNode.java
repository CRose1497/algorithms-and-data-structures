public class StateNode<T> {
    T data;
    StateNode<T> prev;
    StateNode<T> next;

    public StateNode(T data) {
        this.data = data;
    }
}
