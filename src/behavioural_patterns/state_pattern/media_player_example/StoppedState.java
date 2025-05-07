package behavioural_patterns.state_pattern.media_player_example;

public class StoppedState implements State {
    @Override
    public void play(MediaPlayer mediaPlayer) {
        System.out.println("Media is now playing.");
        mediaPlayer.setCurrentState(new PlayState());
    }

    @Override
    public void pause(MediaPlayer mediaPlayer) {
        System.out.println("Cannot pause. Not playing.");
    }

    @Override
    public void stop(MediaPlayer mediaPlayer) {
        System.out.println("Already stopped.");
    }
}
