package behavioural_patterns.memento_pattern;

public class TextEditorRunner {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        TextEditorHistory textEditorHistory = new TextEditorHistory();

        textEditor.write("Hello");
        textEditorHistory.save(textEditor);
        String content = textEditor.getContent();
        System.out.println(content);

        textEditor.write(" World");
        textEditorHistory.save(textEditor);
        System.out.println(textEditor.getContent());

        textEditor.write("!");
        System.out.println(textEditor.getContent());

        textEditorHistory.undo(textEditor);
        System.out.println(textEditor.getContent());

        textEditorHistory.undo(textEditor);
        System.out.println(textEditor.getContent());
    }
}
