package behavioural_patterns.state_pattern.media_player_example;

public interface State {
    void play(MediaPlayer mediaPlayer);
    void pause(MediaPlayer mediaPlayer);
    void stop(MediaPlayer mediaPlayer);
}
