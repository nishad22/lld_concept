package behavioural_design_pattern.momentopattern;

/**
 * The "snapshot" (immutable storage of state).
 */
public class TextEditorMemento {

    private String text;
    public TextEditorMemento(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
}
