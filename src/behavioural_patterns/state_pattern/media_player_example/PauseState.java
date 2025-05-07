package behavioural_patterns.state_pattern.media_player_example;

public class PauseState implements State {
    @Override
    public void play(MediaPlayer mediaPlayer) {
        System.out.println("Media resumed playing.");
        mediaPlayer.setCurrentState(new PlayState());
    }

    @Override
    public void pause(MediaPlayer mediaPlayer) {
        System.out.println("Already paused playback...");

    }

    @Override
    public void stop(MediaPlayer mediaPlayer) {
        System.out.println("Stopping playback...");
        mediaPlayer.setCurrentState(new StoppedState());
    }
}
