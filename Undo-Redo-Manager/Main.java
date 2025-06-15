public class Main {
    public static void main(String[] args) {
        UndoRedoManager<String> manager = new UndoRedoManager<>();

        manager.addState("State 1");
        manager.addState("State 2");
        manager.addState("State 3");

        System.out.println("Current: " + manager.getCurrentState()); // State 3
        manager.undo();
        System.out.println("After undo: " + manager.getCurrentState()); // State 2
        manager.undo();
        System.out.println("After undo: " + manager.getCurrentState()); // State 1
        manager.redo();
        System.out.println("After redo: " + manager.getCurrentState()); // State 2
    }
}
