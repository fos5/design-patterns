package behavioural_patterns.state_pattern.canvas_example;

public class CanvasRunner {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();

        canvas.setCurrentTool(new ArrowTool());

        canvas.mouseUp();
        canvas.mouseDown();

        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseUp();
        canvas.mouseDown();
    }
}
