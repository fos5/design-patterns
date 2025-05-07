package behavioural_patterns.state_pattern.canvas_example;

public class SelectionTool implements States {
    @Override
    public void onMouseUp() {
        System.out.println("SelectionTool: Mouse Up");
    }

    @Override
    public void onMouseDown() {
        System.out.println("SelectionTool: Mouse Down");
    }
}
