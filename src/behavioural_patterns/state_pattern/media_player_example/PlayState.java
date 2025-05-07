package behavioural_patterns.state_pattern.media_player_example;

public class PlayState implements State {
    @Override
    public void play(MediaPlayer mediaPlayer) {
        System.out.println("Already playing");
    }

    @Override
    public void pause(MediaPlayer mediaPlayer) {
        System.out.println("Pausing playback...");
        mediaPlayer.setCurrentState(new PauseState());
    }

    @Override
    public void stop(MediaPlayer mediaPlayer) {
        System.out.println("Stopping playback...");
        mediaPlayer.setCurrentState(new StoppedState());
    }
}
