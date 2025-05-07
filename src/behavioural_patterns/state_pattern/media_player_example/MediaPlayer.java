package behavioural_patterns.state_pattern.media_player_example;

public class MediaPlayer {
    private State currentState;

    public MediaPlayer() {
        this.currentState = new StoppedState();
    }

    public void setCurrentState(State state) {
        this.currentState = state;
    }
    public  State getCurrentState() {
        return currentState;
    }
    public void play() {
        currentState.play(this);
    }
    public void pause() {
        currentState.pause(this);
    }
    public  void stop() {
        currentState.stop(this);
    }

    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        player.play();
        player.pause();
        player.play();
        player.stop();

    }
}
