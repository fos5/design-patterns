package behavioural_patterns.memento_pattern;

public class TextEditor {
    private String content = "";

    public  void write(String text){
        content += text;
    }

    public String getContent() {
        return content;
    }

    public TextEditorState save(){
        return new TextEditorState(content);
    }

    public void restore(TextEditorState textEditorState){
        this.content = textEditorState.content();
    }


    public record TextEditorState(String content) {
    }
}
