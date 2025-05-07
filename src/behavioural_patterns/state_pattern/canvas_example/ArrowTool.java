package behavioural_patterns.state_pattern.canvas_example;

public class ArrowTool implements States {
    @Override
    public void onMouseUp() {
        System.out.println("ArrowTool: Mouse Up");
    }

    @Override
    public void onMouseDown() {
        System.out.println("ArrowTool: Mouse Down");
    }
}
