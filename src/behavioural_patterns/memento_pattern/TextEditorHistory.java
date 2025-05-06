package behavioural_patterns.memento_pattern;

import java.util.Stack;

public class TextEditorHistory {

   private final Stack<TextEditor.TextEditorState> history = new Stack<>();

   public void save(TextEditor textEditor) {
       history.push(textEditor.save());
   }

   public void undo(TextEditor textEditor){
        if (!history.isEmpty()){
            textEditor.restore(history.pop());
        }
   }
}
