package behavioural_design_pattern.momentopattern;

import java.util.Stack;

/**
 * Caretaker: Manages the history (the "Undo" stack) but never modifies the Memento.
 */
public class TextEditorHistory {

    private Stack<TextEditorMemento> history;
    public TextEditorHistory() {
        this.history = new Stack<>();
    }
    public void saveState(TextEditorMemento memento) {
        history.push(memento);
    }
    public TextEditorMemento restoreState() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
