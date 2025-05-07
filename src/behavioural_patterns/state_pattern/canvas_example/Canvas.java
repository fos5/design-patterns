package behavioural_patterns.state_pattern.canvas_example;

public class Canvas {
    private States currentTool;

    public void mouseDown(){
        currentTool.onMouseDown();
    }

    public void mouseUp(){
        currentTool.onMouseUp();
    }

    public States getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(States currentTool) {
        this.currentTool = currentTool;
    }
}
